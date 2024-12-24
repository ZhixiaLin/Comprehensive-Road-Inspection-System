package com.cqjtu.rmms.mapper;

import com.cqjtu.rmms.entity.Department;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
public interface DepartmentMapper extends Mapper<Department> {
    @Select("select * from Department where departmentName = #{departmentName}")
    Department selectByDepartmentName(String departmentName);
}