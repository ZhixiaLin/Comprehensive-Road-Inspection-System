package com.cqjtu.rmms.service;

import com.cqjtu.rmms.entity.Department;
import java.util.List;

public interface DepartmentService {
    Department get(Integer departmentId);
    void addDepartment(Department department);
    void removeDepartment(Integer departmentId);
    void updateDepartment(Department department);
    List<Department> loadAll();
}