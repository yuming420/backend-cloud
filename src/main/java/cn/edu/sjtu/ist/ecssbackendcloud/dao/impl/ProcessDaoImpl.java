package cn.edu.sjtu.ist.ecssbackendcloud.dao.impl;

import cn.edu.sjtu.ist.ecssbackendcloud.dao.ProcessDao;
import cn.edu.sjtu.ist.ecssbackendcloud.entity.po.ProcessPO;
import cn.edu.sjtu.ist.ecssbackendcloud.entity.domain.process.Process;
import cn.edu.sjtu.ist.ecssbackendcloud.repository.ProcessRepository;
import cn.edu.sjtu.ist.ecssbackendcloud.utils.convert.ProcessUtil;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @brief 流程 daoImpl
 * @author rsp
 * @version 0.1
 * @date 2021-11-26
 */
@Slf4j
@Component
public class ProcessDaoImpl implements ProcessDao {

    @Autowired
    private ProcessUtil processUtil;

    @Autowired
    private ProcessRepository processRepository;

    @Override
    public void createProcess(Process process) {
        ProcessPO po = processUtil.convertDomain2PO(process);
        processRepository.save(po);
    }

    @Override
    public void removeProcess(String id) {
        processRepository.deleteProcessPOById(id);
    }

    @Override
    public void modifyProcess(Process process) {
        ProcessPO po = processRepository.findProcessById(process.getId());
        if (po != null) {
            po = processUtil.convertDomain2PO(process);
            processRepository.save(po);
        }
    }

    @Override
    public Process findProcessById(String id) {
        ProcessPO po = processRepository.findProcessById(id);
        Process process = processUtil.convertPO2Domain(po);
        log.info(String.valueOf(process));
        return process;
    }

    @Override
    public List<Process> findProcessByName(String name) {
        List<ProcessPO> processPOs = processRepository.findProcessPOSByName(name);
        List<Process> processes = new ArrayList<>();
        for (ProcessPO processPO: processPOs) {
            Process dm = processUtil.convertPO2Domain(processPO);
            processes.add(dm);
        }
        return processes;
    }

    @Override
    public List<Process> findProcessesByOwner(String owner) {
        List<ProcessPO> processPOs = processRepository.findProcessPOSByOwner(owner);
        List<Process> processes = new ArrayList<>();
        for (ProcessPO processPO: processPOs) {
            Process dm = processUtil.convertPO2Domain(processPO);
            processes.add(dm);
        }
        return processes;
    }

    @Override
    public List<Process> findAllProcesses() {
        List<ProcessPO> processPOs = processRepository.findAll();
        List<Process> processes = new ArrayList<>();
        for (ProcessPO processPO: processPOs) {
            Process dm = processUtil.convertPO2Domain(processPO);
            processes.add(dm);
        }
        return processes;
    }
}
