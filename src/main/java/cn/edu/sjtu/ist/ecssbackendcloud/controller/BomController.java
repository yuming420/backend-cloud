package cn.edu.sjtu.ist.ecssbackendcloud.controller;

import cn.edu.sjtu.ist.ecssbackendcloud.entity.po.BomPO;
import cn.edu.sjtu.ist.ecssbackendcloud.service.BomService;
import cn.edu.sjtu.ist.ecssbackendcloud.utils.response.Result;
import cn.edu.sjtu.ist.ecssbackendcloud.utils.response.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "/bom")
public class BomController {
    @Autowired
    private BomService bomService;

    @PostMapping(value = "")
    public Result<BomPO> insertBom(@RequestBody BomPO bomPO) {
        log.info("添加bom单");
        return ResultUtil.success(bomService.insertBom(bomPO));
    }

    @DeleteMapping(value = "/{id}")
    public Result deleteBom(@PathVariable String id) {
        bomService.deleteBom(id);
        return ResultUtil.success();
    }

    @PutMapping(value = "/{id}")
    public Result<BomPO> updateBom(@PathVariable String id, @RequestBody BomPO bomPO) {
        return ResultUtil.success(bomService.updateBom(id, bomPO));
    }

    @GetMapping(value = "/{id}")
    public Result<BomPO> getBom(@PathVariable String id) {
        return ResultUtil.success(bomService.getBom(id));
    }

    @GetMapping(value = "")
    public Result<List<BomPO>> getAllBoms() {
        return ResultUtil.success(bomService.getAllBoms());
    }
}
