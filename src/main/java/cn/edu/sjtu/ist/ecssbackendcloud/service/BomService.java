package cn.edu.sjtu.ist.ecssbackendcloud.service;

import cn.edu.sjtu.ist.ecssbackendcloud.entity.po.BomPO;

import java.util.List;

public interface BomService {
    BomPO insertBom(BomPO bomPO);

    void deleteBom(String id);

    BomPO updateBom(String id, BomPO bomPO);

    BomPO getBom(String id);

    List<BomPO> getAllBoms();
}
