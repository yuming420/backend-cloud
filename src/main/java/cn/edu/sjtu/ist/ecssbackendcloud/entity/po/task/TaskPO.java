package cn.edu.sjtu.ist.ecssbackendcloud.entity.po.task;

import cn.edu.sjtu.ist.ecssbackendcloud.entity.domain.task.TaskInfo;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;
import java.util.List;

@Data
@Document(collection = "Task")
public class TaskPO {
    @Id
    private String id;

    /*
     * 发布人
     */
    @Field
    private String owner;

    /*
     * 优先级
     */
    @Field
    private String priority;

    /*
    * 任务名称
    */
    @Field
    private String name;

    /*
    * 发布时间
    */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm", timezone = "GMT+8")
    private Date releaseTime;

    /*
    * 截止时间
    */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm", timezone = "GMT+8")
    private Date dueTime;

    /*
    * 完成时间 pattern = "yyyy-MM-dd HH:mm", timezone = "GMT+8"
    */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm", timezone = "GMT+8")
    private Date finishTime;

    /*
    状态
    创建完成/已发布/生产中/异常/正常结束/异常终止
     */
    @Field
    private String status;

    /*
     * 任务内容
     */
    @Field
    private List<TaskInfo> content;
}
