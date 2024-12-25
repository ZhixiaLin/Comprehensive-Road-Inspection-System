package com.cqjtu.rmms.entity;

import java.util.Date;

public class InspectionTask {
    private Integer inspectionTaskId; // 巡检任务的唯一标识
    private String inspectionTaskType; // 巡检任务的类型
    private Date inspectionStartTime; // 巡检任务的开始时间
    private Date inspectionEndTime; // 巡检任务的结束时间
    private String inspectionCycle; // 巡检任务的周期

    // Getters and Setters
    public Integer getInspectionTaskId() {
        return inspectionTaskId;
    }

    public void setInspectionTaskId(Integer inspectionTaskId) {
        this.inspectionTaskId = inspectionTaskId;
    }

    public String getInspectionTaskType() {
        return inspectionTaskType;
    }

    public void setInspectionTaskType(String inspectionTaskType) {
        this.inspectionTaskType = inspectionTaskType;
    }

    public Date getInspectionStartTime() {
        return inspectionStartTime;
    }

    public void setInspectionStartTime(Date inspectionStartTime) {
        this.inspectionStartTime = inspectionStartTime;
    }

    public Date getInspectionEndTime() {
        return inspectionEndTime;
    }

    public void setInspectionEndTime(Date inspectionEndTime) {
        this.inspectionEndTime = inspectionEndTime;
    }

    public String getInspectionCycle() {
        return inspectionCycle;
    }

    public void setInspectionCycle(String inspectionCycle) {
        this.inspectionCycle = inspectionCycle;
    }
}