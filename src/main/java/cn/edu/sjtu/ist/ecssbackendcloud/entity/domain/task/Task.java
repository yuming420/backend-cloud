package cn.edu.sjtu.ist.ecssbackendcloud.entity.domain.task;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
public class Task {
    /*
    * id
    */
    private String id;

    /*
    * 发布人
    */
    private String owner;

    /*
     * 任务名称
     */
    private String name;

    /*
     * 发布时间
     */
    private String releaseTime;

    /*
     * 截止时间
     */
    private String dueTime;

    /*
     * 完成时间
     */
    private String finishTime;

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
