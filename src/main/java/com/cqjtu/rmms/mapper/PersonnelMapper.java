package com.cqjtu.rmms.mapper;

import com.cqjtu.rmms.entity.PersonnelInformation;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PersonnelMapper {
    @Select("SELECT * FROM PersonnelInformation WHERE employeeId = #{employeeId}")
    PersonnelInformation selectByPrimaryKey(Integer employeeId);

    @Select("SELECT * FROM PersonnelInformation WHERE employeeName = #{employeeName}")
    PersonnelInformation selectByEmployeeName(String employeeName);

    @Select("SELECT * FROM PersonnelInformation")
    List<PersonnelInformation> selectAll();

    @Insert("INSERT INTO PersonnelInformation (employeeId, employeeName, departmentId, employeeStatus, position) " +
            "VALUES (#{employeeId}, #{employeeName}, #{departmentId}, #{employeeStatus}, #{position})")
    void insert(PersonnelInformation personnel);

    @Update("UPDATE PersonnelInformation SET employeeName = #{employeeName}, departmentId = #{departmentId}, " +
            "employeeStatus = #{employeeStatus}, position = #{position} WHERE employeeId = #{employeeId}")
    void updateByPrimaryKey(PersonnelInformation personnel);

    @Delete("DELETE FROM PersonnelInformation WHERE employeeId = #{employeeId}")
    void deleteByPrimaryKey(Integer employeeId);
}