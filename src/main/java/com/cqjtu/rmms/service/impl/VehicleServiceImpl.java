package com.cqjtu.rmms.service.impl;

import com.cqjtu.rmms.entity.VehicleInformation;
import com.cqjtu.rmms.mapper.VehicleMapper;
import com.cqjtu.rmms.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private VehicleMapper vehicleMapper;

    @Override
    public VehicleInformation get(Integer vehicleId) {
        return vehicleMapper.selectByPrimaryKey(vehicleId);
    }

    @Override
    public void addVehicle(VehicleInformation vehicle) {
        vehicleMapper.insert(vehicle);
    }

    @Override
    public void updateVehicle(VehicleInformation vehicle) {
        vehicleMapper.updateByPrimaryKey(vehicle);
    }

    @Override
    public void dispatchVehicle(VehicleInformation vehicle) {
        vehicle.setVehicleStatus(false);  // 派出时设置为 false
        vehicleMapper.updateByPrimaryKey(vehicle);
    }

    @Override
    public void returnVehicle(VehicleInformation vehicle) {
        vehicle.setVehicleStatus(true);   // 入库时设置为 true
        vehicleMapper.updateByPrimaryKey(vehicle);
    }

    @Override
    public boolean getVehicleStatus(Integer vehicleId) {
        VehicleInformation vehicle = vehicleMapper.selectByPrimaryKey(vehicleId);
        return vehicle != null && vehicle.getVehicleStatus();
    }

    @Override
    public List<VehicleInformation> loadAll() {
        return vehicleMapper.selectAll();
    }
}