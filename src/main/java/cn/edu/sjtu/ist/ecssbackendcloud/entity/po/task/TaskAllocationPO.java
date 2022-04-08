package cn.edu.sjtu.ist.ecssbackendcloud.entity.po.task;

import cn.edu.sjtu.ist.ecssbackendcloud.entity.domain.task.TaskAllocationInfo;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.Id;
import java.util.List;

@Data
@Document(collection = "TaskAllocation")
public class TaskAllocationPO {
    /*
     * id
     */
    @Id
    private String id;

    /*
     * task id
     */
    @Field
    private String taskID;

    /*
     * 分配情况
     */
    @Field
    private List<TaskAllocationInfo> allocationInfoList;
}
