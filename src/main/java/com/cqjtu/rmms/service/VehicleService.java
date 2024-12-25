package com.cqjtu.rmms.service;

import com.cqjtu.rmms.entity.VehicleInformation;
import java.util.List;

public interface VehicleService {
    VehicleInformation get(Integer vehicleId);
    void addVehicle(VehicleInformation vehicle);
    void updateVehicle(VehicleInformation vehicle);
    void dispatchVehicle(VehicleInformation vehicle);  // 派出
    void returnVehicle(VehicleInformation vehicle);    // 入库
    boolean getVehicleStatus(Integer vehicleId);
    List<VehicleInformation> loadAll();
}