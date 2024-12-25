package com.cqjtu.rmms.mapper;

import com.cqjtu.rmms.entity.InspectionTask;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface InspectionTaskMapper {

    @Insert("INSERT INTO InspectionTask (inspectionTaskId, inspectionTaskType, inspectionStartTime, inspectionEndTime, inspectionCycle) VALUES (#{inspectionTaskId}, #{inspectionTaskType}, #{inspectionStartTime}, #{inspectionEndTime}, #{inspectionCycle})")
    void insertInspectionTask(InspectionTask inspectionTask);

    @Delete("DELETE FROM InspectionTask WHERE inspectionTaskId = #{inspectionTaskId}")
    void deleteInspectionTask(Integer inspectionTaskId);

    @Update("UPDATE InspectionTask SET inspectionTaskType = #{inspectionTaskType}, inspectionStartTime = #{inspectionStartTime}, inspectionEndTime = #{inspectionEndTime}, inspectionCycle = #{inspectionCycle} WHERE inspectionTaskId = #{inspectionTaskId}")
    void updateInspectionTask(InspectionTask inspectionTask);

    @Select("SELECT * FROM InspectionTask WHERE inspectionTaskId = #{inspectionTaskId}")
    InspectionTask selectInspectionTaskById(Integer inspectionTaskId);

    @Select("SELECT * FROM InspectionTask")
    List<InspectionTask> selectAllInspectionTasks();
}