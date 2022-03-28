package cn.edu.sjtu.ist.ecssbackendcloud.service;

import cn.edu.sjtu.ist.ecssbackendcloud.entity.po.MaterialPO;

import java.util.List;

public interface MaterialService {
    MaterialPO findMaterialById(String id);

    MaterialPO findMaterialPOByName(String name);

    List<MaterialPO> findAll();

    void createMaterial(MaterialPO materialPO);
}
