package com.cqjtu.rmms.service.impl;
import com.cqjtu.rmms.entity.DiseaseRecord;
import com.cqjtu.rmms.mapper.DiseaseRecordMapper;
import com.cqjtu.rmms.service.DiseaseRecordService;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional(rollbackFor = Exception.class)
public class DiseaseRecordServiceImpl implements DiseaseRecordService {
    @Autowired
    private DiseaseRecordMapper diseaseRecordMapper;
    @Override
    public DiseaseRecord get(Integer diseaseRecordId) {
        return diseaseRecordMapper.selectByPrimaryKey(diseaseRecordId);
    }
    @Override
    public List<DiseaseRecord> loadAll() {
        // 使用新的联表查询方法
        return diseaseRecordMapper.selectAll();
    }

    @Override
    public void removeDiseaseRecord(Integer diseaseRecordId) {

        diseaseRecordMapper.deleteByPrimaryKey(diseaseRecordId);
    }

    @Override
    public DiseaseRecord getDiseaseRecordById(Integer diseaseRecordId) {
        return diseaseRecordMapper.selectByPrimaryKey(diseaseRecordId);
    }

    @Override
    public void updateDiseaseRecord(DiseaseRecord diseaseRecord) {
        diseaseRecordMapper.updateByPrimaryKey(diseaseRecord);
    }
}