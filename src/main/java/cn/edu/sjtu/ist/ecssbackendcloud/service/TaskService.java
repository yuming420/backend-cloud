package cn.edu.sjtu.ist.ecssbackendcloud.service;

import cn.edu.sjtu.ist.ecssbackendcloud.entity.po.task.TaskPO;

import java.util.List;

public interface TaskService {
    TaskPO insertTask(TaskPO taskPO);

    List<TaskPO> findAll();
}
