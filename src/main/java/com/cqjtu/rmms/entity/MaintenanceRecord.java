package com.cqjtu.rmms.entity;
import org.springframework.stereotype.Component;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.io.Serializable;

@Component
@Table(name = "MaintenanceRecord")
public class MaintenanceRecord implements Serializable {

    @Id
    @Column(name = "maintenanceRecordId")
    private Integer maintenanceRecordId;

    @Column(name = "employeeId")
    private Integer employeeId;

    @Column(name = "vehicleId")
    private Integer vehicleId;

    @Column(name = "diseaseRecordId")
    private Integer diseaseRecordId;

    @Column(name = "maintenanceTime")
    private LocalDateTime maintenanceTime;

    @Column(name = "maintenanceStatus")
    private String maintenanceStatus;

    @Column(name = "maintenanceReview")
    private String maintenanceReview;

    public Integer getMaintenanceRecordId() {
        return maintenanceRecordId;
    }

    public void setMaintenanceRecordId(Integer maintenanceRecordId) {
        this.maintenanceRecordId = maintenanceRecordId;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Integer vehicleId) {
        this.vehicleId = vehicleId;
    }

    public Integer getDiseaseRecordId() {
        return diseaseRecordId;
    }

    public void setDiseaseRecordId(Integer diseaseRecordId) {
        this.diseaseRecordId = diseaseRecordId;
    }

    public LocalDateTime getMaintenanceTime() {
        return maintenanceTime;
    }

    public void setMaintenanceTime(LocalDateTime maintenanceTime) {
        this.maintenanceTime = maintenanceTime;
    }

    public String getMaintenanceStatus() {
        return maintenanceStatus;
    }

    public void setMaintenanceStatus(String maintenanceStatus) {
        this.maintenanceStatus = maintenanceStatus;
    }

    public String getMaintenanceReview() {
        return maintenanceReview;
    }

    public void setMaintenanceReview(String maintenanceReview) {
        this.maintenanceReview = maintenanceReview;
    }
}
