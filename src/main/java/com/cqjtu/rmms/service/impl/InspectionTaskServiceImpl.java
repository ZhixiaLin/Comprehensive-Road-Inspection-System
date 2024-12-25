package com.cqjtu.rmms.service.impl;

import com.cqjtu.rmms.service.InspectionTaskService;
import com.cqjtu.rmms.entity.InspectionTask;
import com.cqjtu.rmms.mapper.InspectionTaskMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InspectionTaskServiceImpl implements InspectionTaskService {

    @Autowired
    private InspectionTaskMapper inspectionTaskMapper;

    @Override
    public void addInspectionTask(InspectionTask inspectionTask) {
        inspectionTaskMapper.insertInspectionTask(inspectionTask);
    }

    @Override
    public void removeInspectionTask(Integer inspectionTaskId) {
        inspectionTaskMapper.deleteInspectionTask(inspectionTaskId);
    }

    @Override
    public void updateInspectionTask(InspectionTask inspectionTask) {
        inspectionTaskMapper.updateInspectionTask(inspectionTask);
    }

    @Override
    public InspectionTask getInspectionTaskById(Integer inspectionTaskId) {
        return inspectionTaskMapper.selectInspectionTaskById(inspectionTaskId);
    }

    @Override
    public List<InspectionTask> loadAll() {
        return inspectionTaskMapper.selectAllInspectionTasks();
    }
}