package com.cqjtu.rmms.service.impl;

import com.cqjtu.rmms.entity.MaintenanceRecord;
import com.cqjtu.rmms.mapper.MaintenanceRecordMapper;
import com.cqjtu.rmms.service.MaintenanceRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class MaintenanceRecordServiceImpl implements MaintenanceRecordService {
    @Autowired
    private MaintenanceRecordMapper maintenanceRecordMapper;
    @Override
    public MaintenanceRecord get(Integer maintenanceRecord) {
        return maintenanceRecordMapper.selectByPrimaryKey(maintenanceRecord);
    }
    @Override
    public List<MaintenanceRecord> loadAll() {
        // 使用新的联表查询方法
        return maintenanceRecordMapper.selectAll();
    }

    @Override
    public MaintenanceRecord getMaintenanceRecordById(Integer maintenanceRecordId) {
        return maintenanceRecordMapper.selectByPrimaryKey(maintenanceRecordId);
    }

    @Override
    public void updateMaintenanceRecord(MaintenanceRecord maintenanceRecord) {
        maintenanceRecordMapper.updateByPrimaryKey(maintenanceRecord);
    }
    @Override
    public void addMaintenanceRecord(MaintenanceRecord maintenanceRecord) {
        maintenanceRecordMapper.insertMaintenanceRecord(maintenanceRecord);
    }

    @Override
    public void removeMaintenanceRecord(Integer maintenanceRecordId) {
        maintenanceRecordMapper.deleteByPrimaryKey(maintenanceRecordId);
    }
    @Override
    public Integer getMaxMaintenanceRecordId() {
        return maintenanceRecordMapper.getMaxMaintenanceRecordId();
    }
}
