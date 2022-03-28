package cn.edu.sjtu.ist.ecssbackendcloud.entity.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.bson.types.Binary;

import javax.persistence.Id;
import java.util.Date;

/**
 * @author dyanjun
 * @date 2021/11/28 14:48
 */
@Data
public class DataPackage {

    private String id;

    private String name;

    private String edgeId;

    private String edgeName;

    private String contentType; // 文件类型

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss.SSS", timezone = "GMT+8")
    private Date timestamp;

    private long size;

    private String md5;

    private Binary content; // 文件内容
}
