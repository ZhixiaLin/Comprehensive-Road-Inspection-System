package com.cqjtu.rmms.mapper;

import com.cqjtu.rmms.entity.DiseaseRecord;
import com.cqjtu.rmms.entity.MaintenanceRecord;
import com.cqjtu.rmms.entity.PersonnelInformation;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface MaintenanceRecordMapper {
    @Select("SELECT * FROM MaintenanceRecord WHERE maintenanceRecordId = #{maintenanceRecordId}")
    MaintenanceRecord selectByPrimaryKey(Integer maintenanceRecordId);
    @Select("SELECT * FROM MaintenanceRecord")
    List<MaintenanceRecord> selectAll();
    @Insert("INSERT INTO MaintenanceRecord (maintenanceRecordId, employeeId, vehicleId, diseaseRecordId, maintenanceTime, maintenanceStatus, maintenanceReview) " +
            "VALUES (#{maintenanceRecordId}, #{employeeId}, #{vehicleId}, #{diseaseRecordId}, #{maintenanceTime}, #{maintenanceStatus}, #{maintenanceReview})")
    void insertMaintenanceRecord(MaintenanceRecord maintenanceRecord);
    @Update("UPDATE MaintenanceRecord SET employeeId = #{employeeId}, " +
            "vehicleId = #{vehicleId}, diseaseRecordId = #{diseaseRecordId}, maintenanceTime = #{maintenanceTime}, " +
            "maintenanceStatus = #{maintenanceStatus}, maintenanceReview = #{maintenanceReview} " +
            "WHERE maintenanceRecordId = #{maintenanceRecordId}")
    void updateByPrimaryKey(MaintenanceRecord maintenanceRecord);
    @Delete("DELETE FROM MaintenanceRecord WHERE maintenanceRecordId = #{maintenanceRecordId}")
    void deleteByPrimaryKey(Integer maintenanceRecordId);
    @Select("SELECT MAX(maintenanceRecordId) FROM MaintenanceRecord")
    Integer getMaxMaintenanceRecordId();
}
