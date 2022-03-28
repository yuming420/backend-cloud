package cn.edu.sjtu.ist.ecssbackendcloud.controller;

import cn.edu.sjtu.ist.ecssbackendcloud.entity.po.MaterialPO;
import cn.edu.sjtu.ist.ecssbackendcloud.service.MaterialService;
import cn.edu.sjtu.ist.ecssbackendcloud.utils.response.Result;
import cn.edu.sjtu.ist.ecssbackendcloud.utils.response.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Slf4j
@RestController
@RequestMapping(value = "/material")
public class MaterialController {

    @Autowired
    private MaterialService materialService;

    @GetMapping(value = "/all")
    public Result<List<MaterialPO>> getAll(){
        return ResultUtil.success(materialService.findAll());
    }

    @GetMapping(value = "/getById/{id}")
    public Result<MaterialPO> getById(@PathVariable String id){
        return ResultUtil.success(materialService.findMaterialById(id));
    }

    @GetMapping(value = "/getByName/{name}")
    public Result<MaterialPO> getByName(@PathVariable String name){
        return ResultUtil.success(materialService.findMaterialPOByName(name));
    }

    @PostMapping(value = "/add")
    public Result<?> addMaterial(@RequestBody MaterialPO materialPO){
        log.info("添加材料");
        materialService.createMaterial(materialPO);
        return ResultUtil.success();
    }
}
