// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Serv3_AreaStatusControl.proto

package grpc.service3;

/**
 * <pre>
 * Define the messages for BidiRiver method
 *(Bidirectional) The client sends 2 river names
 * The server will answer with data from this two rivers.
 * </pre>
 *
 * Protobuf type {@code PollutionWatch.waterStatusRequest}
 */
public  final class waterStatusRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:PollutionWatch.waterStatusRequest)
    waterStatusRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use waterStatusRequest.newBuilder() to construct.
  private waterStatusRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private waterStatusRequest() {
    waterStatusReq_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private waterStatusRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            waterStatusReq_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return grpc.service3.AreaStatusControlImpl.internal_static_PollutionWatch_waterStatusRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return grpc.service3.AreaStatusControlImpl.internal_static_PollutionWatch_waterStatusRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            grpc.service3.waterStatusRequest.class, grpc.service3.waterStatusRequest.Builder.class);
  }

  public static final int WATERSTATUSREQ_FIELD_NUMBER = 1;
  private volatile java.lang.Object waterStatusReq_;
  /**
   * <code>string waterStatusReq = 1;</code>
   */
  public java.lang.String getWaterStatusReq() {
    java.lang.Object ref = waterStatusReq_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      waterStatusReq_ = s;
      return s;
    }
  }
  /**
   * <code>string waterStatusReq = 1;</code>
   */
  public com.google.protobuf.ByteString
      getWaterStatusReqBytes() {
    java.lang.Object ref = waterStatusReq_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      waterStatusReq_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getWaterStatusReqBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, waterStatusReq_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getWaterStatusReqBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, waterStatusReq_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof grpc.service3.waterStatusRequest)) {
      return super.equals(obj);
    }
    grpc.service3.waterStatusRequest other = (grpc.service3.waterStatusRequest) obj;

    boolean result = true;
    result = result && getWaterStatusReq()
        .equals(other.getWaterStatusReq());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + WATERSTATUSREQ_FIELD_NUMBER;
    hash = (53 * hash) + getWaterStatusReq().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static grpc.service3.waterStatusRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.service3.waterStatusRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.service3.waterStatusRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.service3.waterStatusRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.service3.waterStatusRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.service3.waterStatusRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.service3.waterStatusRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.service3.waterStatusRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.service3.waterStatusRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static grpc.service3.waterStatusRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.service3.waterStatusRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.service3.waterStatusRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(grpc.service3.waterStatusRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Define the messages for BidiRiver method
   *(Bidirectional) The client sends 2 river names
   * The server will answer with data from this two rivers.
   * </pre>
   *
   * Protobuf type {@code PollutionWatch.waterStatusRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:PollutionWatch.waterStatusRequest)
      grpc.service3.waterStatusRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return grpc.service3.AreaStatusControlImpl.internal_static_PollutionWatch_waterStatusRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return grpc.service3.AreaStatusControlImpl.internal_static_PollutionWatch_waterStatusRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              grpc.service3.waterStatusRequest.class, grpc.service3.waterStatusRequest.Builder.class);
    }

    // Construct using grpc.service3.waterStatusRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      waterStatusReq_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return grpc.service3.AreaStatusControlImpl.internal_static_PollutionWatch_waterStatusRequest_descriptor;
    }

    @java.lang.Override
    public grpc.service3.waterStatusRequest getDefaultInstanceForType() {
      return grpc.service3.waterStatusRequest.getDefaultInstance();
    }

    @java.lang.Override
    public grpc.service3.waterStatusRequest build() {
      grpc.service3.waterStatusRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public grpc.service3.waterStatusRequest buildPartial() {
      grpc.service3.waterStatusRequest result = new grpc.service3.waterStatusRequest(this);
      result.waterStatusReq_ = waterStatusReq_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof grpc.service3.waterStatusRequest) {
        return mergeFrom((grpc.service3.waterStatusRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(grpc.service3.waterStatusRequest other) {
      if (other == grpc.service3.waterStatusRequest.getDefaultInstance()) return this;
      if (!other.getWaterStatusReq().isEmpty()) {
        waterStatusReq_ = other.waterStatusReq_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      grpc.service3.waterStatusRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (grpc.service3.waterStatusRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object waterStatusReq_ = "";
    /**
     * <code>string waterStatusReq = 1;</code>
     */
    public java.lang.String getWaterStatusReq() {
      java.lang.Object ref = waterStatusReq_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        waterStatusReq_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string waterStatusReq = 1;</code>
     */
    public com.google.protobuf.ByteString
        getWaterStatusReqBytes() {
      java.lang.Object ref = waterStatusReq_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        waterStatusReq_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string waterStatusReq = 1;</code>
     */
    public Builder setWaterStatusReq(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      waterStatusReq_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string waterStatusReq = 1;</code>
     */
    public Builder clearWaterStatusReq() {
      
      waterStatusReq_ = getDefaultInstance().getWaterStatusReq();
      onChanged();
      return this;
    }
    /**
     * <code>string waterStatusReq = 1;</code>
     */
    public Builder setWaterStatusReqBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      waterStatusReq_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:PollutionWatch.waterStatusRequest)
  }

  // @@protoc_insertion_point(class_scope:PollutionWatch.waterStatusRequest)
  private static final grpc.service3.waterStatusRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new grpc.service3.waterStatusRequest();
  }

  public static grpc.service3.waterStatusRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<waterStatusRequest>
      PARSER = new com.google.protobuf.AbstractParser<waterStatusRequest>() {
    @java.lang.Override
    public waterStatusRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new waterStatusRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<waterStatusRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<waterStatusRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public grpc.service3.waterStatusRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

