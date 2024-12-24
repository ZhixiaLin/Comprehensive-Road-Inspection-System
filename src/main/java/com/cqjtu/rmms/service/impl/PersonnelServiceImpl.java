package com.cqjtu.rmms.service.impl;

import com.cqjtu.rmms.entity.PersonnelInformation;
import com.cqjtu.rmms.mapper.PersonnelMapper;
import com.cqjtu.rmms.service.PersonnelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class PersonnelServiceImpl implements PersonnelService {

    @Autowired
    private PersonnelMapper personnelMapper;

    @Override
    public PersonnelInformation get(Integer employeeId) {
        return personnelMapper.selectByPrimaryKey(employeeId);
    }

    @Override
    public void addPersonnel(PersonnelInformation personnel) {
        personnelMapper.insert(personnel);
    }

    @Override
    public void removePersonnel(Integer employeeId) {
        personnelMapper.deleteByPrimaryKey(employeeId);
    }

    @Override
    public void updatePersonnel(PersonnelInformation personnel) {
        personnelMapper.updateByPrimaryKey(personnel);
    }

    @Override
    public List<PersonnelInformation> loadAll() {
        // 使用新的联表查询方法
        return personnelMapper.selectAllWithDepartment();
    }
}