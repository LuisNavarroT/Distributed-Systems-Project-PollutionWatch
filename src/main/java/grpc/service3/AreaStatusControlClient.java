package grpc.service3;

import java.net.InetAddress;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceListener;

import grpc.service3.AreaStatusControlGrpc.AreaStatusControlBlockingStub;
import grpc.service3.AreaStatusControlGrpc.AreaStatusControlStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

public class AreaStatusControlClient {
	private static AreaStatusControlBlockingStub blockingstub;
	private static AreaStatusControlStub asyncStub;
	//static String host= "_GRPCServ3._tcp.local.";//"localhost";
	//static int port; // 50053;
	//static String resolvedIP;
	
	public static void main(String[] args) {
		int port= 50053;
		String host= "localhost";
		//testClientJMDNS();
		ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
		blockingstub = AreaStatusControlGrpc.newBlockingStub(channel);
		asyncStub = AreaStatusControlGrpc.newStub(channel);
		
		//Method calls and channel shutdown
		riverHistoric();
		BidiRiver();
		BidiNeighbourhood();
		try {
			channel.shutdown().awaitTermination(5,TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			// Create a JmDNS instance
			JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

			// Add a service listener
			jmdns.addServiceListener("_GRPCServ3._tcp.local.", new SampleListener());

			// Wait a bit
            Thread.sleep(20000);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	
/*
	private static void testClientJMDNS() {
		// TODO Auto-generated method stub
		try {
			// Create a JmDNS instance
			JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

			// Add a service listener
			jmdns.addServiceListener("_GRPCServ3._tcp.local.", new SampleListener());

			// Wait a bit
            Thread.sleep(20000);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}*/
	private static class SampleListener implements ServiceListener {
		public void serviceAdded(ServiceEvent event) {
			System.out.println("Service added: " + event.getInfo());
		}
		public void serviceRemoved(ServiceEvent event) {
			System.out.println("Service removed: " + event.getInfo());
		}
		@SuppressWarnings("deprecation")
		public void serviceResolved(ServiceEvent event) {
					System.out.println("Service resolved: " + event.getInfo());
			
                   /* ServiceInfo info = event.getInfo();
                    port = info.getPort();
                    resolvedIP = info.getHostAddress();                    
                    System.out.println("IP Resolved - " + resolvedIP + ":" + port);*/
		}
	}

	
	public static void riverHistoric() {
		// TODO Auto-generated method stub
		// First creating a request message. Here, the message contains a string 
			riverDataRequest request = riverDataRequest.newBuilder().setRiverDataReq("Liffey").build();

				// Handling the stream from server using onNext (logic for handling each message in stream), onError, onCompleted (logic will be executed after the completion of stream)
				StreamObserver<riverDataResponse> responseObserver = new StreamObserver<riverDataResponse>() {

					int count =0 ;

					@Override
					public void onNext(riverDataResponse value) {
						System.out.println("receiving messages " + value);
						count += 1;
					}

					@Override
					public void onError(Throwable t) {
						t.printStackTrace();

					}

					@Override
					public void onCompleted() {
						System.out.println("stream is completed ... received "+ count+ " last days's river info");
					}

				};

				// Here, we are calling the Remote split method. On receiving the message from server the onNext, onError, onCompleted will be called (as defined above). 
				asyncStub.riverHistoric(request, responseObserver);


				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}


			}

			//blocking server-streaming
			public static void riverHistoricBlocking() {
				// First creating a request message. Here, the message contains a string in setVal
				riverDataRequest request = riverDataRequest.newBuilder().setRiverDataReq("Liffey").build();

				// as this call is blocking. The client will not proceed until all the messages in stream has been received. 
				try {
					// Iterating each message in response when calling remote split RPC method.
					Iterator<riverDataResponse> responces = blockingstub.riverHistoric(request);
					
					// Client keeps a check on the next message in stream.
					while(responces.hasNext()) {
						riverDataResponse temp = responces.next();
						System.out.println(temp.getRiverDataRes());				
					}

				} catch (StatusRuntimeException e) {
					e.printStackTrace();
				}
				
			}

	public static void BidiRiver() {
		// TODO Auto-generated method stub
		// Handling the server stream for client using onNext (logic for handling each message in stream), onError, onCompleted (logic will be executed after the completion of stream)
		StreamObserver<waterStatusResponse> waterReply = new StreamObserver<waterStatusResponse>() {

			@Override
			public void onNext(waterStatusResponse value) {

				System.out.println("Information requested: " + value.getWaterStatusRes());

			}

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onCompleted() {
				// TODO Auto-generated method stub
				System.out.println("River information request finished succesfully");
			}
		};

		// Here, we are calling the Remote reverseStream method. Using onNext, client sends a stream of messages.
		StreamObserver<waterStatusRequest> requestObserver = asyncStub.bidiRiver(waterReply);

		try {

			requestObserver.onNext(waterStatusRequest.newBuilder().setWaterStatusReq("Liffey").build());
			requestObserver.onNext(waterStatusRequest.newBuilder().setWaterStatusReq("Barrow").build());
			requestObserver.onNext(waterStatusRequest.newBuilder().setWaterStatusReq("Shannon").build());
			
			System.out.println("--- RPC 2 ---");

			// Mark the end of requests
			requestObserver.onCompleted();


			// Sleep for a bit before sending the next one.
			Thread.sleep(new Random().nextInt(1000) + 500);


		} catch (RuntimeException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}

	}
		
	public static void BidiNeighbourhood() {
		// TODO Auto-generated method stub
		// Handling the server stream for client using onNext (logic for handling each message in stream), onError, onCompleted (logic will be executed after the completion of stream)
		StreamObserver<neighborhoodStatusResponse> neiReply = new StreamObserver<neighborhoodStatusResponse>() {

			@Override
			public void onNext(neighborhoodStatusResponse value) {

				System.out.println("Information requested: " + value.getNeighborhoodStatusRes());

			}

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onCompleted() {
				// TODO Auto-generated method stub
				System.out.println("Neighborhood information request finished succesfully");
			}
		};

		// Here, we are calling the Remote reverseStream method. Using onNext, client sends a stream of messages.
		StreamObserver<neighborhoodStatusRequest> requestObserver = asyncStub.bidiNeighbourhood(neiReply);

		try {

			requestObserver.onNext(neighborhoodStatusRequest.newBuilder().setNeighborhoodStatusReq("Churchtown").build());
			requestObserver.onNext(neighborhoodStatusRequest.newBuilder().setNeighborhoodStatusReq("Temple Bar").build());
			requestObserver.onNext(neighborhoodStatusRequest.newBuilder().setNeighborhoodStatusReq("Ranelagh").build());
			
			System.out.println("--- RPC 3 ---");

			// Mark the end of requests
			requestObserver.onCompleted();


			// Sleep for a bit before sending the next one.
			Thread.sleep(new Random().nextInt(1000) + 500);


		} catch (RuntimeException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
		
	}
}
