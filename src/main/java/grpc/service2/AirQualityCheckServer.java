package grpc.service2;

import java.io.IOException;

import grpc.service2.AirQualityCheckGrpc.AirQualityCheckImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class AirQualityCheckServer extends AirQualityCheckImplBase {
	public static void main(String[] args) {
		AirQualityCheckServer serv2Airserver = new AirQualityCheckServer();
		int port = 50052;
		
		Server server;
		try {
			server = ServerBuilder.forPort(port).addService(serv2Airserver).build().start();
			System.out.println("Server 2 working");
			server.awaitTermination();
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

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
		return super.bidiOxygen(responseObserver);
		
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
			    String message = "Acording to the test " + value2[0];
			    airDataResponse response = airDataResponse.newBuilder().setAirDataRes(message).build();
			    responseObserver.onNext(response);
			    responseObserver.onCompleted();
			}
			
		};
	}
	
}
