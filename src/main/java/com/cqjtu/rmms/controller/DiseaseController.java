package com.cqjtu.rmms.controller;

import com.cqjtu.rmms.entity.DiseaseBasicInformation;
import com.cqjtu.rmms.service.DiseaseService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/diseaseBasicInfoManagement")
public class DiseaseController {

    @Autowired
    private DiseaseService diseaseService;

    /**
     * 访问新增病害输入界面
     */
    @GetMapping("/toInput")
    public String input(Map<String, Object> map) {
        DiseaseBasicInformation newDisease = new DiseaseBasicInformation();
        // 实现病害ID自增逻辑
        List<DiseaseBasicInformation> diseaseList = diseaseService.loadAll();
        if (!diseaseList.isEmpty()) {
            DiseaseBasicInformation lastDisease = diseaseList.get(diseaseList.size() - 1);
            newDisease.setDiseaseId(lastDisease.getDiseaseId() + 1);
        } else {
            newDisease.setDiseaseId(1); // 如果没有病害记录，则从1开始
        }
        map.put("disease", newDisease);
        return "disease/input_disease";
    }

    /**
     * 创建新病害
     */
    @PostMapping(value = "/create")
    public String create(DiseaseBasicInformation disease) {
        diseaseService.addDisease(disease);
        return "redirect:/diseaseBasicInfoManagement/list";
    }

    /**
     * 病害列表
     */
    @GetMapping("/list")
    public String list(Map<String, Object> map, @RequestParam(value = "pageNo", required = false, defaultValue = "1") String pageNoStr) {
        int pageNo = Integer.parseInt(pageNoStr);
        if (pageNo < 1) {
            pageNo = 1;
        }
        PageHelper.startPage(pageNo, 20);
        List<DiseaseBasicInformation> diseaseList = diseaseService.loadAll();
        PageInfo<DiseaseBasicInformation> page = new PageInfo<>(diseaseList);
        map.put("page", page);
        return "disease/list_disease";
    }

    @GetMapping(value = "/remove/{diseaseId}")
    public String remove(@PathVariable("diseaseId") Integer diseaseId) {
        diseaseService.removeDisease(diseaseId);
        return "redirect:/diseaseBasicInfoManagement/list";
    }

    @GetMapping(value = "/preUpdate/{diseaseId}")
    public String preUpdate(@PathVariable("diseaseId") Integer diseaseId, Map<String, Object> map) {
        map.put("disease", diseaseService.getDiseaseById(diseaseId));
        return "disease/update_disease";
    }

    @RequestMapping(value = "/update")
    public String update(DiseaseBasicInformation disease) {
        diseaseService.updateDisease(disease);
        return "redirect:/diseaseBasicInfoManagement/list";
    }
}