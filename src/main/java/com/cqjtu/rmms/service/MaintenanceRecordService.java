package com.cqjtu.rmms.service;

import com.cqjtu.rmms.entity.DiseaseRecord;
import com.cqjtu.rmms.entity.MaintenanceRecord;

import java.util.List;

public interface MaintenanceRecordService {
    MaintenanceRecord get(Integer maintenanceRecord);
    List<MaintenanceRecord> loadAll();
    MaintenanceRecord getMaintenanceRecordById(Integer maintenanceRecordId);

    void updateMaintenanceRecord(MaintenanceRecord maintenanceRecord);

    void addMaintenanceRecord(MaintenanceRecord maintenanceRecord);

    void removeMaintenanceRecord(Integer maintenanceRecordId);

    Integer getMaxMaintenanceRecordId();
}
