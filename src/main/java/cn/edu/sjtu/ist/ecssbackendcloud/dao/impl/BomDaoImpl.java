package cn.edu.sjtu.ist.ecssbackendcloud.dao.impl;

import cn.edu.sjtu.ist.ecssbackendcloud.dao.BomDao;
import cn.edu.sjtu.ist.ecssbackendcloud.entity.po.BomPO;
import cn.edu.sjtu.ist.ecssbackendcloud.repository.BomRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Component
public class BomDaoImpl implements BomDao {

    @Autowired
    private BomRepository bomRepository;

    @Override
    public BomPO createBom(BomPO bomPO) {
        bomRepository.save(bomPO);
        return bomPO;
    }

    @Override
    public void removeBomPO(String id) {
        bomRepository.deleteBomPOById(id);
    }

    @Override
    public void modifyBomPO(BomPO bomPO) {
        if (bomPO != null) {
            bomRepository.save(bomPO);
        }
    }

    @Override
    public BomPO findBomPOById(String id) {
        BomPO bomPO = bomRepository.findBomPOById(id);
        log.info(String.valueOf(bomPO));
        return bomPO;
    }

    @Override
    public List<BomPO> findBomPOByName(String name) {
        return bomRepository.findBomPOByName(name);
    }

    @Override
    public List<BomPO> findAllBomPOs() {
        return bomRepository.findAll();
    }
}
