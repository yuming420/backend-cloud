package cn.edu.sjtu.ist.ecssbackendcloud.dao.impl;

import cn.edu.sjtu.ist.ecssbackendcloud.dao.task.TaskDao;
import cn.edu.sjtu.ist.ecssbackendcloud.entity.po.BomPO;
import cn.edu.sjtu.ist.ecssbackendcloud.entity.po.task.TaskPO;
import cn.edu.sjtu.ist.ecssbackendcloud.repository.TaskRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class TaskDaoImpl implements TaskDao {
    @Autowired
    private TaskRepository taskRepository;

    @Override
    public TaskPO createTask(TaskPO taskPO) {
        taskRepository.save(taskPO);
        return taskPO;
    }

    @Override
    public List<TaskPO> findAllTaskPOs(){
        return taskRepository.findAll();
    }
}
