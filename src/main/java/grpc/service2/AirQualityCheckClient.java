package grpc.service2;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import grpc.service2.AirQualityCheckGrpc.AirQualityCheckBlockingStub;
import grpc.service2.AirQualityCheckGrpc.AirQualityCheckStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

public class AirQualityCheckClient {
	private static AirQualityCheckBlockingStub blockingstub;
	private static AirQualityCheckStub asyncStub;
	public static void main(String[] args) {
		String host="localhost";
		int port = 50052;
		ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
		blockingstub = AirQualityCheckGrpc.newBlockingStub(channel);
		asyncStub = AirQualityCheckGrpc.newStub(channel);
		
		//Method calls and channel shutdown
		neighbourhoodName();
		BidiOxygen();
		manyAirReadings();
		try {
			channel.shutdown().awaitTermination(5,TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static void neighbourhoodName() {
		// TODO Auto-generated method stub
		try {
		statusRequest request = statusRequest.newBuilder().setStatusReq("Churchtown").build();
		statusResponse response = blockingstub.neighbourhoodName(request);
		System.out.println(response.getStatusRes());
		}catch (StatusRuntimeException e) {
			e.getStatus();
		}
		
	}
	public static void BidiOxygen() {
		// TODO Auto-generated method stub

		// Handling the server stream for client using onNext (logic for handling each message in stream), onError, onCompleted (logic will be executed after the completion of stream)
		StreamObserver<airOxygenResponse> airOxyReply = new StreamObserver<airOxygenResponse>() {

			@Override
			public void onNext(airOxygenResponse value) {

				System.out.println("The percentage of the oxygen in the air is: " + value.getAirOxygenResPer() + "% which means it is: " + value.getAirOxygenResHea());

			}

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onCompleted() {
				// TODO Auto-generated method stub
				System.out.println("Burette method test finished succesfully");
			}



		};

		// Here, we are calling the Remote reverseStream method. Using onNext, client sends a stream of messages.
		StreamObserver<airOxygenRequest> requestObserver = asyncStub.bidiOxygen(airOxyReply);

		try {

			requestObserver.onNext(airOxygenRequest.newBuilder().setAirOxygenReqBef(20).setAirOxygenReqAft(14).build());
			requestObserver.onNext(airOxygenRequest.newBuilder().setAirOxygenReqBef(25).setAirOxygenReqAft(15).build());
			requestObserver.onNext(airOxygenRequest.newBuilder().setAirOxygenReqBef(16).setAirOxygenReqAft(8).build());
	
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
	public static void manyAirReadings() {
		// TODO Auto-generated method stub
		StreamObserver<airDataResponse> airReply = new StreamObserver<airDataResponse>() {

			@Override
			public void onNext(airDataResponse value) {
				// TODO Auto-generated method stub
				System.out.println("--- RPC 3 --- \nThe status of the air is: " + value.getAirDataRes());
				
			}

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub
				t.printStackTrace();
				
			}

			@Override
			public void onCompleted() {
				// TODO Auto-generated method stub
				System.out.println("Server finnished");
			}
			
		};
		
		StreamObserver<airDataRequest> airRequest = asyncStub.manyAirReadings(airReply);
		try {
			airDataRequest request = airDataRequest.newBuilder().setAirDataReqMon(7).setAirDataReqOz(30).build();
			airRequest.onNext(request);
	        Thread.sleep(500);
	        airRequest.onCompleted();
	        Thread.sleep(3000);
	    } catch (RuntimeException | InterruptedException e) {
	        e.printStackTrace();
	    }	
	}
}
