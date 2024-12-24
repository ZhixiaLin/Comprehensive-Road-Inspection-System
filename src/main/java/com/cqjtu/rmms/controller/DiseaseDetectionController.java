package com.cqjtu.rmms.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DiseaseDetectionController {

    /**
     * 跳转到病害检测页面
     * @param model 页面数据模型
     * @return 病害检测页面模板名称
     */
    @GetMapping("/diseaseDetection/List")
    public String getDiseaseDetectionPage(Model model) {
        // 模拟从数据库中获取病害检测记录
        List<DiseaseDetection> diseaseList = fetchDiseaseData();
        model.addAttribute("diseaseList", diseaseList); // 将数据传递给模板
        return "diseaseDetection/disease_detection"; // 返回 Thymeleaf 模板的名称（对应 disease_detection.html）
    }

    /**
     * 模拟方法：获取病害检测数据
     */
    private List<DiseaseDetection> fetchDiseaseData() {
        // 模拟数据，可替换为实际数据库查询
        List<DiseaseDetection> diseaseList = new ArrayList<>();
        diseaseList.add(new DiseaseDetection(1, "路面裂缝", "2024-12-20", "张三"));
        diseaseList.add(new DiseaseDetection(2, "路面沉降", "2024-12-21", "李四"));
        diseaseList.add(new DiseaseDetection(3, "边坡滑塌", "2024-12-22", "王五"));
        return diseaseList;
    }

    // 定义一个简单的 DiseaseDetection 数据类
    static class DiseaseDetection {
        private int id;
        private String name;
        private String detectionDate;
        private String detectionPerson;

        public DiseaseDetection(int id, String name, String detectionDate, String detectionPerson) {
            this.id = id;
            this.name = name;
            this.detectionDate = detectionDate;
            this.detectionPerson = detectionPerson;
        }

        // Getters 和 Setters
        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getDetectionDate() {
            return detectionDate;
        }

        public String getDetectionPerson() {
            return detectionPerson;
        }
    }
}