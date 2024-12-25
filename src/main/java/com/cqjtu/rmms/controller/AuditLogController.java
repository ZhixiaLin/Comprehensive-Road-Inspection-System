package com.cqjtu.rmms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/audit")
public class AuditLogController {

    // 静态的审计日志列表
    private static final List<Map<String, Object>> auditLogs = new ArrayList<>();

    static {
        auditLogs.add(createAuditLog(1, "2025-01-01 10:00:00", "admin", "登录系统"));
        auditLogs.add(createAuditLog(2, "2025-01-01 10:05:00", "user1", "添加设备"));
        auditLogs.add(createAuditLog(3, "2025-01-01 10:10:00", "user2", "修改采购记录"));
        auditLogs.add(createAuditLog(4, "2025-01-01 10:15:00", "admin", "删除用户"));
        auditLogs.add(createAuditLog(5, "2025-01-01 10:20:00", "user1", "查看设备列表"));
        auditLogs.add(createAuditLog(6, "2025-01-01 10:25:00", "user2", "添加采购记录"));
        auditLogs.add(createAuditLog(7, "2025-01-01 10:30:00", "admin", "修改用户权限"));
        auditLogs.add(createAuditLog(8, "2025-01-01 10:35:00", "user1", "删除设备"));
        auditLogs.add(createAuditLog(9, "2025-01-01 10:40:00", "user2", "查看采购记录"));
        auditLogs.add(createAuditLog(10, "2025-01-01 10:45:00", "admin", "添加用户"));
        auditLogs.add(createAuditLog(11, "2025-01-01 10:50:00", "user1", "修改设备信息"));
        auditLogs.add(createAuditLog(12, "2025-01-01 10:55:00", "user2", "删除采购记录"));
        auditLogs.add(createAuditLog(13, "2025-01-01 11:00:00", "admin", "查看用户列表"));
        auditLogs.add(createAuditLog(14, "2025-01-01 11:05:00", "user1", "添加设备"));
        auditLogs.add(createAuditLog(15, "2025-01-01 11:10:00", "user2", "修改采购记录"));
        auditLogs.add(createAuditLog(16, "2025-01-01 11:15:00", "admin", "删除用户"));
        auditLogs.add(createAuditLog(17, "2025-01-01 11:20:00", "user1", "查看设备列表"));
        auditLogs.add(createAuditLog(18, "2025-01-01 11:25:00", "user2", "添加采购记录"));
        auditLogs.add(createAuditLog(19, "2025-01-01 11:30:00", "admin", "修改用户权限"));
        auditLogs.add(createAuditLog(20, "2025-01-01 11:35:00", "user1", "删除设备"));
    }

    private static Map<String, Object> createAuditLog(Integer id, String timestamp, String user, String action) {
        Map<String, Object> log = new HashMap<>();
        log.put("id", id);
        log.put("timestamp", timestamp);
        log.put("user", user);
        log.put("action", action);
        return log;
    }

    @GetMapping("/auditLog")
    public String auditLog(Model model) {
        model.addAttribute("auditLogs", auditLogs);
        return "audit/audit_log";
    }
}