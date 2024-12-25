package com.cqjtu.rmms.controller;

import com.cqjtu.rmms.entity.PersonnelInformation;
import com.cqjtu.rmms.service.PersonnelService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/deviceManagement")
public class DeviceManagementController {

    @Autowired
    private PersonnelService personnelService;

    // 静态的采购记录列表
    private static final List<Map<String, Object>> procurementRecords = new ArrayList<>();

    static {
        procurementRecords.add(createProcurementRecord(1, "采购10个高清摄像机", "未审核", null, null));
        procurementRecords.add(createProcurementRecord(2, "采购20个智能芯片", "未审核", null, null));
        procurementRecords.add(createProcurementRecord(3, "采购30个探地雷达", "未审核", null, null));
        procurementRecords.add(createProcurementRecord(4, "采购10个GPS定位", "未审核", null, null));
        procurementRecords.add(createProcurementRecord(5, "采购15个无线通信模块", "未审核", null, null));
        procurementRecords.add(createProcurementRecord(6, "采购50个信号传感器", "未审核", null, null));
        procurementRecords.add(createProcurementRecord(7, "采购25个监控服务器", "未审核", null, null));
        procurementRecords.add(createProcurementRecord(8, "采购5台无人机", "未审核", null, null));
        procurementRecords.add(createProcurementRecord(9, "采购100个道路标志牌", "未审核", null, null));
        procurementRecords.add(createProcurementRecord(10, "采购200个安全锥", "未审核", null, null));
    }

    private static Map<String, Object> createProcurementRecord(Integer procurementRecordId, String procurementContent, String approvalStatus, String approvalRemarks, String procurementResult) {
        Map<String, Object> record = new HashMap<>();
        record.put("procurementRecordId", procurementRecordId);
        record.put("procurementContent", procurementContent);
        record.put("approvalStatus", approvalStatus);
        record.put("approvalRemarks", approvalRemarks);
        record.put("procurementResult", procurementResult);
        return record;
    }

    @GetMapping("/toInput")
    public String input(Map<String, Object> map) {
        List<PersonnelInformation> personnelList = personnelService.loadAll();
        PersonnelInformation newPersonnel = new PersonnelInformation();
        //如果当前人员列表不为空,就将新建对象的id设置为列表最后一个人员的id+1,否则设置为1
        if (!personnelList.isEmpty()) {
            PersonnelInformation lastPersonnel = personnelList.get(personnelList.size() - 1);
            newPersonnel.setEmployeeId(lastPersonnel.getEmployeeId() + 1);
        } else {
            newPersonnel.setEmployeeId(1);
        }
        //最后将这个新建的对象放入Map中,返回"personnelManagement/input_personnel"视图
        map.put("device", newPersonnel);
        return "deviceManagement/input_device";
    }

    @PostMapping("/create")
    //接收一个Personnel对象,直接调用personnelService.addPersonnel方法将其插入数据库,然后重定向到人员列表页
    public String create(PersonnelInformation personnel) {
        personnelService.addPersonnel(personnel);
        return "redirect:/deviceManagement/list";
    }

    @GetMapping("/list")
    public String list(Map<String, Object> map,
                       @RequestParam(value = "pageNo", required = false, defaultValue = "1") String pageNoStr) {
        int pageNo = Math.max(1, Integer.parseInt(pageNoStr));
        PageHelper.startPage(pageNo, 20);
        PageInfo<Map<String, Object>> page = new PageInfo<>(procurementRecords);
        map.put("page", page);
        return "deviceManagement/list_device";
    }

    @GetMapping("/remove/{procurementRecordId}")
    public String remove(@PathVariable("procurementRecordId") Integer procurementRecordId) {
        procurementRecords.removeIf(record -> record.get("procurementRecordId").equals(procurementRecordId));
        return "redirect:/deviceManagement/list";
    }

    @GetMapping("/preUpdate/{procurementRecordId}")
    public String preUpdate(@PathVariable("procurementRecordId") Integer procurementRecordId, Map<String, Object> map) {
        Map<String, Object> record = procurementRecords.stream()
                .filter(r -> r.get("procurementRecordId").equals(procurementRecordId))
                .findFirst()
                .orElse(null);
        if (record != null) {
            map.put("procurementRecord", record);
            return "deviceManagement/update_device";
        } else {
            // 如果找不到记录，重定向回列表页或显示错误信息
            return "redirect:/deviceManagement/list";
        }
    }

    @PostMapping("/update")
    public String update(@RequestParam Map<String, Object> procurementRecord) {
        Integer procurementRecordId = (Integer) procurementRecord.get("procurementRecordId");
        for (Map<String, Object> record : procurementRecords) {
            if (record.get("procurementRecordId").equals(procurementRecordId)) {
                record.put("procurementContent", procurementRecord.get("procurementContent"));
                record.put("approvalStatus", procurementRecord.get("approvalStatus"));
                record.put("approvalRemarks", procurementRecord.get("approvalRemarks"));
                record.put("procurementResult", procurementRecord.get("procurementResult"));
                break;
            }
        }
        return "redirect:/deviceManagement/list";
    }

    // 静态的设备列表
    private static final List<Map<String, Object>> devices = new ArrayList<>();

    static {
        devices.add(createDevice(1, "前端设备-001", "在库"));
        devices.add(createDevice(2, "前端设备-002", "派出"));
        devices.add(createDevice(3, "前端设备-003", "在库"));
        devices.add(createDevice(4, "前端设备-004", "派出"));
        devices.add(createDevice(5, "前端设备-005", "在库"));
        devices.add(createDevice(6, "前端设备-006", "在库"));
        devices.add(createDevice(7, "前端设备-007", "派出"));
        devices.add(createDevice(8, "前端设备-008", "在库"));
        devices.add(createDevice(9, "前端设备-009", "派出"));
        devices.add(createDevice(10, "前端设备-010", "在库"));
    }

    private static Map<String, Object> createDevice(Integer deviceId, String deviceName, String status) {
        Map<String, Object> device = new HashMap<>();
        device.put("deviceId", deviceId);
        device.put("deviceName", deviceName);
        device.put("status", status);
        return device;
    }

    @GetMapping("/listall")
    public String listAll(Map<String, Object> map) {
        map.put("devices", devices);
        return "deviceManagement/list_device_all";
    }

    @GetMapping("/removeDevice/{deviceId}")
    public String removeDevice(@PathVariable("deviceId") Integer deviceId) {
        devices.removeIf(device -> device.get("deviceId").equals(deviceId));
        return "redirect:/deviceManagement/listall";
    }

    @GetMapping("/preUpdateDevice/{deviceId}")
    public String preUpdateDevice(@PathVariable("deviceId") Integer deviceId, Map<String, Object> map) {
        Map<String, Object> device = devices.stream()
                .filter(d -> d.get("deviceId").equals(deviceId))
                .findFirst()
                .orElse(null);
        if (device != null) {
            map.put("device", device);
            return "deviceManagement/update_device";
        } else {
            // 如果找不到设备，重定向回列表页或显示错误信息
            return "redirect:/deviceManagement/listall";
        }
    }

    @PostMapping("/updateDevice")
    public String updateDevice(@RequestParam Map<String, Object> deviceParams) {
        Integer deviceId = (Integer) deviceParams.get("deviceId");
        String deviceName = (String) deviceParams.get("deviceName");
        String status = (String) deviceParams.get("status");

        for (Map<String, Object> device : devices) {
            if (device.get("deviceId").equals(deviceId)) {
                device.put("deviceName", deviceName);
                device.put("status", status);
                break;
            }
        }
        return "redirect:/deviceManagement/listall";
    }
}
