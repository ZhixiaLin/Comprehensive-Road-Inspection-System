package com.cqjtu.rmms.entity;

import org.springframework.stereotype.Component;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;
import java.time.LocalDateTime;

@Component
@Table(name = "DiseaseRecord")
public class DiseaseRecord implements Serializable {

    @Id
    @Column(name = "diseaseRecordId")
    private Integer diseaseRecordId;

    @Column(name = "diseaseCoordinates")
    private String diseaseCoordinates;

    @Column(name = "roadId")
    private Integer roadId;

    @Column(name = "diseaseId")
    private Integer diseaseId;

    @Column(name = "discoveryTime")
    private LocalDateTime discoveryTime;

    public Integer getDiseaseRecordId() {
        return diseaseRecordId;
    }

    public void setDiseaseRecordId(Integer diseaseRecordId) {
        this.diseaseRecordId = diseaseRecordId;
    }

    public String getDiseaseCoordinates() {
        return diseaseCoordinates;
    }

    public void setDiseaseCoordinates(String diseaseCoordinates) {
        this.diseaseCoordinates = diseaseCoordinates;
    }

    public Integer getRoadId() {
        return roadId;
    }

    public void setRoadId(Integer roadId) {
        this.roadId = roadId;
    }

    public Integer getDiseaseId() {
        return diseaseId;
    }

    public void setDiseaseId(Integer diseaseId) {
        this.diseaseId = diseaseId;
    }
    public LocalDateTime getDiscoveryTime() {
        return discoveryTime;
    }

    public void setDiscoveryTime(LocalDateTime discoveryTime) {
        this.discoveryTime = discoveryTime;
    }



//
}