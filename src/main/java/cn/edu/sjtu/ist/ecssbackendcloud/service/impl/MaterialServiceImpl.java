package cn.edu.sjtu.ist.ecssbackendcloud.service.impl;

import cn.edu.sjtu.ist.ecssbackendcloud.dao.MaterialDao;
import cn.edu.sjtu.ist.ecssbackendcloud.entity.po.MaterialPO;
import cn.edu.sjtu.ist.ecssbackendcloud.service.MaterialService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Slf4j
@Service
public class MaterialServiceImpl implements MaterialService {
    @Autowired
    private MaterialDao materialDao;

    @Override
    public MaterialPO findMaterialById(String id){
        return materialDao.findMaterialById(id);
    };

    @Override
    public MaterialPO findMaterialPOByName(String name){
        return materialDao.findMaterialPOByName(name);
    };

    @Override
    public List<MaterialPO> findAll(){
        log.info("获取所有原料成功");
        return materialDao.findAll();
    };

    @Override
    public void createMaterial(MaterialPO materialPO){
        log.info("添加原料成功");
        materialDao.createMaterial(materialPO);
    };
}
