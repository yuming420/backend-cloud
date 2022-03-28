package cn.edu.sjtu.ist.ecssbackendcloud.entity.po;

import cn.edu.sjtu.ist.ecssbackendcloud.entity.domain.bom.DataEntry;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Data
@Document(collection = "bom")
public class BomPO {
    /**
     * id
     */
    @Id
    private String id;

    /**
     * 名称
     */
    @Field
    private String name;

    /**
     * 型号
     */
    @Field
    private String model;

    /**
     * 描述
     */
    @Field
    private String description;

    /**
     * 设备的数据项列表
     */
    @Field
    private List<DataEntry> values;
}
