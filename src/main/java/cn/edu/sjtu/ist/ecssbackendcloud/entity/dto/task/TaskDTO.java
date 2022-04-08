package cn.edu.sjtu.ist.ecssbackendcloud.entity.dto.task;

import cn.edu.sjtu.ist.ecssbackendcloud.entity.domain.task.TaskInfo;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskDTO {
    /*
     * id
     */
    private String id;

    /*
     * 发布人
     */
    private String owner;

    /*
     * 优先级
     */
    private String priority;

    /*
     * 任务名称
     */
    private String name;

    /*
     * 发布时间
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss.SSS", timezone = "GMT+8")
    private Date releaseTime;

    /*
     * 截止时间
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss.SSS", timezone = "GMT+8")
    private Date dueTime;

    /*
     * 完成时间
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss.SSS", timezone = "GMT+8")
    private Date finishTime;

    /*
    状态
    创建完成/已发布/生产中/异常/正常结束/异常终止
     */
    private String status;

    /*
     * 任务内容
     */
    private List<TaskInfo> content;
}
