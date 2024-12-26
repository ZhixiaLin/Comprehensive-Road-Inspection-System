package com.cqjtu.rmms.mapper;
import com.cqjtu.rmms.entity.DiseaseRecord;
import com.cqjtu.rmms.entity.PersonnelInformation;
import org.apache.ibatis.annotations.*;
import java.util.List;
@Mapper
public interface DiseaseRecordMapper {

    @Select("SELECT * FROM DiseaseRecord WHERE diseaseRecordId = #{diseaseRecordId}")
    DiseaseRecord selectByPrimaryKey(Integer diseaseRecordId);

    @Select("SELECT * FROM DiseaseRecord")
    List<DiseaseRecord> selectAll();

    @Update("UPDATE DiseaseRecord SET diseaseCoordinates = #{diseaseCoordinates}, " +
            "roadId = #{roadId}, diseaseId = #{diseaseId}, discoveryTime = #{discoveryTime} " +
            "WHERE diseaseRecordId = #{diseaseRecordId}")
    void updateByPrimaryKey(DiseaseRecord diseaseRecord);

    @Delete("DELETE FROM DiseaseRecord WHERE diseaseRecordId = #{diseaseRecordId}")
    void deleteByPrimaryKey(Integer diseaseRecordId);
}