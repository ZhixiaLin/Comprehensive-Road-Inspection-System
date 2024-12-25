package com.cqjtu.rmms.mapper;

import com.cqjtu.rmms.entity.VehicleInformation;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
public interface VehicleMapper extends Mapper<VehicleInformation> {
    @Select("select * from VehicleInformation where vehicleType = #{vehicleType}")
    VehicleInformation selectByVehicleType(String vehicleType);
}