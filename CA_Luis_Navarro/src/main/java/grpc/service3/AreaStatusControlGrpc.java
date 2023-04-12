package grpc.service3;

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
    comments = "Source: Serv3_AreaStatusControl.proto")
public final class AreaStatusControlGrpc {

  private AreaStatusControlGrpc() {}

  public static final String SERVICE_NAME = "PollutionWatch.AreaStatusControl";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.service3.riverDataRequest,
      grpc.service3.riverDataResponse> getRiverHistoricMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "riverHistoric",
      requestType = grpc.service3.riverDataRequest.class,
      responseType = grpc.service3.riverDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.service3.riverDataRequest,
      grpc.service3.riverDataResponse> getRiverHistoricMethod() {
    io.grpc.MethodDescriptor<grpc.service3.riverDataRequest, grpc.service3.riverDataResponse> getRiverHistoricMethod;
    if ((getRiverHistoricMethod = AreaStatusControlGrpc.getRiverHistoricMethod) == null) {
      synchronized (AreaStatusControlGrpc.class) {
        if ((getRiverHistoricMethod = AreaStatusControlGrpc.getRiverHistoricMethod) == null) {
          AreaStatusControlGrpc.getRiverHistoricMethod = getRiverHistoricMethod = 
              io.grpc.MethodDescriptor.<grpc.service3.riverDataRequest, grpc.service3.riverDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "PollutionWatch.AreaStatusControl", "riverHistoric"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.service3.riverDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.service3.riverDataResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AreaStatusControlMethodDescriptorSupplier("riverHistoric"))
                  .build();
          }
        }
     }
     return getRiverHistoricMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.service3.waterStatusRequest,
      grpc.service3.waterStatusResponse> getBidiRiverMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BidiRiver",
      requestType = grpc.service3.waterStatusRequest.class,
      responseType = grpc.service3.waterStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.service3.waterStatusRequest,
      grpc.service3.waterStatusResponse> getBidiRiverMethod() {
    io.grpc.MethodDescriptor<grpc.service3.waterStatusRequest, grpc.service3.waterStatusResponse> getBidiRiverMethod;
    if ((getBidiRiverMethod = AreaStatusControlGrpc.getBidiRiverMethod) == null) {
      synchronized (AreaStatusControlGrpc.class) {
        if ((getBidiRiverMethod = AreaStatusControlGrpc.getBidiRiverMethod) == null) {
          AreaStatusControlGrpc.getBidiRiverMethod = getBidiRiverMethod = 
              io.grpc.MethodDescriptor.<grpc.service3.waterStatusRequest, grpc.service3.waterStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "PollutionWatch.AreaStatusControl", "BidiRiver"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.service3.waterStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.service3.waterStatusResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AreaStatusControlMethodDescriptorSupplier("BidiRiver"))
                  .build();
          }
        }
     }
     return getBidiRiverMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.service3.neighborhoodStatusRequest,
      grpc.service3.neighborhoodStatusResponse> getBidiNeighbourhoodMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BidiNeighbourhood",
      requestType = grpc.service3.neighborhoodStatusRequest.class,
      responseType = grpc.service3.neighborhoodStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.service3.neighborhoodStatusRequest,
      grpc.service3.neighborhoodStatusResponse> getBidiNeighbourhoodMethod() {
    io.grpc.MethodDescriptor<grpc.service3.neighborhoodStatusRequest, grpc.service3.neighborhoodStatusResponse> getBidiNeighbourhoodMethod;
    if ((getBidiNeighbourhoodMethod = AreaStatusControlGrpc.getBidiNeighbourhoodMethod) == null) {
      synchronized (AreaStatusControlGrpc.class) {
        if ((getBidiNeighbourhoodMethod = AreaStatusControlGrpc.getBidiNeighbourhoodMethod) == null) {
          AreaStatusControlGrpc.getBidiNeighbourhoodMethod = getBidiNeighbourhoodMethod = 
              io.grpc.MethodDescriptor.<grpc.service3.neighborhoodStatusRequest, grpc.service3.neighborhoodStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "PollutionWatch.AreaStatusControl", "BidiNeighbourhood"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.service3.neighborhoodStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.service3.neighborhoodStatusResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AreaStatusControlMethodDescriptorSupplier("BidiNeighbourhood"))
                  .build();
          }
        }
     }
     return getBidiNeighbourhoodMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AreaStatusControlStub newStub(io.grpc.Channel channel) {
    return new AreaStatusControlStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AreaStatusControlBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AreaStatusControlBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AreaStatusControlFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AreaStatusControlFutureStub(channel);
  }

  /**
   */
  public static abstract class AreaStatusControlImplBase implements io.grpc.BindableService {

    /**
     */
    public void riverHistoric(grpc.service3.riverDataRequest request,
        io.grpc.stub.StreamObserver<grpc.service3.riverDataResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRiverHistoricMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<grpc.service3.waterStatusRequest> bidiRiver(
        io.grpc.stub.StreamObserver<grpc.service3.waterStatusResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getBidiRiverMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<grpc.service3.neighborhoodStatusRequest> bidiNeighbourhood(
        io.grpc.stub.StreamObserver<grpc.service3.neighborhoodStatusResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getBidiNeighbourhoodMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRiverHistoricMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                grpc.service3.riverDataRequest,
                grpc.service3.riverDataResponse>(
                  this, METHODID_RIVER_HISTORIC)))
          .addMethod(
            getBidiRiverMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                grpc.service3.waterStatusRequest,
                grpc.service3.waterStatusResponse>(
                  this, METHODID_BIDI_RIVER)))
          .addMethod(
            getBidiNeighbourhoodMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                grpc.service3.neighborhoodStatusRequest,
                grpc.service3.neighborhoodStatusResponse>(
                  this, METHODID_BIDI_NEIGHBOURHOOD)))
          .build();
    }
  }

  /**
   */
  public static final class AreaStatusControlStub extends io.grpc.stub.AbstractStub<AreaStatusControlStub> {
    private AreaStatusControlStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AreaStatusControlStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AreaStatusControlStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AreaStatusControlStub(channel, callOptions);
    }

    /**
     */
    public void riverHistoric(grpc.service3.riverDataRequest request,
        io.grpc.stub.StreamObserver<grpc.service3.riverDataResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getRiverHistoricMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<grpc.service3.waterStatusRequest> bidiRiver(
        io.grpc.stub.StreamObserver<grpc.service3.waterStatusResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getBidiRiverMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<grpc.service3.neighborhoodStatusRequest> bidiNeighbourhood(
        io.grpc.stub.StreamObserver<grpc.service3.neighborhoodStatusResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getBidiNeighbourhoodMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class AreaStatusControlBlockingStub extends io.grpc.stub.AbstractStub<AreaStatusControlBlockingStub> {
    private AreaStatusControlBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AreaStatusControlBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AreaStatusControlBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AreaStatusControlBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<grpc.service3.riverDataResponse> riverHistoric(
        grpc.service3.riverDataRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getRiverHistoricMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AreaStatusControlFutureStub extends io.grpc.stub.AbstractStub<AreaStatusControlFutureStub> {
    private AreaStatusControlFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AreaStatusControlFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AreaStatusControlFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AreaStatusControlFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_RIVER_HISTORIC = 0;
  private static final int METHODID_BIDI_RIVER = 1;
  private static final int METHODID_BIDI_NEIGHBOURHOOD = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AreaStatusControlImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AreaStatusControlImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RIVER_HISTORIC:
          serviceImpl.riverHistoric((grpc.service3.riverDataRequest) request,
              (io.grpc.stub.StreamObserver<grpc.service3.riverDataResponse>) responseObserver);
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
        case METHODID_BIDI_RIVER:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.bidiRiver(
              (io.grpc.stub.StreamObserver<grpc.service3.waterStatusResponse>) responseObserver);
        case METHODID_BIDI_NEIGHBOURHOOD:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.bidiNeighbourhood(
              (io.grpc.stub.StreamObserver<grpc.service3.neighborhoodStatusResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class AreaStatusControlBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AreaStatusControlBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.service3.AreaStatusControlImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AreaStatusControl");
    }
  }

  private static final class AreaStatusControlFileDescriptorSupplier
      extends AreaStatusControlBaseDescriptorSupplier {
    AreaStatusControlFileDescriptorSupplier() {}
  }

  private static final class AreaStatusControlMethodDescriptorSupplier
      extends AreaStatusControlBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AreaStatusControlMethodDescriptorSupplier(String methodName) {
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
      synchronized (AreaStatusControlGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AreaStatusControlFileDescriptorSupplier())
              .addMethod(getRiverHistoricMethod())
              .addMethod(getBidiRiverMethod())
              .addMethod(getBidiNeighbourhoodMethod())
              .build();
        }
      }
    }
    return result;
  }
}
