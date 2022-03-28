package cn.edu.sjtu.ist.ecssbackendcloud.entity.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.bson.types.Binary;

import java.util.Date;

@Data
public class TaskPackage {
    private String id;//任务id

    private String name;//任务名称

    private String cloudId;//发布人id

    private String state;//状态

    private String contentType; // 文件类型

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss.SSS", timezone = "GMT+8")
    private Date timestamp;

    private long size;

    private String md5;

    private Binary content; // 文件内容
}
