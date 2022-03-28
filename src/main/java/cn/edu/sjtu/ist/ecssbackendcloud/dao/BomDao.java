package cn.edu.sjtu.ist.ecssbackendcloud.dao;

import cn.edu.sjtu.ist.ecssbackendcloud.entity.po.BomPO;

import java.util.List;

public interface BomDao {
    BomPO createBom(BomPO bomPO);

    void removeBomPO(String id);

    void modifyBomPO(BomPO bomPO);

    BomPO findBomPOById(String id);

    List<BomPO> findBomPOByName(String name);

    List<BomPO> findAllBomPOs();
}
