package com.cqjtu.rmms.service.impl;

import com.cqjtu.rmms.entity.Department;
import com.cqjtu.rmms.mapper.DepartmentMapper;
import com.cqjtu.rmms.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public Department get(Integer departmentId) {
        return departmentMapper.selectByPrimaryKey(departmentId);
    }

    @Override
    public void addDepartment(Department department) {
        departmentMapper.insert(department);
    }

    @Override
    public void removeDepartment(Integer departmentId) {
        departmentMapper.deleteByPrimaryKey(departmentId);
    }

    @Override
    public void updateDepartment(Department department) {
        departmentMapper.updateByPrimaryKey(department);
    }

    @Override
    public List<Department> loadAll() {
        return departmentMapper.selectAll();
    }
}