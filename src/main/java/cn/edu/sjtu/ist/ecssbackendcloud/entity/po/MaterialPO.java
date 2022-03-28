package cn.edu.sjtu.ist.ecssbackendcloud.entity.po;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.Id;

@Data
@Document("Material")
public class MaterialPO {
    @Id
    private String id;

    @Field
    private String name;

    @Field
    private String supplier;

    @Field
    private String annotation;
}
