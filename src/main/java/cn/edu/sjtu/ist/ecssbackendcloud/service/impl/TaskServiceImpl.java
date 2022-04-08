package cn.edu.sjtu.ist.ecssbackendcloud.service.impl;

import cn.edu.sjtu.ist.ecssbackendcloud.dao.task.TaskDao;
import cn.edu.sjtu.ist.ecssbackendcloud.entity.po.BomPO;
import cn.edu.sjtu.ist.ecssbackendcloud.entity.po.task.TaskPO;
import cn.edu.sjtu.ist.ecssbackendcloud.service.TaskService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    private TaskDao taskDao;

    @Override
    public TaskPO insertTask(TaskPO taskPO) {
        TaskPO taskPO1 = taskDao.createTask(taskPO);
        if (taskPO1 == null) {
            throw new RuntimeException("插入任务失败!");
        } else {
            return taskPO1;
        }
    }

    @Override
    public List<TaskPO> findAll(){
        return taskDao.findAllTaskPOs();
    }
}
