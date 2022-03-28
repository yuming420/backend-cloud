package cn.edu.sjtu.ist.ecssbackendcloud.entity.domain.bom;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author rsp
 * @version 0.1
 * @brief 设备
 * @date 2021-11-08
 */
@Data
@Component
public class Bom {

    private String id;

    /**
     * 名称
     */
    private String name;

    /**
     * 型号
     */
    private String model;

    /**
     * 描述，可有可无
     */
    private String description;

    /**
     * 原料列表
     */
    private List<DataEntry> values;

}

