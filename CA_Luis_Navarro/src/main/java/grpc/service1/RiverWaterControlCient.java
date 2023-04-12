package grpc.service1;

import java.util.concurrent.TimeUnit;

import grpc.service1.RiverWaterControlGrpc.RiverWaterControlBlockingStub;
import grpc.service1.RiverWaterControlGrpc.RiverWaterControlStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;


public class RiverWaterControlCient {
	private static RiverWaterControlBlockingStub blockingstub;
	private static RiverWaterControlStub asyncStub;
	public static void main(String[] args) {
		String host="localhost";
		int port = 50051;
		ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
		blockingstub = RiverWaterControlGrpc.newBlockingStub(channel);
		asyncStub = RiverWaterControlGrpc.newStub(channel);
		
		//Method calls and channel shutdown
		oxigenLevel();
		manyValues();
		manyReadings();
		try {
			channel.shutdown().awaitTermination(5,TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void oxigenLevel() {
		// TODO Auto-generated method stub
		try {
		testRequest request = testRequest.newBuilder().setTestReq(7).build();
		testResponse response = blockingstub.oxigenLevel(request);
		System.out.println(response.getTestRes());
		}catch (StatusRuntimeException e) {
			e.getStatus();
		}
		
	}
	
	public static void manyValues() {
		// TODO Auto-generated method stub
		StreamObserver<deepTestResponse> deepReply = new StreamObserver<deepTestResponse>() {

			@Override
			public void onNext(deepTestResponse value) {
				// TODO Auto-generated method stub
				System.out.println("The status of the deep water test is: " + value.getDeepTestRes());
				
			}

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub
				t.printStackTrace();
				
			}

			@Override
			public void onCompleted() {
				// TODO Auto-generated method stub
				System.out.println("Deep test finished succesfully");
			}
			
		};
		
		StreamObserver<deepTestRequest> deepResponse = asyncStub.manyValues(deepReply);
		try {
			deepTestRequest request = deepTestRequest.newBuilder().setDeepTestReqOxy(7).setDeepTestReqTemp(25).setDeepTestReqPh(7).build();
			deepResponse.onNext(request);
	        Thread.sleep(500);
	        deepResponse.onCompleted();
	        Thread.sleep(10000);
	    } catch (RuntimeException | InterruptedException e) {
	        e.printStackTrace();
	    }
		
	}
	
	public static void manyReadings() {
		// TODO Auto-generated method stub
		
	}
	
}
