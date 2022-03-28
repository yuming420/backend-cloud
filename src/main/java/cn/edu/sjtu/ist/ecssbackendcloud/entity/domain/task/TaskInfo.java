package cn.edu.sjtu.ist.ecssbackendcloud.entity.domain.task;

import lombok.Data;

@Data
public class TaskInfo {

    /*
    * 名称
    */
    private String name;

    /*
    * 型号
    */
    private String model;

    /*
    * 数量
    */
    private String number;

    /*
    * bom单编号
    */
    private String bomID;

    /*
    * 详情
    */
    private String detail;
}
