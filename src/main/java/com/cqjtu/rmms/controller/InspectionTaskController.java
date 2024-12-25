package com.cqjtu.rmms.controller;

import com.cqjtu.rmms.entity.InspectionTask;
import com.cqjtu.rmms.service.InspectionTaskService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/inspectionTask")
public class InspectionTaskController {

    @Autowired
    private InspectionTaskService inspectionTaskService;

    /**
     * 访问新增巡检任务输入界面
     */
    @GetMapping("/toInput")
    public String input(Map<String, Object> map) {
        InspectionTask newTask = new InspectionTask();
        // 实现巡检任务ID自增逻辑
        List<InspectionTask> taskList = inspectionTaskService.loadAll();
        if (!taskList.isEmpty()) {
            InspectionTask lastTask = taskList.get(taskList.size() - 1);
            newTask.setInspectionTaskId(lastTask.getInspectionTaskId() + 1);
        } else {
            newTask.setInspectionTaskId(1); // 如果没有任务记录，则从1开始
        }
        map.put("inspectionTask", newTask);
        return "inspectionTask/input_inspectionTask";
    }

    /**
     * 创建新巡检任务
     */
    @PostMapping(value = "/create")
    public String create(InspectionTask inspectionTask) {
        inspectionTaskService.addInspectionTask(inspectionTask);
        return "redirect:/inspectionTask/list";
    }

    /**
     * 巡检任务列表
     */
    @GetMapping("/list")
    public String list(Map<String, Object> map, @RequestParam(value = "pageNo", required = false, defaultValue = "1") String pageNoStr) {
        int pageNo = Integer.parseInt(pageNoStr);
        if (pageNo < 1) {
            pageNo = 1;
        }
        PageHelper.startPage(pageNo, 20);
        List<InspectionTask> taskList = inspectionTaskService.loadAll();
        PageInfo<InspectionTask> page = new PageInfo<>(taskList);
        map.put("page", page);
        return "inspectionTask/list_inspectionTask";
    }

    @GetMapping(value = "/remove/{inspectionTaskId}")
    public String remove(@PathVariable("inspectionTaskId") Integer inspectionTaskId) {
        inspectionTaskService.removeInspectionTask(inspectionTaskId);
        return "redirect:/inspectionTask/list";
    }

    @GetMapping(value = "/preUpdate/{inspectionTaskId}")
    public String preUpdate(@PathVariable("inspectionTaskId") Integer inspectionTaskId, Map<String, Object> map) {
        map.put("inspectionTask", inspectionTaskService.getInspectionTaskById(inspectionTaskId));
        return "inspectionTask/update_inspectionTask";
    }

    @RequestMapping(value = "/update")
    public String update(InspectionTask inspectionTask) {
        inspectionTaskService.updateInspectionTask(inspectionTask);
        return "redirect:/inspectionTask/list";
    }
}