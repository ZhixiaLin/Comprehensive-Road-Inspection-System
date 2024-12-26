package com.cqjtu.rmms.controller;

import com.cqjtu.rmms.entity.DiseaseRecord;
import com.cqjtu.rmms.entity.MaintenanceRecord;
import com.cqjtu.rmms.entity.PersonnelInformation;
import com.cqjtu.rmms.entity.VehicleInformation;
import com.cqjtu.rmms.service.DiseaseRecordService;
import com.cqjtu.rmms.service.MaintenanceRecordService;
import com.cqjtu.rmms.service.PersonnelService;
import com.cqjtu.rmms.service.VehicleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/MaintenanceRecord")
public class MaintenanceRecordController {
    @Autowired
    private MaintenanceRecordService maintenanceRecordService;
    @GetMapping("/list")
    public String list(Map<String, Object> map,
                       @RequestParam(value = "pageNo", required = false, defaultValue = "1") String pageNoStr) {
        int pageNo = Math.max(1, Integer.parseInt(pageNoStr));
        PageHelper.startPage(pageNo, 20);
        List<MaintenanceRecord> MaintenanceRecordList = maintenanceRecordService.loadAll();
        PageInfo<MaintenanceRecord> page = new PageInfo<>(MaintenanceRecordList);
        map.put("page", page);
        return "MaintenanceRecord/list_maintenanceRecord";
    }
    @GetMapping(value = "/preUpdate/{maintenanceRecordId}")
    public String preUpdate(@PathVariable("maintenanceRecordId") Integer maintenanceRecordId, Map<String, Object> map) {
        MaintenanceRecord maintenanceRecord = maintenanceRecordService.getMaintenanceRecordById(maintenanceRecordId);
        if (maintenanceRecord == null) {
            throw new RuntimeException("maintenanceRecord record not found with ID: " + maintenanceRecordId);
        }
        map.put("maintenanceRecord", maintenanceRecord);
        return "MaintenanceRecord/update_maintenanceRecord";
    }


    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(@RequestParam Map<String, String> params) {
        try {
            // 创建新的 MaintenanceRecord 实例
            MaintenanceRecord maintenanceRecord = new MaintenanceRecord();

            // 设置属性
            maintenanceRecord.setMaintenanceRecordId(Integer.parseInt(params.get("maintenanceRecordId")));
            maintenanceRecord.setEmployeeId(Integer.parseInt(params.get("employeeId")));
            maintenanceRecord.setVehicleId(Integer.parseInt(params.get("vehicleId")));
            maintenanceRecord.setDiseaseRecordId(Integer.parseInt(params.get("diseaseRecordId")));

            // 解析 maintenanceTime
            String maintenanceTimeStr = params.get("maintenanceTime");
            if (maintenanceTimeStr != null && !maintenanceTimeStr.isEmpty()) {
                maintenanceRecord.setMaintenanceTime(LocalDateTime.parse(maintenanceTimeStr, DateTimeFormatter.ISO_LOCAL_DATE_TIME));
            }

            // 设置其他字段
            maintenanceRecord.setMaintenanceStatus(params.get("maintenanceStatus"));
            maintenanceRecord.setMaintenanceReview(params.get("maintenanceReview"));

            // 调用 service 层更新逻辑
            maintenanceRecordService.updateMaintenanceRecord(maintenanceRecord);

        } catch (Exception e) {
            e.printStackTrace();
            // 错误处理逻辑，可以返回一个错误页面或者提示错误消息
            return "redirect:/MaintenanceRecord/updateError";
        }
        // 更新成功后重定向到列表页面
        return "redirect:/MaintenanceRecord/list";
    }

//    @GetMapping("/add")
//    public String showAddForm(Map<String, Object> map) {
//        MaintenanceRecord maintenanceRecord = new MaintenanceRecord();
//        map.put("maintenanceRecord", maintenanceRecord);
//        return "MaintenanceRecord/add_maintenanceRecord";
//    }

    @Autowired
    private PersonnelService personnelInformationService;

    @Autowired
    private VehicleService vehicleInformationService;

    @Autowired
    private DiseaseRecordService diseaseRecordService;

//    @GetMapping("/add")
//    public String showAddForm(Map<String, Object> map) {
//        // 动态加载数据
//        List<PersonnelInformation> personnelList = personnelInformationService.loadAll();
//        List<VehicleInformation> vehicleList = vehicleInformationService.loadAll();
//        List<DiseaseRecord> diseaseRecordList = diseaseRecordService.loadAll();
//        Integer maxId = maintenanceRecordService.getMaxMaintenanceRecordId();
//        MaintenanceRecord maintenanceRecord = new MaintenanceRecord();
//        maintenanceRecord.setMaintenanceRecordId(maxId == null ? 1 : maxId + 1); // 自动生成 ID
//        map.put("maintenanceRecord", maintenanceRecord); // 确保对象被传递到前端
//        map.put("personnelList", personnelList);
//        map.put("vehicleList", vehicleList);
//        map.put("diseaseRecordList", diseaseRecordList);
//        map.put("maintenanceRecord", new MaintenanceRecord());
//        return "MaintenanceRecord/add_maintenanceRecord";
//    }

    @GetMapping("/add")
    public String showAddForm(Map<String, Object> map) {
        // 动态加载数据
        List<PersonnelInformation> personnelList = personnelInformationService.loadAll();
        List<VehicleInformation> vehicleList = vehicleInformationService.loadAll();
        List<DiseaseRecord> diseaseRecordList = diseaseRecordService.loadAll();
        Integer maxId = maintenanceRecordService.getMaxMaintenanceRecordId();
        MaintenanceRecord maintenanceRecord = new MaintenanceRecord();
        maintenanceRecord.setMaintenanceRecordId(maxId == null ? 1 : maxId + 1); // 自动生成 ID
        map.put("maintenanceRecord", maintenanceRecord); // 确保对象被传递到前端
        map.put("personnelList", personnelList);
        map.put("vehicleList", vehicleList);
        map.put("diseaseRecordList", diseaseRecordList);
        return "MaintenanceRecord/add_maintenanceRecord";
    }

    @PostMapping("/add")
    public String add(@RequestParam Map<String, String> params) {
        try {
            MaintenanceRecord maintenanceRecord = new MaintenanceRecord();
            //maintenanceRecord.setMaintenanceRecordId(Integer.parseInt(params.get("maintenanceRecordId")));
            // 自动生成主键值
            Integer maxId = maintenanceRecordService.getMaxMaintenanceRecordId();
            maintenanceRecord.setMaintenanceRecordId(maxId == null ? 1 : maxId + 1);
            // 设置其他字段
            maintenanceRecord.setEmployeeId(Integer.parseInt(params.get("employeeId")));
            maintenanceRecord.setVehicleId(Integer.parseInt(params.get("vehicleId")));
            maintenanceRecord.setDiseaseRecordId(Integer.parseInt(params.get("diseaseRecordId")));

            String maintenanceTimeStr = params.get("maintenanceTime");
            if (maintenanceTimeStr != null && !maintenanceTimeStr.isEmpty()) {
                maintenanceRecord.setMaintenanceTime(LocalDateTime.parse(maintenanceTimeStr, DateTimeFormatter.ISO_LOCAL_DATE_TIME));
            }

            maintenanceRecord.setMaintenanceStatus(params.get("maintenanceStatus"));
            maintenanceRecord.setMaintenanceReview(params.get("maintenanceReview"));

            maintenanceRecordService.addMaintenanceRecord(maintenanceRecord);
        } catch (Exception e) {
            e.printStackTrace();
            return "redirect:/MaintenanceRecord/list";
        }
        return "redirect:/MaintenanceRecord/list";
    }
    @GetMapping("/remove")
    public String remove(@RequestParam("maintenanceRecordId") Integer maintenanceRecordId) {
        maintenanceRecordService.removeMaintenanceRecord(maintenanceRecordId);
        return "redirect:/MaintenanceRecord/list";
    }
}



