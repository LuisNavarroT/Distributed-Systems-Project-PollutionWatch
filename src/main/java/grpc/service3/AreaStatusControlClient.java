package grpc.service3;

import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import grpc.examples.serverstreamstrings.StringRequest;
import grpc.examples.serverstreamstrings.StringResponse;
import grpc.service2.airOxygenRequest;
import grpc.service2.airOxygenResponse;
import grpc.service3.AreaStatusControlGrpc.AreaStatusControlBlockingStub;
import grpc.service3.AreaStatusControlGrpc.AreaStatusControlStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

public class AreaStatusControlClient {
	private static AreaStatusControlBlockingStub blockingstub;
	private static AreaStatusControlStub asyncStub;
	public static void main(String[] args) {
		String host="localhost";
		int port = 50053;
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
