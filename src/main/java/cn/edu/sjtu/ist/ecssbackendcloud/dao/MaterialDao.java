package cn.edu.sjtu.ist.ecssbackendcloud.dao;

import cn.edu.sjtu.ist.ecssbackendcloud.entity.po.MaterialPO;
import cn.edu.sjtu.ist.ecssbackendcloud.entity.po.ModelInfoPO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface MaterialDao{

    MaterialPO findMaterialById(String id);

    MaterialPO findMaterialPOByName(String name);

    List<MaterialPO> findAll();

    void createMaterial(MaterialPO materialPO);
}
