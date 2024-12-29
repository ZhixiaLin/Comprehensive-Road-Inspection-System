package com.cqjtu.rmms.entity;

import org.springframework.stereotype.Component;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

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
        if (diseaseRecordId == null || diseaseRecordId <= 0) {
            throw new IllegalArgumentException("Disease record ID must be a positive integer.");
        }
        this.diseaseRecordId = diseaseRecordId;
    }

    public String getDiseaseCoordinates() {
        return diseaseCoordinates;
    }

    public void setDiseaseCoordinates(String diseaseCoordinates) {
        if (diseaseCoordinates == null || !diseaseCoordinates.matches("\\d+\\.\\d+,-?\\d+\\.\\d+")) {
            throw new IllegalArgumentException("Disease coordinates must be in the format 'longitude,latitude'.");
        }
        this.diseaseCoordinates = diseaseCoordinates;
    }

    public Integer getRoadId() {
        return roadId;
    }

    public void setRoadId(Integer roadId) {
        if (roadId == null || roadId <= 0) {
            throw new IllegalArgumentException("Road ID must be a positive integer.");
        }
        this.roadId = roadId;
    }

    public Integer getDiseaseId() {
        return diseaseId;
    }

    public void setDiseaseId(Integer diseaseId) {
        if (diseaseId == null || diseaseId <= 0) {
            throw new IllegalArgumentException("Disease ID must be a positive integer.");
        }
        this.diseaseId = diseaseId;
    }

    public LocalDateTime getDiscoveryTime() {
        return discoveryTime;
    }

    public void setDiscoveryTime(LocalDateTime discoveryTime) {
        if (discoveryTime == null) {
            throw new IllegalArgumentException("Discovery time cannot be null.");
        }
        this.discoveryTime = discoveryTime;
    }

    public void setDiscoveryTime(String discoveryTimeStr) {
        if (discoveryTimeStr == null || discoveryTimeStr.isEmpty()) {
            throw new IllegalArgumentException("Discovery time string cannot be null or empty.");
        }
        try {
            this.discoveryTime = LocalDateTime.parse(discoveryTimeStr, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Discovery time must be in the format 'yyyy-MM-ddTHH:mm:ss'.", e);
        }
    }
}
