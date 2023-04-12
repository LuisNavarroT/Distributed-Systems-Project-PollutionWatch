package grpc.service2;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: Serv2_AirQualityCheck.proto")
public final class AirQualityCheckGrpc {

  private AirQualityCheckGrpc() {}

  public static final String SERVICE_NAME = "PollutionWatch.AirQualityCheck";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.service2.statusRequest,
      grpc.service2.statusResponse> getNeighbourhoodNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "neighbourhoodName",
      requestType = grpc.service2.statusRequest.class,
      responseType = grpc.service2.statusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.service2.statusRequest,
      grpc.service2.statusResponse> getNeighbourhoodNameMethod() {
    io.grpc.MethodDescriptor<grpc.service2.statusRequest, grpc.service2.statusResponse> getNeighbourhoodNameMethod;
    if ((getNeighbourhoodNameMethod = AirQualityCheckGrpc.getNeighbourhoodNameMethod) == null) {
      synchronized (AirQualityCheckGrpc.class) {
        if ((getNeighbourhoodNameMethod = AirQualityCheckGrpc.getNeighbourhoodNameMethod) == null) {
          AirQualityCheckGrpc.getNeighbourhoodNameMethod = getNeighbourhoodNameMethod = 
              io.grpc.MethodDescriptor.<grpc.service2.statusRequest, grpc.service2.statusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "PollutionWatch.AirQualityCheck", "neighbourhoodName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.service2.statusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.service2.statusResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AirQualityCheckMethodDescriptorSupplier("neighbourhoodName"))
                  .build();
          }
        }
     }
     return getNeighbourhoodNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.service2.airOxygenRequest,
      grpc.service2.airOxygenResponse> getBidiOxygenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BidiOxygen",
      requestType = grpc.service2.airOxygenRequest.class,
      responseType = grpc.service2.airOxygenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.service2.airOxygenRequest,
      grpc.service2.airOxygenResponse> getBidiOxygenMethod() {
    io.grpc.MethodDescriptor<grpc.service2.airOxygenRequest, grpc.service2.airOxygenResponse> getBidiOxygenMethod;
    if ((getBidiOxygenMethod = AirQualityCheckGrpc.getBidiOxygenMethod) == null) {
      synchronized (AirQualityCheckGrpc.class) {
        if ((getBidiOxygenMethod = AirQualityCheckGrpc.getBidiOxygenMethod) == null) {
          AirQualityCheckGrpc.getBidiOxygenMethod = getBidiOxygenMethod = 
              io.grpc.MethodDescriptor.<grpc.service2.airOxygenRequest, grpc.service2.airOxygenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "PollutionWatch.AirQualityCheck", "BidiOxygen"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.service2.airOxygenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.service2.airOxygenResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AirQualityCheckMethodDescriptorSupplier("BidiOxygen"))
                  .build();
          }
        }
     }
     return getBidiOxygenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.service2.airDataRequest,
      grpc.service2.airDataResponse> getManyAirReadingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "manyAirReadings",
      requestType = grpc.service2.airDataRequest.class,
      responseType = grpc.service2.airDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.service2.airDataRequest,
      grpc.service2.airDataResponse> getManyAirReadingsMethod() {
    io.grpc.MethodDescriptor<grpc.service2.airDataRequest, grpc.service2.airDataResponse> getManyAirReadingsMethod;
    if ((getManyAirReadingsMethod = AirQualityCheckGrpc.getManyAirReadingsMethod) == null) {
      synchronized (AirQualityCheckGrpc.class) {
        if ((getManyAirReadingsMethod = AirQualityCheckGrpc.getManyAirReadingsMethod) == null) {
          AirQualityCheckGrpc.getManyAirReadingsMethod = getManyAirReadingsMethod = 
              io.grpc.MethodDescriptor.<grpc.service2.airDataRequest, grpc.service2.airDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "PollutionWatch.AirQualityCheck", "manyAirReadings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.service2.airDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.service2.airDataResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AirQualityCheckMethodDescriptorSupplier("manyAirReadings"))
                  .build();
          }
        }
     }
     return getManyAirReadingsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AirQualityCheckStub newStub(io.grpc.Channel channel) {
    return new AirQualityCheckStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AirQualityCheckBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AirQualityCheckBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AirQualityCheckFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AirQualityCheckFutureStub(channel);
  }

  /**
   */
  public static abstract class AirQualityCheckImplBase implements io.grpc.BindableService {

    /**
     */
    public void neighbourhoodName(grpc.service2.statusRequest request,
        io.grpc.stub.StreamObserver<grpc.service2.statusResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getNeighbourhoodNameMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<grpc.service2.airOxygenRequest> bidiOxygen(
        io.grpc.stub.StreamObserver<grpc.service2.airOxygenResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getBidiOxygenMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<grpc.service2.airDataRequest> manyAirReadings(
        io.grpc.stub.StreamObserver<grpc.service2.airDataResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getManyAirReadingsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getNeighbourhoodNameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.service2.statusRequest,
                grpc.service2.statusResponse>(
                  this, METHODID_NEIGHBOURHOOD_NAME)))
          .addMethod(
            getBidiOxygenMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                grpc.service2.airOxygenRequest,
                grpc.service2.airOxygenResponse>(
                  this, METHODID_BIDI_OXYGEN)))
          .addMethod(
            getManyAirReadingsMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                grpc.service2.airDataRequest,
                grpc.service2.airDataResponse>(
                  this, METHODID_MANY_AIR_READINGS)))
          .build();
    }
  }

  /**
   */
  public static final class AirQualityCheckStub extends io.grpc.stub.AbstractStub<AirQualityCheckStub> {
    private AirQualityCheckStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AirQualityCheckStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AirQualityCheckStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AirQualityCheckStub(channel, callOptions);
    }

    /**
     */
    public void neighbourhoodName(grpc.service2.statusRequest request,
        io.grpc.stub.StreamObserver<grpc.service2.statusResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getNeighbourhoodNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<grpc.service2.airOxygenRequest> bidiOxygen(
        io.grpc.stub.StreamObserver<grpc.service2.airOxygenResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getBidiOxygenMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<grpc.service2.airDataRequest> manyAirReadings(
        io.grpc.stub.StreamObserver<grpc.service2.airDataResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getManyAirReadingsMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class AirQualityCheckBlockingStub extends io.grpc.stub.AbstractStub<AirQualityCheckBlockingStub> {
    private AirQualityCheckBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AirQualityCheckBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AirQualityCheckBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AirQualityCheckBlockingStub(channel, callOptions);
    }

    /**
     */
    public grpc.service2.statusResponse neighbourhoodName(grpc.service2.statusRequest request) {
      return blockingUnaryCall(
          getChannel(), getNeighbourhoodNameMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AirQualityCheckFutureStub extends io.grpc.stub.AbstractStub<AirQualityCheckFutureStub> {
    private AirQualityCheckFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AirQualityCheckFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AirQualityCheckFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AirQualityCheckFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.service2.statusResponse> neighbourhoodName(
        grpc.service2.statusRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getNeighbourhoodNameMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_NEIGHBOURHOOD_NAME = 0;
  private static final int METHODID_BIDI_OXYGEN = 1;
  private static final int METHODID_MANY_AIR_READINGS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AirQualityCheckImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AirQualityCheckImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_NEIGHBOURHOOD_NAME:
          serviceImpl.neighbourhoodName((grpc.service2.statusRequest) request,
              (io.grpc.stub.StreamObserver<grpc.service2.statusResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_BIDI_OXYGEN:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.bidiOxygen(
              (io.grpc.stub.StreamObserver<grpc.service2.airOxygenResponse>) responseObserver);
        case METHODID_MANY_AIR_READINGS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.manyAirReadings(
              (io.grpc.stub.StreamObserver<grpc.service2.airDataResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class AirQualityCheckBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AirQualityCheckBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.service2.AirQualityCheckImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AirQualityCheck");
    }
  }

  private static final class AirQualityCheckFileDescriptorSupplier
      extends AirQualityCheckBaseDescriptorSupplier {
    AirQualityCheckFileDescriptorSupplier() {}
  }

  private static final class AirQualityCheckMethodDescriptorSupplier
      extends AirQualityCheckBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AirQualityCheckMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AirQualityCheckGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AirQualityCheckFileDescriptorSupplier())
              .addMethod(getNeighbourhoodNameMethod())
              .addMethod(getBidiOxygenMethod())
              .addMethod(getManyAirReadingsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
