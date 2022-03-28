package cn.edu.sjtu.ist.ecssbackendcloud.dao.impl;

import cn.edu.sjtu.ist.ecssbackendcloud.dao.MaterialDao;
import cn.edu.sjtu.ist.ecssbackendcloud.entity.po.MaterialPO;
import cn.edu.sjtu.ist.ecssbackendcloud.repository.MaterialRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class MaterialDaoImpl implements MaterialDao {
    @Autowired
    private MaterialRepository materialRepository;

    @Override
    public MaterialPO findMaterialById(String id){
        return materialRepository.findMaterialById(id);
    };

    @Override
    public MaterialPO findMaterialPOByName(String name){
        return materialRepository.findMaterialPOByName(name);
    };

    @Override
    public List<MaterialPO> findAll(){
        return materialRepository.findAll();
    };

    @Override
    public void createMaterial(MaterialPO materialPO){
        materialRepository.insert(materialPO);
    };
}
