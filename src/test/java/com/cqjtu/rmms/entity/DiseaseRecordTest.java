package com.cqjtu.rmms.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

public class DiseaseRecordTest {

    private DiseaseRecord diseaseRecord;

    @BeforeEach
    public void setUp() {
        diseaseRecord = new DiseaseRecord();
    }

    @Test
    public void testSetAndGetDiseaseRecordId_Valid() {
        diseaseRecord.setDiseaseRecordId(1);
        assertEquals(1, diseaseRecord.getDiseaseRecordId());
    }

    @Test
    public void testSetDiseaseRecordId_Invalid_Zero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            diseaseRecord.setDiseaseRecordId(0);
        });
        assertEquals("Disease record ID must be a positive integer.", exception.getMessage());
    }

    @Test
    public void testSetDiseaseRecordId_Invalid_Negative() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            diseaseRecord.setDiseaseRecordId(-1);
        });
        assertEquals("Disease record ID must be a positive integer.", exception.getMessage());
    }

    @Test
    public void testSetDiseaseRecordId_Invalid_Null() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            diseaseRecord.setDiseaseRecordId(null);
        });
        assertEquals("Disease record ID must be a positive integer.", exception.getMessage());
    }

    @Test
    public void testSetAndGetDiseaseCoordinates_Valid() {
        diseaseRecord.setDiseaseCoordinates("123.456,789.012");
        assertEquals("123.456,789.012", diseaseRecord.getDiseaseCoordinates());
    }

    @Test
    public void testSetDiseaseCoordinates_Invalid_MissingComma() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            diseaseRecord.setDiseaseCoordinates("123.456789.012");
        });
        assertEquals("Disease coordinates must be in the format 'longitude,latitude'.", exception.getMessage());
    }

    @Test
    public void testSetDiseaseCoordinates_Invalid_ExtraComma() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            diseaseRecord.setDiseaseCoordinates("123.456,789.012,");
        });
        assertEquals("Disease coordinates must be in the format 'longitude,latitude'.", exception.getMessage());
    }

    @Test
    public void testSetDiseaseCoordinates_Invalid_Null() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            diseaseRecord.setDiseaseCoordinates(null);
        });
        assertEquals("Disease coordinates must be in the format 'longitude,latitude'.", exception.getMessage());
    }

    @Test
    public void testSetDiseaseCoordinates_Invalid_Empty() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            diseaseRecord.setDiseaseCoordinates("");
        });
        assertEquals("Disease coordinates must be in the format 'longitude,latitude'.", exception.getMessage());
    }

    @Test
    public void testSetAndGetRoadId_Valid() {
        diseaseRecord.setRoadId(1);
        assertEquals(1, diseaseRecord.getRoadId());
    }

    @Test
    public void testSetRoadId_Invalid_Zero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            diseaseRecord.setRoadId(0);
        });
        assertEquals("Road ID must be a positive integer.", exception.getMessage());
    }

    @Test
    public void testSetRoadId_Invalid_Negative() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            diseaseRecord.setRoadId(-1);
        });
        assertEquals("Road ID must be a positive integer.", exception.getMessage());
    }

    @Test
    public void testSetRoadId_Invalid_Null() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            diseaseRecord.setRoadId(null);
        });
        assertEquals("Road ID must be a positive integer.", exception.getMessage());
    }

    @Test
    public void testSetAndGetDiseaseId_Valid() {
        diseaseRecord.setDiseaseId(1);
        assertEquals(1, diseaseRecord.getDiseaseId());
    }

    @Test
    public void testSetDiseaseId_Invalid_Zero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            diseaseRecord.setDiseaseId(0);
        });
        assertEquals("Disease ID must be a positive integer.", exception.getMessage());
    }

    @Test
    public void testSetDiseaseId_Invalid_Negative() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            diseaseRecord.setDiseaseId(-1);
        });
        assertEquals("Disease ID must be a positive integer.", exception.getMessage());
    }

    @Test
    public void testSetDiseaseId_Invalid_Null() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            diseaseRecord.setDiseaseId(null);
        });
        assertEquals("Disease ID must be a positive integer.", exception.getMessage());
    }

    @Test
    public void testSetAndGetDiscoveryTime_Valid() {
        LocalDateTime discoveryTime = LocalDateTime.of(2023, 10, 1, 12, 0);
        diseaseRecord.setDiscoveryTime(discoveryTime);
        assertEquals(discoveryTime, diseaseRecord.getDiscoveryTime());
    }

    @Test
    public void testSetDiscoveryTime_Invalid_Null() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            diseaseRecord.setDiscoveryTime((LocalDateTime) null);
        });
        assertEquals("Discovery time cannot be null.", exception.getMessage());
    }

    @Test
    public void testSetDiscoveryTime_Valid_String() {
        String discoveryTimeString = "2023-10-01T12:00:00";
        diseaseRecord.setDiscoveryTime(discoveryTimeString);
        assertEquals(LocalDateTime.of(2023, 10, 1, 12, 0), diseaseRecord.getDiscoveryTime());
    }

    @Test
    public void testSetDiscoveryTime_Invalid_String_WrongFormat() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            diseaseRecord.setDiscoveryTime("2023-10-01 12:00:00");
        });
        assertEquals("Discovery time must be in the format 'yyyy-MM-ddTHH:mm:ss'.", exception.getMessage());
    }

    @Test
    public void testSetDiscoveryTime_Invalid_String_Null() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            diseaseRecord.setDiscoveryTime((String) null);
        });
        assertEquals("Discovery time string cannot be null or empty.", exception.getMessage());
    }

    @Test
    public void testSetDiscoveryTime_Invalid_String_Empty() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            diseaseRecord.setDiscoveryTime("");
        });
        assertEquals("Discovery time string cannot be null or empty.", exception.getMessage());
    }
}
