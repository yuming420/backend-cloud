package cn.edu.sjtu.ist.ecssbackendcloud.repository;

import cn.edu.sjtu.ist.ecssbackendcloud.entity.po.BomPO;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BomRepository extends MongoRepository<BomPO, String> {
    void deleteBomPOById(String id);

    BomPO findBomPOById(String id);

    List<BomPO> findBomPOByName(String name);

    List<BomPO> findAll();
}
