package com.cqjtu.rmms.service;

import com.cqjtu.rmms.entity.DiseaseRecord;

import java.util.List;

public interface DiseaseRecordService {
    DiseaseRecord get(Integer diseaseRecordId);

    List<DiseaseRecord> loadAll();

    void removeDiseaseRecord(Integer diseaseRecordId);

    DiseaseRecord getDiseaseRecordById(Integer diseaseRecordId);

    void updateDiseaseRecord(DiseaseRecord diseaseRecord);
}