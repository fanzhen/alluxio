// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/job_master.proto

package alluxio.grpc;

public interface ListAllPResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.job.ListAllPResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated int64 jobIds = 1;</code>
   */
  java.util.List<java.lang.Long> getJobIdsList();
  /**
   * <code>repeated int64 jobIds = 1;</code>
   */
  int getJobIdsCount();
  /**
   * <code>repeated int64 jobIds = 1;</code>
   */
  long getJobIds(int index);

  /**
   * <code>repeated .alluxio.grpc.job.JobInfo jobInfos = 2;</code>
   */
  java.util.List<alluxio.grpc.JobInfo> 
      getJobInfosList();
  /**
   * <code>repeated .alluxio.grpc.job.JobInfo jobInfos = 2;</code>
   */
  alluxio.grpc.JobInfo getJobInfos(int index);
  /**
   * <code>repeated .alluxio.grpc.job.JobInfo jobInfos = 2;</code>
   */
  int getJobInfosCount();
  /**
   * <code>repeated .alluxio.grpc.job.JobInfo jobInfos = 2;</code>
   */
  java.util.List<? extends alluxio.grpc.JobInfoOrBuilder> 
      getJobInfosOrBuilderList();
  /**
   * <code>repeated .alluxio.grpc.job.JobInfo jobInfos = 2;</code>
   */
  alluxio.grpc.JobInfoOrBuilder getJobInfosOrBuilder(
      int index);
}
