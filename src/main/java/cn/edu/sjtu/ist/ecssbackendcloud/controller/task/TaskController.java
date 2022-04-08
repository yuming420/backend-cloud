package cn.edu.sjtu.ist.ecssbackendcloud.controller.task;

import cn.edu.sjtu.ist.ecssbackendcloud.entity.po.task.TaskPO;
import cn.edu.sjtu.ist.ecssbackendcloud.service.TaskService;
import cn.edu.sjtu.ist.ecssbackendcloud.utils.response.Result;
import cn.edu.sjtu.ist.ecssbackendcloud.utils.response.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "/task")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @PostMapping(value = "/add")
    public Result<TaskPO> addTask(@RequestBody TaskPO taskPO) {
        log.info("添加新任务");
        return ResultUtil.success(taskService.insertTask(taskPO));
    }

    @PutMapping(value="/modify")
    public Result<TaskPO> modifyTask(@RequestBody TaskPO taskPO) {
        log.info("修改任务");
        return null;
    }

    @DeleteMapping(value="/delete")
    public Result deleteTask(@PathVariable String id) {
        log.info("删除任务");
        return ResultUtil.success();
    }

    @GetMapping(value = "")
    public Result<List<TaskPO>> getTask() {
        log.info("获取所有任务");
        return ResultUtil.success(taskService.findAll());
    }
}
