SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for daily_inspect
-- ----------------------------
DROP TABLE IF EXISTS `daily_inspect`;
CREATE TABLE `daily_inspect` (
  `daily_inspect_no` int(11) NOT NULL AUTO_INCREMENT,
  `road_name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `inspector_name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `damage_type` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `daily_inspect_date` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `daily_inspect_desc` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `daily_inspector_ps` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  PRIMARY KEY (`daily_inspect_no`) USING BTREE,
  KEY `FK_Relationship_16` (`damage_type`) USING BTREE,
  KEY `FK_Relationship_6` (`road_name`) USING BTREE,
  KEY `FK_Relationship_7` (`inspector_name`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=67019 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of daily_inspect
-- ----------------------------
BEGIN;
INSERT INTO `daily_inspect` VALUES (67001, '建国北路', '王婷', '泛油', '2024-12-11', '路边', '无');
INSERT INTO `daily_inspect` VALUES (67002, '潮王路', '张宗宝', '泛油', '2024-12-12', '路边', '无');
INSERT INTO `daily_inspect` VALUES (67003, '环城北路', '李娜', '路面', '2024-12-13', '路面路面', '无');
INSERT INTO `daily_inspect` VALUES (67004, '环城北路', '李娜', '路面', '2024-12-14', '路面路面', '无');
INSERT INTO `daily_inspect` VALUES (67005, '建国北路', '王婷', '路面', '2024-12-15', '路面路面', '无');
INSERT INTO `daily_inspect` VALUES (67006, '环城北路', '纪欢', '路面', '2024-12-16', '路面路面', '无');
INSERT INTO `daily_inspect` VALUES (67007, '潮王路', '张宗宝', '坑洞', '2024-12-17', '路边', '无');
INSERT INTO `daily_inspect` VALUES (67008, '绍兴路', '童博扬', '泛油', '2024-12-18', '路边', '无');
INSERT INTO `daily_inspect` VALUES (67009, '绍兴路', '童博扬', '泛油', '2024-12-19', '路边', '无');
INSERT INTO `daily_inspect` VALUES (67016, '环城北路', '童博扬', '沉陷', '2020-01-08', '路面路面', '无');
COMMIT;

-- ----------------------------
-- Table structure for inspector
-- ----------------------------
DROP TABLE IF EXISTS `inspector`;
CREATE TABLE `inspector` (
  `inspector_no` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `inspector_name` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `inspector_tel` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `inspector_tab` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `inspector_pwd` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  PRIMARY KEY (`inspector_no`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of inspector
-- ----------------------------
BEGIN;
INSERT INTO `inspector` VALUES ('110001', '023110', '13812345678', '0', '123');
COMMIT;

-- ----------------------------
-- Table structure for regular_damage
-- ----------------------------
DROP TABLE IF EXISTS `regular_damage`;
CREATE TABLE `regular_damage` (
  `damage_no` int(100) NOT NULL AUTO_INCREMENT,
  `inspector_name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_name` varchar(100) DEFAULT NULL,
  `damage_type` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `damage_date` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `damage_start` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `damage_all_longth` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `damage_all_width` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `damage_longth` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `damage_width` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `damage_height` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `damage_desc` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `damage_area` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `damage_ps` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  PRIMARY KEY (`damage_no`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=20322 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of regular_damage
-- ----------------------------
BEGIN;
INSERT INTO `regular_damage` VALUES (20301, '王婷', '建国北路', '泛油', '2024-10-24', '05', '10', '33', '88', '78', '92', 'desc', '66', 'nt');
INSERT INTO `regular_damage` VALUES (20302, '纪欢', '潮王路', '线裂', '2024-11-04', '11', '11', '11', '78', '96', '56', 'd', '11', 'd');
INSERT INTO `regular_damage` VALUES (20303, '王婷', '建国北路', '线裂', '2024-12-04', '11', '11', '11', '95', '45', '87', 'd', '11', 'd');
INSERT INTO `regular_damage` VALUES (20304, '纪欢', '潮王路', '坑洞', '2024-10-17', '11', '88', '43', '66', '88', '86', 'd', '55', 'd');
INSERT INTO `regular_damage` VALUES (20305, '王婷', '建国北路', '车辙', '2024-11-04', '42', '43', '42', '72', '79', '96', '', '43', '');
INSERT INTO `regular_damage` VALUES (20306, '纪欢', '潮王路', '线裂', '2024-12-04', '11', '11', '11', '85', '91', '84', 'd', '16', 'd');
INSERT INTO `regular_damage` VALUES (20307, '张宗宝', '绍兴路', '沉陷', '2024-10-04', '11', '11', '11', '87', '92', '82', 'd', '15', 'd');
INSERT INTO `regular_damage` VALUES (20308, '张宗宝', '绍兴路', '坑洞', '2024-11-04', '11', '11', '11', '88', '90', '83', 'd', '11', 'd');
INSERT INTO `regular_damage` VALUES (20309, '张宗宝', '绍兴路', '泛油', '2024-12-04', '11', '11', '11', '86', '93', '88', 'd', '12', 'd');
INSERT INTO `regular_damage` VALUES (20310, '童博扬', '环城北路', '线裂', '2024-10-04', '11', '11', '11', '85', '95', '85', 'd', '17', 'd');
INSERT INTO `regular_damage` VALUES (20311, '童博扬', '环城北路', '车辙', '2024-11-04', '11', '11', '11', '83', '94', '89', 'd', '23', 'd');
INSERT INTO `regular_damage` VALUES (20312, '童博扬', '环城北路', '坑洞', '2024-12-04', '11', '11', '11', '85', '98', '80', 'd', '19', 'd');
COMMIT;

-- ----------------------------
-- Table structure for regular_smooth
-- ----------------------------
DROP TABLE IF EXISTS `regular_smooth`;
CREATE TABLE `regular_smooth` (
  `smooth_no` int(11) NOT NULL AUTO_INCREMENT,
  `inspector_name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `smooth_IRI` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `smooth_date` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `smooth_ps` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  PRIMARY KEY (`smooth_no`) USING BTREE,
  KEY `FK_Relationship_10` (`inspector_name`) USING BTREE,
  KEY `FK_Relationship_14` (`road_name`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=65018 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of regular_smooth
-- ----------------------------
BEGIN;
INSERT INTO `regular_smooth` VALUES (65001, '纪欢', '潮王路', '66', '2024-11-01', '无');
INSERT INTO `regular_smooth` VALUES (65002, '王婷', '潮王路', '66', '2024-12-04', '无');
INSERT INTO `regular_smooth` VALUES (65003, '陈诺', '建国北路', '55', '2024-11-22', '无');
INSERT INTO `regular_smooth` VALUES (65004, '王婷', '建国北路', '55', '2024-12-23', '无');
INSERT INTO `regular_smooth` VALUES (65005, '张宗宝', '绍兴路', '62', '2024-11-23', '无');
INSERT INTO `regular_smooth` VALUES (65006, '张宗宝', '绍兴路', '54', '2024-12-23', '无');
INSERT INTO `regular_smooth` VALUES (65007, '童博扬', '环城北路', '63', '2024-11-23', '无');
INSERT INTO `regular_smooth` VALUES (65008, '童博扬', '环城北路', '75', '2024-12-23', '无');
COMMIT;

-- ----------------------------
-- Table structure for road
-- ----------------------------
DROP TABLE IF EXISTS `road`;
CREATE TABLE `road` (
  `road_id` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `lmlx_lmlx` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_name` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_zx` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_qd` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_zd` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_sjdw` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_sgdw` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_dldj` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_lmdj` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_sjss` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_lfkdfw` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_dlcd` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_dlmj` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_AADT` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_jtldj` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_ssxz` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_glfl` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_gldw` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_yhdw` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_jzny` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_lmhd` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_jclx` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_jchd` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_cds` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_txfx` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_jdcdkdfw` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_zcfjdcdkdfw` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_ycfjdcdkdfw` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_cxdmj` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_ywgjczyd` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_cslx` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_cscd` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_pslx` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_pscd` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_jcjsl` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_ysksl` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_lmpsl` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_bzpsl` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_scmj` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_qt` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_dljd` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_dlwd` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_dlid` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_del` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`road_id`) USING BTREE,
  KEY `FK_Relationship_8` (`lmlx_lmlx`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of road
-- ----------------------------
BEGIN;
INSERT INTO `road` VALUES ('823110', '主干路', '潮王路', '南北', '莫干山路', '绍兴路', '浙江工业大学', '九建', '一级', '二级', '100km/h', '30-40m', '18km', '1234m2', 'AADT', '一级', '拱墅区', '区政府', '区交通运输局', '市政集团', '2005-05-06', '30cm', '半刚性基层', '46cm', '双向4车道', '右侧行驶', '3.66m', '0', '0', '3456m2', '有', '圆角侧石', '50cm', '平缘石', '44cm', '26', '143', '89', '321', '678m2', '无', NULL, NULL, NULL, NULL);
INSERT INTO `road` VALUES ('823111', '主干路', '建国北路', '南北', '庆春路', '文晖路', '浙江工业大学', '九建', '一级', '二级', '100km/h', '30-40m', '18km', '1234m2', 'AADT', '一级', '拱墅区', '区政府', '区交通运输局', '市政集团', '2005-05-06', '30cm', '半刚性基层', '46cm', '双向6车道', '右侧行驶', '3.66m', '0', '0', '3456m2', '有', '圆角侧石', '50cm', '平缘石', '44cm', '26', '143', '89', '321', '678m2', '无', NULL, NULL, NULL, NULL);
INSERT INTO `road` VALUES ('823112', '主干路', '环城北路', '南北', '古墩路', '秋涛北路', '浙江工业大学', '九建', '一级', '二级', '100km/h', '30-40m', '18km', '1234m2', 'AADT', '一级', '渝北区', '区政府', '区交通运输局', '市政集团', '2005-05-06', '30cm', '半刚性基层', '46cm', '双向8车道', '右侧行驶', '3.66m', '0', '0', '3456m2', '有', '圆角侧石', '50cm', '平缘石', '44cm', '26', '143', '89', '321', '678m2', '无', NULL, NULL, NULL, NULL);
INSERT INTO `road` VALUES ('823113', '主干路', '绍兴路', '南北', '上塘路', '环城北路', '浙江工业大学', '九建', '一级', '二级', '100km/h', '30-40m', '18km', '1234m2', 'AADT', '一级', '拱墅区', '区政府', '区交通运输局', '市政集团', '2002-12-21', '30cm', '半刚性基层', '42cm', '双向6车道', '右侧行驶', '3.82m', '0', '0', '5656m2', '有', '圆角侧石', '50cm', '平缘石', '44cm', '26', '143', '89', '321', '678m2', '无', NULL, NULL, NULL, NULL);
COMMIT;

-- ----------------------------
-- Table structure for road_damage
-- ----------------------------
DROP TABLE IF EXISTS `road_damage`;
CREATE TABLE `road_damage` (
  `damage_type` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `road_type` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `damage_shape` char(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `damage_calc` char(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  PRIMARY KEY (`damage_type`) USING BTREE,
  KEY `FK_Relationship_15` (`road_type`) USING BTREE,
  CONSTRAINT `FK_Relationship_15` FOREIGN KEY (`road_type`) REFERENCES `road_type` (`road_type`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of road_damage
-- ----------------------------
BEGIN;
INSERT INTO `road_damage` VALUES ('1', '1', '1', '1');
COMMIT;

-- ----------------------------
-- Table structure for road_points
-- ----------------------------
DROP TABLE IF EXISTS `road_points`;
CREATE TABLE `road_points` (
  `road_type` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `damage_density` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `points_items` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  PRIMARY KEY (`road_type`) USING BTREE,
  KEY `FK_Relationship_13` (`damage_density`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Table structure for road_type
-- ----------------------------
DROP TABLE IF EXISTS `road_type`;
CREATE TABLE `road_type` (
  `road_type` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`road_type`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- 创建表结构
-- ----------------------------

DROP TABLE IF EXISTS MaintenanceRecord;
DROP TABLE IF EXISTS InspectionRecord;
DROP TABLE IF EXISTS InspectionTask;
DROP TABLE IF EXISTS DiseaseRecord;
DROP TABLE IF EXISTS DiseaseBasicInformation;
DROP TABLE IF EXISTS RoadBasicInformation;
DROP TABLE IF EXISTS SystemLog;
DROP TABLE IF EXISTS ComponentInformation;
DROP TABLE IF EXISTS FrontEndDevice;
DROP TABLE IF EXISTS ProcurementRecord;
DROP TABLE IF EXISTS VehicleInformation;
DROP TABLE IF EXISTS PersonnelInformation;
DROP TABLE IF EXISTS Department;

-- 创建部门表
CREATE TABLE Department (
    departmentId INT PRIMARY KEY NOT NULL COMMENT '部门的唯一标识',
    departmentName VARCHAR(50) NOT NULL COMMENT '部门的名称（人事部、产品部、巡检部、数据部、养护部）'
);

-- 创建人员信息表
CREATE TABLE PersonnelInformation (
    employeeId INT PRIMARY KEY NOT NULL COMMENT '员工的唯一标识',
    employeeName VARCHAR(50) NOT NULL COMMENT '员工的姓名',
    departmentId INT NOT NULL COMMENT '所属部门的编号',
    employeeStatus VARCHAR(20) NOT NULL COMMENT '员工状态（忙碌/空闲/不在岗/离职）',
    position VARCHAR(50) NOT NULL COMMENT '员工的岗位（领导，普通员工）',
    FOREIGN KEY (departmentId) REFERENCES Department(departmentId)
);

-- 创建车辆信息表
CREATE TABLE VehicleInformation (
    vehicleId INT PRIMARY KEY NOT NULL COMMENT '车辆的唯一标识',
    vehicleType VARCHAR(50) NOT NULL COMMENT '车辆的类型',
    vehicleStatus BOOLEAN NOT NULL COMMENT '车辆状态（显示在库/派出）'
);

-- 创建采购记录表
CREATE TABLE ProcurementRecord (
    procurementRecordId INT PRIMARY KEY NOT NULL COMMENT '采购记录的唯一标识',
    procurementContent TEXT NOT NULL COMMENT '采购的具体内容',
    approvalStatus VARCHAR(20) NOT NULL COMMENT '审批状态（未审核、不通过、通过）',
    approvalRemarks TEXT NULL COMMENT '审批备注（针对不通过的原因）',
    procurementResult VARCHAR(50) NULL COMMENT '采购的最终结果'
);

-- 创建前端设备表
CREATE TABLE FrontEndDevice (
    frontEndDeviceId INT PRIMARY KEY NOT NULL COMMENT '前端设备的唯一标识',
    frontEndDeviceName VARCHAR(50) NOT NULL COMMENT '前端设备的名称',
    frontEndDeviceStatus VARCHAR(20) NOT NULL COMMENT '前端设备状态（在库/派出）'
);

-- 创建设备组件信息表
CREATE TABLE ComponentInformation (
    deviceId INT PRIMARY KEY NOT NULL COMMENT '零部件的唯一标识',
    frontEndDeviceId INT NOT NULL COMMENT '所属前端设备的编号',
    deviceType VARCHAR(20) NOT NULL COMMENT '设备的类型（如摄像头等）',
    deviceName VARCHAR(50) NOT NULL COMMENT '设备的名称',
    lastMaintenanceTime DATETIME NOT NULL COMMENT '最近一次维护的时间',
    FOREIGN KEY (frontEndDeviceId) REFERENCES FrontEndDevice(frontEndDeviceId)
);

-- 创建系统日志表
CREATE TABLE SystemLog (
    systemLogId INT PRIMARY KEY NOT NULL COMMENT '系统日志的唯一标识',
    systemLogTime DATETIME NOT NULL COMMENT '系统日志记录的时间',
    systemLogInfo TEXT NOT NULL COMMENT '系统日志记录的信息'
);

-- 创建病害基础信息表
CREATE TABLE DiseaseBasicInformation (
    diseaseId INT PRIMARY KEY NOT NULL COMMENT '病害的唯一标识',
    diseaseFeature VARCHAR(100) NOT NULL COMMENT '病害的特征描述',
    diseaseCategory VARCHAR(50) NOT NULL COMMENT '病害的分类（裂痕、路面垃圾、损坏反光、标志线磨损等）',
    diseaseLevel VARCHAR(20) NOT NULL COMMENT '病害的严重程度（轻度、中度、严重）'
);

-- 创建病害记录表
CREATE TABLE DiseaseRecord (
    diseaseRecordId INT PRIMARY KEY NOT NULL COMMENT '病害记录的唯一标识',
    diseaseCoordinates VARCHAR(50) NOT NULL COMMENT '病害的笛卡尔坐标',
    roadId INT NOT NULL COMMENT '病害所在道路的编号',
    diseaseId INT NOT NULL COMMENT '病害的编号',
    discoveryTime DATETIME NOT NULL COMMENT '病害被发现的时间',
    FOREIGN KEY (roadId) REFERENCES RoadBasicInformation(roadId),
    FOREIGN KEY (diseaseId) REFERENCES DiseaseBasicInformation(diseaseId)
);

-- 创建巡检任务表
CREATE TABLE InspectionTask (
    inspectionTaskId INT PRIMARY KEY NOT NULL COMMENT '巡检任务的唯一标识',
    inspectionTaskType VARCHAR(20) NOT NULL COMMENT '巡检任务的类型（日常、定期、专项）',
    inspectionStartTime DATETIME NOT NULL COMMENT '巡检任务的开始时间',
    inspectionEndTime DATETIME NOT NULL COMMENT '巡检任务的结束时间',
    inspectionCycle VARCHAR(50) NOT NULL COMMENT '巡检任务的周期（例如：每周一次、每月一次）'
);

-- 创建巡检记录表
CREATE TABLE InspectionRecord (
    inspectionRecordId INT PRIMARY KEY NOT NULL COMMENT '巡检记录的唯一标识',
    inspectionTaskId INT NOT NULL COMMENT '所属巡检任务的编号',
    employeeId INT NOT NULL COMMENT '执行巡检的员工编号',
    vehicleId INT NOT NULL COMMENT '使用的车辆编号',
    frontEndDeviceId INT NOT NULL COMMENT '使用的前端设备编号',
    inspectionStartTime DATETIME NOT NULL COMMENT '巡检任务的开始时间',
    inspectionEndTime DATETIME NOT NULL COMMENT '巡检任务的结束时间',
    FOREIGN KEY (inspectionTaskId) REFERENCES InspectionTask(inspectionTaskId),
    FOREIGN KEY (employeeId) REFERENCES PersonnelInformation(employeeId),
    FOREIGN KEY (vehicleId) REFERENCES VehicleInformation(vehicleId),
    FOREIGN KEY (frontEndDeviceId) REFERENCES FrontEndDevice(frontEndDeviceId)
);

-- 创建养护记录表
CREATE TABLE MaintenanceRecord (
    maintenanceRecordId INT PRIMARY KEY NOT NULL COMMENT '养护记录的唯一标识',
    employeeId INT NOT NULL COMMENT '执行养护的员工编号',
    vehicleId INT NOT NULL COMMENT '使用的车辆编号',
    diseaseRecordId INT NOT NULL COMMENT '对应的病害记录编号',
    maintenanceTime DATETIME NOT NULL COMMENT '养护执行的时间',
    maintenanceStatus VARCHAR(20) NOT NULL COMMENT '养护状态（未养护/养护中/已养护）',
    maintenanceReview TEXT NULL COMMENT '对养护工作的评价',
    FOREIGN KEY (employeeId) REFERENCES PersonnelInformation(employeeId),
    FOREIGN KEY (vehicleId) REFERENCES VehicleInformation(vehicleId),
    FOREIGN KEY (diseaseRecordId) REFERENCES DiseaseRecord(diseaseRecordId)
);


-- ----------------------------
-- Records of Department
-- ----------------------------
BEGIN;
INSERT INTO Department VALUES (1, '人事部');
INSERT INTO Department VALUES (2, '产品部');
INSERT INTO Department VALUES (3, '巡检部');
INSERT INTO Department VALUES (4, '数据部');
INSERT INTO Department VALUES (5, '养护部');
COMMIT;

-- ----------------------------
-- Records of PersonnelInformation
-- ----------------------------
BEGIN;
INSERT INTO PersonnelInformation VALUES (1, '童博扬', 1, '忙碌', '领导');
INSERT INTO PersonnelInformation VALUES (2, '林之夏', 2, '空闲', '普通员工');
INSERT INTO PersonnelInformation VALUES (3, '张宗宝', 3, '不在岗', '普通员工');
INSERT INTO PersonnelInformation VALUES (4, '李娜', 3, '忙碌', '普通员工');
INSERT INTO PersonnelInformation VALUES (5, '王婷', 4, '忙碌', '领导');
INSERT INTO PersonnelInformation VALUES (6, '陈赫', 5, '离职', '普通员工');
INSERT INTO PersonnelInformation VALUES (7, '陈诺', 2, '空闲', '领导');
INSERT INTO PersonnelInformation VALUES (8, '纪欢', 4, '忙碌', '普通员工');
INSERT INTO PersonnelInformation VALUES (9, '王天赐', 5, '空闲', '普通员工');
COMMIT;

-- ----------------------------
-- Records of VehicleInformation
-- ----------------------------
BEGIN;
INSERT INTO VehicleInformation VALUES (1, '巡检车-001', TRUE);
INSERT INTO VehicleInformation VALUES (2, '巡检车-002', FALSE);
INSERT INTO VehicleInformation VALUES (3, '巡检车-003', TRUE);
INSERT INTO VehicleInformation VALUES (4, '巡检车-004', FALSE);
INSERT INTO VehicleInformation VALUES (5, '巡检车-005', TRUE);
INSERT INTO VehicleInformation VALUES (6, '巡检车-006', TRUE);
INSERT INTO VehicleInformation VALUES (7, '巡检车-007', FALSE);
INSERT INTO VehicleInformation VALUES (8, '巡检车-008', TRUE);
INSERT INTO VehicleInformation VALUES (9, '巡检车-009', TRUE);
INSERT INTO VehicleInformation VALUES (10, '巡检车-010', FALSE);
COMMIT;

-- ----------------------------
-- Records of ProcurementRecord
-- ----------------------------
BEGIN;
INSERT INTO ProcurementRecord VALUES (1, '采购10个高清摄像机', '未审核', NULL, NULL);
INSERT INTO ProcurementRecord VALUES (2, '采购20个智能芯片', '未审核', NULL, NULL);
INSERT INTO ProcurementRecord VALUES (3, '采购30个探地雷达', '未审核', NULL, NULL);
INSERT INTO ProcurementRecord VALUES (4, '采购10个GPS定位', '未审核', NULL, NULL);
INSERT INTO ProcurementRecord VALUES (5, '采购15个无线通信模块', '未审核', NULL, NULL);
INSERT INTO ProcurementRecord VALUES (6, '采购50个信号传感器', '未审核', NULL, NULL);
INSERT INTO ProcurementRecord VALUES (7, '采购25个监控服务器', '未审核', NULL, NULL);
INSERT INTO ProcurementRecord VALUES (8, '采购5台无人机', '未审核', NULL, NULL);
INSERT INTO ProcurementRecord VALUES (9, '采购100个道路标志牌', '未审核', NULL, NULL);
INSERT INTO ProcurementRecord VALUES (10, '采购200个安全锥', '未审核', NULL, NULL);
COMMIT;

-- ----------------------------
-- Records of FrontEndDevice
-- ----------------------------
BEGIN;
INSERT INTO FrontEndDevice VALUES (1, '前端设备-001', '在库');
INSERT INTO FrontEndDevice VALUES (2, '前端设备-002', '派出');
INSERT INTO FrontEndDevice VALUES (3, '前端设备-003', '在库');
INSERT INTO FrontEndDevice VALUES (4, '前端设备-004', '派出');
INSERT INTO FrontEndDevice VALUES (5, '前端设备-005', '在库');
INSERT INTO FrontEndDevice VALUES (6, '前端设备-006', '在库');
INSERT INTO FrontEndDevice VALUES (7, '前端设备-007', '派出');
INSERT INTO FrontEndDevice VALUES (8, '前端设备-008', '在库');
INSERT INTO FrontEndDevice VALUES (9, '前端设备-009', '派出');
INSERT INTO FrontEndDevice VALUES (10, '前端设备-010', '在库');
COMMIT;

-- ----------------------------
-- Records of ComponentInformation
-- ----------------------------
BEGIN;
INSERT INTO ComponentInformation VALUES (1, 1, '高清摄像机', '高清摄像机-001', '2024-01-01 10:00:00');
INSERT INTO ComponentInformation VALUES (2, 2, '智能芯片', '智能芯片-001', '2024-01-02 11:00:00');
INSERT INTO ComponentInformation VALUES (3, 3, '探地雷达', '探地雷达-001', '2024-01-03 12:00:00');
INSERT INTO ComponentInformation VALUES (4, 4, 'GPS定位', 'GPS定位-001', '2024-01-04 13:00:00');
INSERT INTO ComponentInformation VALUES (5, 5, '无线通信模块', '无线通信模块-001', '2024-01-05 14:00:00');
INSERT INTO ComponentInformation VALUES (6, 6, '高清摄像机', '高清摄像机-002', '2024-01-06 15:00:00');
INSERT INTO ComponentInformation VALUES (7, 7, '智能芯片', '智能芯片-002', '2024-01-07 16:00:00');
INSERT INTO ComponentInformation VALUES (8, 8, '探地雷达', '探地雷达-002', '2024-01-08 17:00:00');
INSERT INTO ComponentInformation VALUES (9, 9, 'GPS定位', 'GPS定位-002', '2024-01-09 18:00:00');
INSERT INTO ComponentInformation VALUES (10, 10, '无线通信模块', '无线通信模块-002', '2024-01-10 19:00:00');
COMMIT;

-- ----------------------------
-- Records of DiseaseBasicInformation
-- ----------------------------
BEGIN;
INSERT INTO DiseaseBasicInformation VALUES (1, '路面出现明显的横向裂缝', '横向裂缝', '中度');
INSERT INTO DiseaseBasicInformation VALUES (2, '路面出现明显的纵向裂缝', '纵向裂缝', '轻度');
INSERT INTO DiseaseBasicInformation VALUES (3, '路面出现块状裂缝', '块状裂缝', '严重');
INSERT INTO DiseaseBasicInformation VALUES (4, '路面出现龟裂现象', '龟裂', '中度');
INSERT INTO DiseaseBasicInformation VALUES (5, '路面存在坑槽现象', '坑槽', '严重');
INSERT INTO DiseaseBasicInformation VALUES (6, '路面出现松散现象', '松散', '轻度');
INSERT INTO DiseaseBasicInformation VALUES (7, '井盖与路面存在高差', '井盖高差', '中度');
INSERT INTO DiseaseBasicInformation VALUES (8, '施工场景导致路面异常', '施工场景', '严重');
INSERT INTO DiseaseBasicInformation VALUES (9, '隔离护栏存在缺失或损坏', '隔离护栏', '中度');
INSERT INTO DiseaseBasicInformation VALUES (10, '垃圾桶位置异常或损坏', '垃圾桶异常', '轻度');
INSERT INTO DiseaseBasicInformation VALUES (11, '路面存在垃圾堆积', '路面垃圾', '轻度');
INSERT INTO DiseaseBasicInformation VALUES (12, '路面存在沉陷现象', '路面沉陷', '严重');
INSERT INTO DiseaseBasicInformation VALUES (13, '红白杆存在弯曲或损坏', '红白杆', '中度');
INSERT INTO DiseaseBasicInformation VALUES (14, '路面或设施上存在划痕', '划痕', '轻度');
INSERT INTO DiseaseBasicInformation VALUES (15, '路面存在抛洒物', '抛洒物', '中度');
INSERT INTO DiseaseBasicInformation VALUES (16, '标志标线存在磨损现象', '标志标线磨', '中度');
INSERT INTO DiseaseBasicInformation VALUES (17, '反光锥筒存在损坏或缺失', '损反光锥筒', '严重');
COMMIT;

-- ----------------------------
-- Records of DiseaseRecord
-- ----------------------------
BEGIN;
INSERT INTO DiseaseRecord VALUES (1, '120.123,30.456', 1, 1, '2024-01-01 10:00:00');
INSERT INTO DiseaseRecord VALUES (2, '120.124,30.457', 2, 2, '2024-01-02 11:00:00');
INSERT INTO DiseaseRecord VALUES (3, '120.125,30.458', 3, 3, '2024-01-03 12:00:00');
INSERT INTO DiseaseRecord VALUES (4, '120.126,30.459', 4, 4, '2024-01-04 13:00:00');
INSERT INTO DiseaseRecord VALUES (5, '120.127,30.460', 5, 5, '2024-01-05 14:00:00');
INSERT INTO DiseaseRecord VALUES (6, '120.128,30.461', 6, 6, '2024-01-06 15:00:00');
INSERT INTO DiseaseRecord VALUES (7, '120.129,30.462', 7, 7, '2024-01-07 16:00:00');
INSERT INTO DiseaseRecord VALUES (8, '120.130,30.463', 8, 8, '2024-01-08 17:00:00');
INSERT INTO DiseaseRecord VALUES (9, '120.131,30.464', 9, 9, '2024-01-09 18:00:00');
INSERT INTO DiseaseRecord VALUES (10, '120.132,30.465', 10, 10, '2024-01-10 19:00:00');
COMMIT;


-- ----------------------------
-- Records of InspectionTask
-- ----------------------------
BEGIN;
INSERT INTO InspectionTask VALUES (1, '日常', '2024-01-01 08:00:00', '2024-01-31 18:00:00', '每天一次');
INSERT INTO InspectionTask VALUES (2, '定期', '2024-02-01 08:00:00', '2024-02-28 18:00:00', '每周一次');
INSERT INTO InspectionTask VALUES (3, '专项', '2024-03-01 08:00:00', '2024-03-31 18:00:00', '每月一次');
INSERT INTO InspectionTask VALUES (4, '日常', '2024-04-01 08:00:00', '2024-04-30 18:00:00', '每天一次');
INSERT INTO InspectionTask VALUES (5, '定期', '2024-05-01 08:00:00', '2024-05-31 18:00:00', '每周一次');
INSERT INTO InspectionTask VALUES (6, '专项', '2024-06-01 08:00:00', '2024-06-30 18:00:00', '每月一次');
INSERT INTO InspectionTask VALUES (7, '日常', '2024-07-01 08:00:00', '2024-07-31 18:00:00', '每天一次');
INSERT INTO InspectionTask VALUES (8, '定期', '2024-08-01 08:00:00', '2024-08-31 18:00:00', '每周一次');
INSERT INTO InspectionTask VALUES (9, '专项', '2024-09-01 08:00:00', '2024-09-30 18:00:00', '每月一次');
INSERT INTO InspectionTask VALUES (10, '日常', '2024-10-01 08:00:00', '2024-10-31 18:00:00', '每天一次');
COMMIT;

-- ----------------------------
-- Records of InspectionRecord
-- ----------------------------
BEGIN;
INSERT INTO InspectionRecord VALUES (1, 1, 1, 1, 1, '2024-01-01 09:00:00', '2024-01-01 11:00:00');
INSERT INTO InspectionRecord VALUES (2, 2, 2, 2, 2, '2024-02-02 09:30:00', '2024-02-02 11:30:00');
INSERT INTO InspectionRecord VALUES (3, 3, 3, 3, 3, '2024-03-03 10:00:00', '2024-03-03 12:00:00');
INSERT INTO InspectionRecord VALUES (4, 4, 4, 4, 4, '2024-04-04 08:00:00', '2024-04-04 10:00:00');
INSERT INTO InspectionRecord VALUES (5, 5, 5, 5, 5, '2024-05-05 08:30:00', '2024-05-05 10:30:00');
INSERT INTO InspectionRecord VALUES (6, 6, 6, 6, 6, '2024-06-06 09:15:00', '2024-06-06 11:15:00');
INSERT INTO InspectionRecord VALUES (7, 7, 7, 7, 7, '2024-07-07 09:45:00', '2024-07-07 11:45:00');
INSERT INTO InspectionRecord VALUES (8, 8, 8, 8, 8, '2024-08-08 08:15:00', '2024-08-08 10:15:00');
INSERT INTO InspectionRecord VALUES (9, 9, 9, 9, 9, '2024-09-09 08:45:00', '2024-09-09 10:45:00');
INSERT INTO InspectionRecord VALUES (10, 10, 10, 10, 10, '2024-10-10 09:00:00', '2024-10-10 11:00:00');
COMMIT;

-- ----------------------------
-- Records of MaintenanceRecord
-- ----------------------------
BEGIN;
INSERT INTO MaintenanceRecord VALUES (1, 1, 1, 1, '2024-01-01 13:00:00', '已养护', '养护完成，效果良好');
INSERT INTO MaintenanceRecord VALUES (2, 2, 2, 2, '2024-02-02 14:00:00', '已养护', '养护完成，效果良好');
INSERT INTO MaintenanceRecord VALUES (3, 3, 3, 3, '2024-03-03 15:00:00', '养护中', '正在进行路面修复');
INSERT INTO MaintenanceRecord VALUES (4, 4, 4, 4, '2024-04-04 16:00:00', '未养护', '等待施工队到场');
INSERT INTO MaintenanceRecord VALUES (5, 5, 5, 5, '2024-05-05 17:00:00', '已养护', '护栏修复完成');
INSERT INTO MaintenanceRecord VALUES (6, 6, 6, 6, '2024-06-06 18:00:00', '养护中', '正在进行垃圾清理');
INSERT INTO MaintenanceRecord VALUES (7, 7, 7, 7, '2024-07-07 19:00:00', '未养护', '施工计划尚未制定');
INSERT INTO MaintenanceRecord VALUES (8, 8, 8, 8, '2024-08-08 20:00:00', '已养护', '标志标线重新绘制完成');
INSERT INTO MaintenanceRecord VALUES (9, 9, 9, 9, '2024-09-09 21:00:00', '养护中', '正在修复路面裂缝');
INSERT INTO MaintenanceRecord VALUES (10, 10, 10, 10, '2024-10-10 22:00:00', '未养护', '等待材料到场');
COMMIT;

-- ----------------------------
-- Records of road_type
-- ----------------------------
BEGIN;
INSERT INTO `road_type` VALUES ('1');
INSERT INTO `road_type` VALUES ('主干路');
INSERT INTO `road_type` VALUES ('商业繁华街道');
INSERT INTO `road_type` VALUES ('外事活动路线');
INSERT INTO `road_type` VALUES ('广场');
INSERT INTO `road_type` VALUES ('快速路');
INSERT INTO `road_type` VALUES ('游览路线');
INSERT INTO `road_type` VALUES ('重要生产区道路');
COMMIT;

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `user_no` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户账号',
  `user_pwd` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '密码',
  `user_name` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '用户名称',
  PRIMARY KEY (`user_no`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of users
-- ----------------------------
BEGIN;
INSERT INTO `users` VALUES ('100101', '123456', '王婷');
INSERT INTO `users` VALUES ('100102', '7777777', '童博扬');
INSERT INTO `users` VALUES ('100103', '123456', '张宗宝');
INSERT INTO `users` VALUES ('100104', '123456', '林之夏');
INSERT INTO `users` VALUES ('100107', '123456', '李娜');
INSERT INTO `users` VALUES ('100108', '3234', '王天赐');
INSERT INTO `users` VALUES ('100109', '12345', '陈赫');
INSERT INTO `users` VALUES ('100110', '11', '陈诺');
INSERT INTO `users` VALUES ('100111', '1231', '纪欢');
COMMIT;

-- ----------------------------
-- Triggers structure for table road
-- ----------------------------
DROP TRIGGER IF EXISTS `addDaily`;
delimiter ;;
CREATE TRIGGER `addDaily` AFTER INSERT ON `road` FOR EACH ROW INSERT into daily_inspect(daily_inspect.road_name) VALUES(NEW.road_name),(NEW.road_name),(NEW.road_name)
;;
delimiter ;

-- ----------------------------
-- Triggers structure for table road
-- ----------------------------
DROP TRIGGER IF EXISTS `addDamage`;
delimiter ;;
CREATE TRIGGER `addDamage` AFTER INSERT ON `road` FOR EACH ROW INSERT into regular_damage(regular_damage.road_name) VALUES(NEW.road_name),(NEW.road_name),(NEW.road_name)
;;
delimiter ;

-- ----------------------------
-- Triggers structure for table road
-- ----------------------------
DROP TRIGGER IF EXISTS `addSmooth`;
delimiter ;;
CREATE TRIGGER `addSmooth` AFTER INSERT ON `road` FOR EACH ROW INSERT into regular_smooth(regular_smooth.road_name) VALUES(NEW.road_name),(NEW.road_name),(NEW.road_name)
;;
delimiter ;

-- ----------------------------
-- Triggers structure for table road
-- ----------------------------
DROP TRIGGER IF EXISTS `deleDaily`;
delimiter ;;
CREATE TRIGGER `deleDaily` AFTER DELETE ON `road` FOR EACH ROW DELETE FROM daily_inspect WHERE daily_inspect.road_name=old.road_name
;;
delimiter ;

-- ----------------------------
-- Triggers structure for table road
-- ----------------------------
DROP TRIGGER IF EXISTS `deleDamage`;
delimiter ;;
CREATE TRIGGER `deleDamage` AFTER DELETE ON `road` FOR EACH ROW DELETE FROM regular_damage WHERE regular_damage.road_name=old.road_name
;;
delimiter ;

-- ----------------------------
-- Triggers structure for table road
-- ----------------------------
DROP TRIGGER IF EXISTS `deleSmooth`;
delimiter ;;
CREATE TRIGGER `deleSmooth` AFTER DELETE ON `road` FOR EACH ROW DELETE FROM regular_smooth WHERE regular_smooth.road_name=old.road_name
;;
delimiter ;

SET FOREIGN_KEY_CHECKS = 1;
