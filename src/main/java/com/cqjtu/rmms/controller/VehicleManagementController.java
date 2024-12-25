package com.cqjtu.rmms.controller;

import com.cqjtu.rmms.entity.VehicleInformation;
import com.cqjtu.rmms.service.VehicleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/vehicleManagement")
public class VehicleManagementController {

    @Autowired
    private VehicleService vehicleService;

    @GetMapping("/toInput")
    public String input(Map<String, Object> map) {
        List<VehicleInformation> vehicleList = vehicleService.loadAll();
        VehicleInformation newVehicle = new VehicleInformation();
        if (!vehicleList.isEmpty()) {
            VehicleInformation lastVehicle = vehicleList.get(vehicleList.size() - 1);
            newVehicle.setVehicleId(lastVehicle.getVehicleId() + 1);
        } else {
            newVehicle.setVehicleId(1);
        }
        map.put("vehicle", newVehicle);
        return "vehicleManagement/input_vehicle";
    }

    @PostMapping("/create")
    public String create(VehicleInformation vehicle) {
        vehicle.setVehicleStatus(true);  // 新增车辆默认为在库
        vehicleService.addVehicle(vehicle);
        return "redirect:/vehicleManagement/list";
    }

    @GetMapping("/list")
    public String list(Map<String, Object> map,
                       @RequestParam(value = "pageNo", required = false, defaultValue = "1") String pageNoStr) {
        int pageNo = Math.max(1, Integer.parseInt(pageNoStr));
        PageHelper.startPage(pageNo, 10);
        List<VehicleInformation> vehicleList = vehicleService.loadAll();
        PageInfo<VehicleInformation> page = new PageInfo<>(vehicleList);
        map.put("page", page);
        return "vehicleManagement/list_vehicle";
    }

    @GetMapping("/dispatch/{vehicleId}")
    public String dispatch(@PathVariable("vehicleId") Integer vehicleId) {
        VehicleInformation vehicle = vehicleService.get(vehicleId);
        if (vehicle != null) {
            vehicleService.dispatchVehicle(vehicle);
        }
        return "redirect:/vehicleManagement/list";
    }

    @GetMapping("/return/{vehicleId}")
    public String returnVehicle(@PathVariable("vehicleId") Integer vehicleId) {
        VehicleInformation vehicle = vehicleService.get(vehicleId);
        if (vehicle != null) {
            vehicleService.returnVehicle(vehicle);
        }
        return "redirect:/vehicleManagement/list";
    }

    @GetMapping("/preUpdate/{vehicleId}")
    public String preUpdate(@PathVariable("vehicleId") Integer vehicleId, Map<String, Object> map) {
        map.put("vehicle", vehicleService.get(vehicleId));
        return "vehicleManagement/update_vehicle";
    }

    @PostMapping("/update")
    public String update(VehicleInformation vehicle) {
        vehicleService.updateVehicle(vehicle);
        return "redirect:/vehicleManagement/list";
    }
}