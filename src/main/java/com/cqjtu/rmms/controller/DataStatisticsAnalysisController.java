package com.cqjtu.rmms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DataStatisticsAnalysisController {

    /**
     * 处理数据统计分析大屏页面请求
     *
     * @param model 数据模型
     * @return 数据统计分析大屏页面模板名称
     */
    @GetMapping("/dataStatisticsAnalysis/bigscreen")
    public String showBigScreen(Model model) {
        // 如果需要传递数据给页面，可以通过 model.addAttribute 添加
        model.addAttribute("message", "欢迎来到数据统计分析大屏！");

        // 返回的模板名称（如 templates/dataStatisticsAnalysis/bigscreen.html）
        return "dataStatisticsAnalysis/bigscreen";
    }
}
