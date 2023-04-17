package grpc.service2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.util.Properties;
import java.util.logging.Logger;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

import grpc.examples.bidirectionstreamstrings.StringRequest;
import grpc.examples.bidirectionstreamstrings.StringResponse;
import grpc.examples.bidirectionstreamstrings.StringServer;
import grpc.service2.AirQualityCheckGrpc.AirQualityCheckImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class AirQualityCheckServer extends AirQualityCheckImplBase {
	private static final Logger logger = Logger.getLogger(StringServer.class.getName());
	public static void main(String[] args) {
		AirQualityCheckServer serv2Airserver = new AirQualityCheckServer();
		//int port = 50052;
		// Registration
		//
		Properties prop = serv2Airserver.getProperties();
		serv2Airserver.registerService(prop);

		int port = Integer.valueOf(prop.getProperty("service_port"));// #.50052;
		Server server;
		//
		
		try {
			server = ServerBuilder.forPort(port).addService(serv2Airserver).build().start();
			System.out.println("Server 2 working");
			server.awaitTermination();
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}//
	private Properties getProperties() {

		Properties prop = null;

		try (InputStream input = new FileInputStream("src/main/resources/Serv2_AirQualityCheck.properties")) {
			prop = new Properties();

			// load a properties file
			prop.load(input);

			// get the property value and print it out
			System.out.println("Service 2 - Pollution WatchArea: ");
			System.out.println("\t service_type: " + prop.getProperty("service_type"));
			System.out.println("\t service_name: " + prop.getProperty("service_name"));
			System.out.println("\t service_description: " + prop.getProperty("service_description"));
			System.out.println("\t service_port: " + prop.getProperty("service_port"));

		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return prop;
	}

	private void registerService(Properties prop) {
		try {
			// Create a JmDNS instance
			JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

			String service_type = prop.getProperty("service_type");// "_http._tcp.local.";
			String service_name = prop.getProperty("service_name");// "service1";
			int service_port = Integer.valueOf(prop.getProperty("service_port"));// #.50052;

			String service_description_properties = prop.getProperty("service_description");// "path=index.html";

			// Registration service information
			ServiceInfo serviceInfo = ServiceInfo.create(service_type, service_name, service_port,
					service_description_properties);
			jmdns.registerService(serviceInfo);

			System.out.printf("registrering service with type %s and name %s \n", service_type, service_name);

			// Wait a bit for the service to register
			Thread.sleep(1000);

		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}//

	@Override
	public void neighbourhoodName(statusRequest request, StreamObserver<statusResponse> responseObserver) {
		// TODO Auto-generated method stub
		//super.neighbourhoodName(request, responseObserver);
		System.out.println("----- Receiving name of the neighbourhood from client -----");
		String answer = "The neighbourhood is not yet on file";
        String neigh1 = new String("Churchtown");
        String neigh2 = new String("Temple bar");
        String neigh3 = new String("Smithfield");
        String neigh4 = new String("Ranelagh");
        String neigh5 = new String("Portobello");
		if(request.getStatusReq().equals(neigh1)) {
			answer = "Air quality in Churchtown is GOOD (every individual can stay)";
		}
		if(request.getStatusReq().equals(neigh2)) {
			answer = "Air quality in Temple bar is UNHEALTHY (avoid prolonged exposure)";
		}
		if(request.getStatusReq().equals(neigh3)) {
			answer = "Air quality in Smithfield is MODERATE (extremely sensitive individuals limit stay)";
		}
		if(request.getStatusReq().equals(neigh4)) {
			answer = "Air quality in Ranelagh is GOOD (every individual can stay)";
		}
		if(request.getStatusReq().equals(neigh5)) {
			answer = "Air quality in Portobello is GOOD (every individual can stay)";
		}
		statusResponse response = statusResponse.newBuilder().setStatusRes("--- RPC 1 --- \nAcording to the data base: "+ answer).build();
		responseObserver.onNext( response ); 
		responseObserver.onCompleted();
	}

	@Override
	public StreamObserver<airOxygenRequest> bidiOxygen(StreamObserver<airOxygenResponse> responseObserver) {
		// TODO Auto-generated method stub
		//return super.bidiOxygen(responseObserver);
		return new StreamObserver<airOxygenRequest>() {

			@Override
			public void onNext(airOxygenRequest value) {
				// TODO Auto-generated method stub
				// In bidirectional stream, both server and  client would be sending the stream of messages.
				// Here, for each message in stream from client, server is sending back one response.
				// To calculate if the oxygen is healthy or not we use the next equation:
				// % O2 in air = (change in height of water in the burette/initial volume of air in the burette) x 100
						    

					StringBuilder value1 = new StringBuilder(); 
					float bef;
					float aft;
					float change;
					float initial;
					float calculation;
					String message = "";
					
					bef = value.getAirOxygenReqBef();
					aft = value.getAirOxygenReqAft();
					change = bef-aft;
					initial = 50-bef;
					calculation = (change/initial)*100;
					if(calculation<=23.55 && calculation>=19.5) {
				        message = "HEALTHY for humans" ;  
					}else {
						message = "UNHEALTHY for humans" ;  
					}
					
					
					value1.append((calculation)); 
					float value1AsFloat = Float.parseFloat(value1.toString());
					value1 = value1.reverse();
					// Preparing and sending the reply for the client. Here, response is build and with the value (input1.toString()) computed by above logic.
					airOxygenResponse response = airOxygenResponse.newBuilder().setAirOxygenResHea(message).setAirOxygenResPer(value1AsFloat).build();        					
				
		            responseObserver.onNext(response);
			}

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub
				//Log the error
				System.err.println("Error in BidiOxygen: " + t.getMessage());
	            // Send an error response to the client
	            responseObserver.onError(t);
			}

			@Override
			public void onCompleted() {
				// TODO Auto-generated method 
				responseObserver.onCompleted();
				
			}
		
		};
		
	}

	@Override
	public StreamObserver<airDataRequest> manyAirReadings(StreamObserver<airDataResponse> responseObserver) {
		// TODO Auto-generated method stub
		//return super.manyAirReadings(responseObserver);
		System.out.println("----- Waiting for the carbon monoxide and a ground level ozone readings from client -----");
		final int[] airCount = {0};
		final String[] value2 = {""};
		return new StreamObserver<airDataRequest>() {

			@Override
			public void onNext(airDataRequest value) {
				// TODO Auto-generated method stub
				if (value.getAirDataReqMon()>=6.5 && value.getAirDataReqMon()<=8) {
					airCount[0]++;
				}
				if (value.getAirDataReqOz()>=20 && value.getAirDataReqOz()<=31.67) {
					airCount[0]++;
				}
				if(airCount[0]==2) {
					value2[0] = "The air is clean";
				}else{
					value2[0] = "The air is polluted";
				}
			}

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub
				//Log the error
				System.err.println("Error in manyAirReadings: " + t.getMessage());
	            // Send an error response to the client
	            responseObserver.onError(t);
			}

			@Override
			public void onCompleted() {
				// TODO Auto-generated method stub
			    String message = "Calculating... " + value2[0];
			    airDataResponse response = airDataResponse.newBuilder().setAirDataRes(message).build();
			    responseObserver.onNext(response);
			    responseObserver.onCompleted();
			}
			
		};
	}
	
}
