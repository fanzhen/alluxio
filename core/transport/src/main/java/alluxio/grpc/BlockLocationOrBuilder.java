// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/common.proto

package alluxio.grpc;

public interface BlockLocationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.BlockLocation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int64 workerId = 1;</code>
   */
  boolean hasWorkerId();
  /**
   * <code>optional int64 workerId = 1;</code>
   */
  long getWorkerId();

  /**
   * <code>optional .alluxio.grpc.WorkerNetAddress workerAddress = 2;</code>
   */
  boolean hasWorkerAddress();
  /**
   * <code>optional .alluxio.grpc.WorkerNetAddress workerAddress = 2;</code>
   */
  alluxio.grpc.WorkerNetAddress getWorkerAddress();
  /**
   * <code>optional .alluxio.grpc.WorkerNetAddress workerAddress = 2;</code>
   */
  alluxio.grpc.WorkerNetAddressOrBuilder getWorkerAddressOrBuilder();

  /**
   * <code>optional string tierAlias = 3;</code>
   */
  boolean hasTierAlias();
  /**
   * <code>optional string tierAlias = 3;</code>
   */
  java.lang.String getTierAlias();
  /**
   * <code>optional string tierAlias = 3;</code>
   */
  com.google.protobuf.ByteString
      getTierAliasBytes();

  /**
   * <code>optional string mediumType = 4;</code>
   */
  boolean hasMediumType();
  /**
   * <code>optional string mediumType = 4;</code>
   */
  java.lang.String getMediumType();
  /**
   * <code>optional string mediumType = 4;</code>
   */
  com.google.protobuf.ByteString
      getMediumTypeBytes();
}
