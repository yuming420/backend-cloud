package cn.edu.sjtu.ist.ecssbackendcloud.service.impl;

import cn.edu.sjtu.ist.ecssbackendcloud.dao.BomDao;
import cn.edu.sjtu.ist.ecssbackendcloud.entity.po.BomPO;
import cn.edu.sjtu.ist.ecssbackendcloud.service.BomService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class BomServiceImpl implements BomService {

    @Autowired
    private BomDao bomDao;

    @Override
    public BomPO insertBom(BomPO bomPO) {
        BomPO bomPO1 = bomDao.createBom(bomPO);
        if (bomPO1 == null) {
            throw new RuntimeException("插入bom单失败!");
        } else {
            return bomPO1;
        }
    }

    @Override
    public void deleteBom(String id) {
        bomDao.removeBomPO(id);
    }

    @Override
    public BomPO updateBom(String id, BomPO bomPO) {

        bomPO.setId(id);
        bomDao.modifyBomPO(bomPO);

        BomPO bomPO1 = bomDao.findBomPOByName(bomPO.getName()).get(0);
        if (bomPO1 == null) {
            throw new RuntimeException("更新bom信息失败!");
        } else {
            return bomPO1;
        }
    }

    @Override
    public BomPO getBom(String id) {
        return bomDao.findBomPOById(id);
    }

    @Override
    public List<BomPO> getAllBoms() {
        return bomDao.findAllBomPOs();
    }
}
