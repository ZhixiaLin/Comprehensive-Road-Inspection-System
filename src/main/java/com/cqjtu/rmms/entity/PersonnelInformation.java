package com.cqjtu.rmms.entity;

import org.springframework.stereotype.Component;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;

@Component
@Table(name = "PersonnelInformation")
public class PersonnelInformation implements Serializable {

    @Id
    @Column(name = "employeeId")
    private Integer employeeId;

    @Column(name = "employeeName")
    private String employeeName;

    @Column(name = "departmentId")
    private Integer departmentId;

    @Column(name = "employeeStatus")
    private String employeeStatus;

    @Column(name = "position")
    private String position;

    // Getters and Setters
    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getEmployeeStatus() {
        return employeeStatus;
    }

    public void setEmployeeStatus(String employeeStatus) {
        this.employeeStatus = employeeStatus;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


    // 新增字段（不对应数据库字段）
    @Transient  // 标记该字段不是数据库字段
    private String departmentName;

    // getter和setter方法
    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}