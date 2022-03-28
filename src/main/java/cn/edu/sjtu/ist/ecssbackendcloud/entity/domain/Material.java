package cn.edu.sjtu.ist.ecssbackendcloud.entity.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Material {
    private String id;

    private String name;

    private String supplier;

    private String annotation;
}
