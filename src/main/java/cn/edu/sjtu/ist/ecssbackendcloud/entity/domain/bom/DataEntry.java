package cn.edu.sjtu.ist.ecssbackendcloud.entity.domain.bom;

import lombok.Data;

@Data
public class DataEntry {
    /**
     * 数据项的名称
     */
    private String name;

    /**
     * 数据项对应的sensor
     */
    private String number;
}
