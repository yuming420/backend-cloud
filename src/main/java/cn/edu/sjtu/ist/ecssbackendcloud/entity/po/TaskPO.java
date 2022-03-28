package cn.edu.sjtu.ist.ecssbackendcloud.entity.po;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "Task")
public class TaskPO {
    @Id
    private String id;

    /*
    * 任务名称
    */
    @Field
    private String name;

    /*
    * 发布时间
    */
    @Field
    private String releaseTime;

    /*
    * 截止时间
    */
    @Field
    private String dueTime;

    /*
    * 完成时间
    */
    @Field
    private String finishTime;

    /*
    状态
    创建完成/已发布/生产中/异常/正常结束/异常终止
     */
    @Field
    private String status;


}
