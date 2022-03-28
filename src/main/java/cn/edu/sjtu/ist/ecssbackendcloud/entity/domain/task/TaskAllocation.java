/*
* 任务分配情况
*/
package cn.edu.sjtu.ist.ecssbackendcloud.entity.domain.task;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
public class TaskAllocation {
    /*
    * id
    */
    private String id;

    /*
    * task id
    */
    private String taskID;

    /*
    * 分配情况
    */
    private List<TaskAllocationInfo> allocationInfoList;

}
