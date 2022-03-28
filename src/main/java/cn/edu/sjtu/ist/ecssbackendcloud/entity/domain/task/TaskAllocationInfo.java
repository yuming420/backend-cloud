package cn.edu.sjtu.ist.ecssbackendcloud.entity.domain.task;

public class TaskAllocationInfo {
    /*
    * id
    */
    private String id;

    /*
    * 边
    */
    private String edgeID;

    /*
    * 任务内容
    */
    private TaskInfo taskInfo;

    /*
    * 生产数量
    */
    private String number;

    /*
    * 已经生产数量
    */
    private String producedNumber;
}
