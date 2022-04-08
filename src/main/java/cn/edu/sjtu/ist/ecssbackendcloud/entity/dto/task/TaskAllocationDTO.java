package cn.edu.sjtu.ist.ecssbackendcloud.entity.dto.task;

import cn.edu.sjtu.ist.ecssbackendcloud.entity.domain.task.TaskAllocationInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskAllocationDTO {
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
