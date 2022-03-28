package cn.edu.sjtu.ist.ecssbackendcloud.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MaterialDTO {
    private String id;

    private String name;

    private String supplier;

    private String annotation;
}
