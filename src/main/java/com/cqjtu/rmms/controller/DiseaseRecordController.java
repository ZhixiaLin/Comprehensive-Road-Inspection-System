package com.cqjtu.rmms.controller;
import com.cqjtu.rmms.entity.DiseaseRecord;
import com.cqjtu.rmms.service.DiseaseRecordService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/DiseaseRecord")
public class DiseaseRecordController {
    @Autowired
    private DiseaseRecordService diseaseRecordService;
    @GetMapping("/list")
    public String list(Map<String, Object> map,
                       @RequestParam(value = "pageNo", required = false, defaultValue = "1") String pageNoStr) {
        int pageNo = Math.max(1, Integer.parseInt(pageNoStr));
        PageHelper.startPage(pageNo, 20);
        List<DiseaseRecord> DiseaseRecordList = diseaseRecordService.loadAll();
        PageInfo<DiseaseRecord> page = new PageInfo<>(DiseaseRecordList);
        map.put("page", page);
        return "DiseaseRecord/list_diseaseRecord";
    }

    @GetMapping(value = "/preUpdate/{diseaseRecordId}")
    public String preUpdate(@PathVariable("diseaseRecordId") Integer diseaseRecordId, Map<String, Object> map) {
        DiseaseRecord diseaseRecord = diseaseRecordService.getDiseaseRecordById(diseaseRecordId);
        System.out.println(diseaseRecord);

        // 将 DiseaseRecord 对象放入 map，键应该是字符串类型
        map.put("diseaseRecord", diseaseRecord);

        return "DiseaseRecord/update_DiseaseRecord";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(@RequestParam Map<String, String> params) {
        try {
            DiseaseRecord diseaseRecord = new DiseaseRecord();
            diseaseRecord.setDiseaseRecordId(Integer.parseInt(params.get("diseaseRecordId")));
            diseaseRecord.setDiseaseCoordinates(params.get("diseaseCoordinates"));
            diseaseRecord.setRoadId(Integer.parseInt(params.get("roadId")));
            diseaseRecord.setDiseaseId(Integer.parseInt(params.get("diseaseId")));
            // 手动解析 discoveryTime
            String discoveryTimeStr = params.get("discoveryTime");
            if (discoveryTimeStr != null && !discoveryTimeStr.isEmpty()) {
                diseaseRecord.setDiscoveryTime(LocalDateTime.parse(discoveryTimeStr, DateTimeFormatter.ISO_LOCAL_DATE_TIME));
            }

            diseaseRecordService.updateDiseaseRecord(diseaseRecord);
        } catch (Exception e) {
            e.printStackTrace();
            // 处理错误逻辑
        }
        return "redirect:/DiseaseRecord/list"; // 修改为正确的路径
    }


}