// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Serv1_RiverWaterControl.proto

package grpc.service1;

public interface riverDataRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:PollutionWatch.riverDataRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string riverDataReq = 1;</code>
   */
  java.lang.String getRiverDataReq();
  /**
   * <code>string riverDataReq = 1;</code>
   */
  com.google.protobuf.ByteString
      getRiverDataReqBytes();

  /**
   * <code>float riverDataReqOxy = 2;</code>
   */
  float getRiverDataReqOxy();

  /**
   * <code>float riverDataReqTemp = 3;</code>
   */
  float getRiverDataReqTemp();

  /**
   * <code>float riverDataReqPh = 4;</code>
   */
  float getRiverDataReqPh();
}
