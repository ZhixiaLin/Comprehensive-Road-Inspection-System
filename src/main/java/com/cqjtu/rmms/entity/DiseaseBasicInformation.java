package com.cqjtu.rmms.entity;

public class DiseaseBasicInformation {
    private Integer diseaseId; // 病害的唯一标识
    private String diseaseFeature; // 病害的特征描述
    private String diseaseCategory; // 病害的分类
    private String diseaseLevel; // 病害的严重程度

    // Getters and Setters
    public Integer getDiseaseId() {
        return diseaseId;
    }

    public void setDiseaseId(Integer diseaseId) {
        this.diseaseId = diseaseId;
    }

    public String getDiseaseFeature() {
        return diseaseFeature;
    }

    public void setDiseaseFeature(String diseaseFeature) {
        this.diseaseFeature = diseaseFeature;
    }

    public String getDiseaseCategory() {
        return diseaseCategory;
    }

    public void setDiseaseCategory(String diseaseCategory) {
        this.diseaseCategory = diseaseCategory;
    }

    public String getDiseaseLevel() {
        return diseaseLevel;
    }

    public void setDiseaseLevel(String diseaseLevel) {
        this.diseaseLevel = diseaseLevel;
    }
}