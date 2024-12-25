package com.cqjtu.rmms.entity;

import org.springframework.stereotype.Component;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Component
@Table(name = "VehicleInformation")
public class VehicleInformation implements Serializable {

    @Id
    @Column(name = "vehicleId")
    private Integer vehicleId;

    @Column(name = "vehicleType")
    private String vehicleType;

    @Column(name = "vehicleStatus")
    private Boolean vehicleStatus;

    public Integer getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Integer vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Boolean getVehicleStatus() {
        return vehicleStatus;
    }

    public void setVehicleStatus(Boolean vehicleStatus) {
        this.vehicleStatus = vehicleStatus;
    }
}