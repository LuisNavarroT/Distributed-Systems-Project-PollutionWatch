package grpc.service1;

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
    comments = "Source: Serv1_RiverWaterControl.proto")
public final class RiverWaterControlGrpc {

  private RiverWaterControlGrpc() {}

  public static final String SERVICE_NAME = "PollutionWatch.RiverWaterControl";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.service1.testRequest,
      grpc.service1.testResponse> getOxigenLevelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "oxigenLevel",
      requestType = grpc.service1.testRequest.class,
      responseType = grpc.service1.testResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.service1.testRequest,
      grpc.service1.testResponse> getOxigenLevelMethod() {
    io.grpc.MethodDescriptor<grpc.service1.testRequest, grpc.service1.testResponse> getOxigenLevelMethod;
    if ((getOxigenLevelMethod = RiverWaterControlGrpc.getOxigenLevelMethod) == null) {
      synchronized (RiverWaterControlGrpc.class) {
        if ((getOxigenLevelMethod = RiverWaterControlGrpc.getOxigenLevelMethod) == null) {
          RiverWaterControlGrpc.getOxigenLevelMethod = getOxigenLevelMethod = 
              io.grpc.MethodDescriptor.<grpc.service1.testRequest, grpc.service1.testResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "PollutionWatch.RiverWaterControl", "oxigenLevel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.service1.testRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.service1.testResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RiverWaterControlMethodDescriptorSupplier("oxigenLevel"))
                  .build();
          }
        }
     }
     return getOxigenLevelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.service1.deepTestRequest,
      grpc.service1.deepTestResponse> getManyValuesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "manyValues",
      requestType = grpc.service1.deepTestRequest.class,
      responseType = grpc.service1.deepTestResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.service1.deepTestRequest,
      grpc.service1.deepTestResponse> getManyValuesMethod() {
    io.grpc.MethodDescriptor<grpc.service1.deepTestRequest, grpc.service1.deepTestResponse> getManyValuesMethod;
    if ((getManyValuesMethod = RiverWaterControlGrpc.getManyValuesMethod) == null) {
      synchronized (RiverWaterControlGrpc.class) {
        if ((getManyValuesMethod = RiverWaterControlGrpc.getManyValuesMethod) == null) {
          RiverWaterControlGrpc.getManyValuesMethod = getManyValuesMethod = 
              io.grpc.MethodDescriptor.<grpc.service1.deepTestRequest, grpc.service1.deepTestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "PollutionWatch.RiverWaterControl", "manyValues"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.service1.deepTestRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.service1.deepTestResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RiverWaterControlMethodDescriptorSupplier("manyValues"))
                  .build();
          }
        }
     }
     return getManyValuesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.service1.riverDataRequest,
      grpc.service1.riverDataResponse> getManyReadingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "manyReadings",
      requestType = grpc.service1.riverDataRequest.class,
      responseType = grpc.service1.riverDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.service1.riverDataRequest,
      grpc.service1.riverDataResponse> getManyReadingsMethod() {
    io.grpc.MethodDescriptor<grpc.service1.riverDataRequest, grpc.service1.riverDataResponse> getManyReadingsMethod;
    if ((getManyReadingsMethod = RiverWaterControlGrpc.getManyReadingsMethod) == null) {
      synchronized (RiverWaterControlGrpc.class) {
        if ((getManyReadingsMethod = RiverWaterControlGrpc.getManyReadingsMethod) == null) {
          RiverWaterControlGrpc.getManyReadingsMethod = getManyReadingsMethod = 
              io.grpc.MethodDescriptor.<grpc.service1.riverDataRequest, grpc.service1.riverDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "PollutionWatch.RiverWaterControl", "manyReadings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.service1.riverDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.service1.riverDataResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RiverWaterControlMethodDescriptorSupplier("manyReadings"))
                  .build();
          }
        }
     }
     return getManyReadingsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RiverWaterControlStub newStub(io.grpc.Channel channel) {
    return new RiverWaterControlStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RiverWaterControlBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RiverWaterControlBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RiverWaterControlFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RiverWaterControlFutureStub(channel);
  }

  /**
   */
  public static abstract class RiverWaterControlImplBase implements io.grpc.BindableService {

    /**
     */
    public void oxigenLevel(grpc.service1.testRequest request,
        io.grpc.stub.StreamObserver<grpc.service1.testResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getOxigenLevelMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<grpc.service1.deepTestRequest> manyValues(
        io.grpc.stub.StreamObserver<grpc.service1.deepTestResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getManyValuesMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<grpc.service1.riverDataRequest> manyReadings(
        io.grpc.stub.StreamObserver<grpc.service1.riverDataResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getManyReadingsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getOxigenLevelMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.service1.testRequest,
                grpc.service1.testResponse>(
                  this, METHODID_OXIGEN_LEVEL)))
          .addMethod(
            getManyValuesMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                grpc.service1.deepTestRequest,
                grpc.service1.deepTestResponse>(
                  this, METHODID_MANY_VALUES)))
          .addMethod(
            getManyReadingsMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                grpc.service1.riverDataRequest,
                grpc.service1.riverDataResponse>(
                  this, METHODID_MANY_READINGS)))
          .build();
    }
  }

  /**
   */
  public static final class RiverWaterControlStub extends io.grpc.stub.AbstractStub<RiverWaterControlStub> {
    private RiverWaterControlStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RiverWaterControlStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RiverWaterControlStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RiverWaterControlStub(channel, callOptions);
    }

    /**
     */
    public void oxigenLevel(grpc.service1.testRequest request,
        io.grpc.stub.StreamObserver<grpc.service1.testResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getOxigenLevelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<grpc.service1.deepTestRequest> manyValues(
        io.grpc.stub.StreamObserver<grpc.service1.deepTestResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getManyValuesMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<grpc.service1.riverDataRequest> manyReadings(
        io.grpc.stub.StreamObserver<grpc.service1.riverDataResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getManyReadingsMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class RiverWaterControlBlockingStub extends io.grpc.stub.AbstractStub<RiverWaterControlBlockingStub> {
    private RiverWaterControlBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RiverWaterControlBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RiverWaterControlBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RiverWaterControlBlockingStub(channel, callOptions);
    }

    /**
     */
    public grpc.service1.testResponse oxigenLevel(grpc.service1.testRequest request) {
      return blockingUnaryCall(
          getChannel(), getOxigenLevelMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RiverWaterControlFutureStub extends io.grpc.stub.AbstractStub<RiverWaterControlFutureStub> {
    private RiverWaterControlFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RiverWaterControlFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RiverWaterControlFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RiverWaterControlFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.service1.testResponse> oxigenLevel(
        grpc.service1.testRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getOxigenLevelMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_OXIGEN_LEVEL = 0;
  private static final int METHODID_MANY_VALUES = 1;
  private static final int METHODID_MANY_READINGS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RiverWaterControlImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RiverWaterControlImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_OXIGEN_LEVEL:
          serviceImpl.oxigenLevel((grpc.service1.testRequest) request,
              (io.grpc.stub.StreamObserver<grpc.service1.testResponse>) responseObserver);
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
        case METHODID_MANY_VALUES:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.manyValues(
              (io.grpc.stub.StreamObserver<grpc.service1.deepTestResponse>) responseObserver);
        case METHODID_MANY_READINGS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.manyReadings(
              (io.grpc.stub.StreamObserver<grpc.service1.riverDataResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class RiverWaterControlBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RiverWaterControlBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.service1.RiverWaterControlImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RiverWaterControl");
    }
  }

  private static final class RiverWaterControlFileDescriptorSupplier
      extends RiverWaterControlBaseDescriptorSupplier {
    RiverWaterControlFileDescriptorSupplier() {}
  }

  private static final class RiverWaterControlMethodDescriptorSupplier
      extends RiverWaterControlBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RiverWaterControlMethodDescriptorSupplier(String methodName) {
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
      synchronized (RiverWaterControlGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RiverWaterControlFileDescriptorSupplier())
              .addMethod(getOxigenLevelMethod())
              .addMethod(getManyValuesMethod())
              .addMethod(getManyReadingsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
