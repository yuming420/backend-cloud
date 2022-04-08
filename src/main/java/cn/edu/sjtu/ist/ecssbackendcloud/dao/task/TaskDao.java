package cn.edu.sjtu.ist.ecssbackendcloud.dao.task;

import cn.edu.sjtu.ist.ecssbackendcloud.entity.po.task.TaskPO;

import java.util.List;

public interface TaskDao {
    TaskPO createTask(TaskPO taskPO);

    List<TaskPO> findAllTaskPOs();
}
