package com.cqjtu.rmms.controller;

import com.cqjtu.rmms.entity.PersonnelInformation;
import com.cqjtu.rmms.service.PersonnelService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/personnelManagement")
public class PersonnelManagementController {

    @Autowired
    private PersonnelService personnelService;

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
        map.put("personnel", newPersonnel);
        return "personnelManagement/input_personnel";
    }

    @PostMapping("/create")
    //接收一个Personnel对象,直接调用personnelService.addPersonnel方法将其插入数据库,然后重定向到人员列表页
    public String create(PersonnelInformation personnel) {
        personnelService.addPersonnel(personnel);
        return "redirect:/personnelManagement/list";
    }

    @GetMapping("/list")
    public String list(Map<String, Object> map,
                       @RequestParam(value = "pageNo", required = false, defaultValue = "1") String pageNoStr) {
        int pageNo = Math.max(1, Integer.parseInt(pageNoStr));
        PageHelper.startPage(pageNo, 20);
        List<PersonnelInformation> personnelList = personnelService.loadAll();
        PageInfo<PersonnelInformation> page = new PageInfo<>(personnelList);
        map.put("page", page);
        return "personnelManagement/list_personnel";
    }

    @GetMapping("/remove/{employeeId}")
    public String remove(@PathVariable("employeeId") Integer employeeId) {
        personnelService.removePersonnel(employeeId);
        return "redirect:/personnelManagement/list";
    }

    @GetMapping("/preUpdate/{employeeId}")
    public String preUpdate(@PathVariable("employeeId") Integer employeeId, Map<String, Object> map) {
        map.put("personnel", personnelService.get(employeeId));
        return "personnelManagement/update_personnel";
    }

    @PostMapping("/update")
    public String update(PersonnelInformation personnel) {
        personnelService.updatePersonnel(personnel);
        return "redirect:/personnelManagement/list";
    }
}