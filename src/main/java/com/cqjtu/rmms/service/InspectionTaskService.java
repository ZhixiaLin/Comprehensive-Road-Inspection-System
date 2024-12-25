package com.cqjtu.rmms.service;

import com.cqjtu.rmms.entity.InspectionTask;

import java.util.List;

public interface InspectionTaskService {
    void addInspectionTask(InspectionTask inspectionTask);
    void removeInspectionTask(Integer inspectionTaskId);
    void updateInspectionTask(InspectionTask inspectionTask);
    InspectionTask getInspectionTaskById(Integer inspectionTaskId);
    List<InspectionTask> loadAll();
}