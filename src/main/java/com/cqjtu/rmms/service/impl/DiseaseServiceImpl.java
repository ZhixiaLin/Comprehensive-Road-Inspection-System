package com.cqjtu.rmms.service.impl;

import com.cqjtu.rmms.entity.DiseaseBasicInformation;
import com.cqjtu.rmms.mapper.DiseaseMapper; // 假设您有一个 Mapper 类来处理数据库操作
import com.cqjtu.rmms.service.DiseaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiseaseServiceImpl implements DiseaseService {

    @Autowired
    private DiseaseMapper diseaseMapper; // 注入 Mapper

    @Override
    public void addDisease(DiseaseBasicInformation disease) {
        diseaseMapper.insertDisease(disease); // 假设您有一个插入方法
    }

    @Override
    public void removeDisease(Integer diseaseId) {
        diseaseMapper.deleteDisease(diseaseId); // 假设您有一个删除方法
    }

    @Override
    public void updateDisease(DiseaseBasicInformation disease) {
        diseaseMapper.updateDisease(disease); // 假设您有一个更新方法
    }

    @Override
    public DiseaseBasicInformation getDiseaseById(Integer diseaseId) {
        return diseaseMapper.selectDiseaseById(diseaseId); // 假设您有一个查询方法
    }

    @Override
    public List<DiseaseBasicInformation> loadAll() {
        return diseaseMapper.selectAllDiseases(); // 假设您有一个查询所有病害的方法
    }
}