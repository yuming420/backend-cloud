package cn.edu.sjtu.ist.ecssbackendcloud.repository;

import cn.edu.sjtu.ist.ecssbackendcloud.entity.po.MaterialPO;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MaterialRepository extends MongoRepository<MaterialPO, String> {

    MaterialPO findMaterialById(String id);

    MaterialPO findMaterialPOByName(String name);

    List<MaterialPO> findAll();
}
