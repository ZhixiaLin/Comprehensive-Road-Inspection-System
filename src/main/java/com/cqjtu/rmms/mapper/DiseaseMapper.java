package com.cqjtu.rmms.mapper;

import com.cqjtu.rmms.entity.DiseaseBasicInformation;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DiseaseMapper {

    @Insert("INSERT INTO DiseaseBasicInformation (diseaseId, diseaseFeature, diseaseCategory, diseaseLevel) VALUES (#{diseaseId}, #{diseaseFeature}, #{diseaseCategory}, #{diseaseLevel})")
    void insertDisease(DiseaseBasicInformation disease);

    @Delete("DELETE FROM DiseaseBasicInformation WHERE diseaseId = #{diseaseId}")
    void deleteDisease(Integer diseaseId);

    @Update("UPDATE DiseaseBasicInformation SET diseaseFeature = #{diseaseFeature}, diseaseCategory = #{diseaseCategory}, diseaseLevel = #{diseaseLevel} WHERE diseaseId = #{diseaseId}")
    void updateDisease(DiseaseBasicInformation disease);

    @Select("SELECT * FROM DiseaseBasicInformation WHERE diseaseId = #{diseaseId}")
    DiseaseBasicInformation selectDiseaseById(Integer diseaseId);

    @Select("SELECT * FROM DiseaseBasicInformation")
    List<DiseaseBasicInformation> selectAllDiseases();
}