package cn.edu.sjtu.ist.ecssbackendcloud.entity.dto;

import cn.edu.sjtu.ist.ecssbackendcloud.entity.domain.bom.DataEntry;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BomDTO {

    /**
     * 设备id
     */
    private String id;
    /**
     * 设备名称
     */
    private String name;

    /**
     * 设备型号
     */
    private String model;

    /**
     * 设备描述，可有可无
     */
    private String description;

    /**
     * 设备的数据项列表
     */
    private List<DataEntry> values;
}
