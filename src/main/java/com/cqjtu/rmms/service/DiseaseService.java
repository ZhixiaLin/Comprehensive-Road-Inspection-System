package com.cqjtu.rmms.service;

import com.cqjtu.rmms.entity.DiseaseBasicInformation;

import java.util.List;

public interface DiseaseService {
    void addDisease(DiseaseBasicInformation disease);
    void removeDisease(Integer diseaseId);
    void updateDisease(DiseaseBasicInformation disease);
    DiseaseBasicInformation getDiseaseById(Integer diseaseId);
    List<DiseaseBasicInformation> loadAll();
}