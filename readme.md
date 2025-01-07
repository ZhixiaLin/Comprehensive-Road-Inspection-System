# 道路综合巡查管理系统

### 项目团队：

- 负责人：童博扬
- 团队成员：林之夏、张宗宝、王天赐、李娜
- 指导老师：王婷

#### 

### 项目所用技术:

- SpringBoot
- 通用 Mapper 和 Mybatis
- Thymeleaf
- Bootstrap
- Mysql
- Gradle

* log4j2 和 Druid 连接池



###  使用方法

#### IntelliJ IDEA（或其他编译工具）

1. 将init.sql导入数据库中。
2. 将项目导入到 **IntelliJ IDEA** 中，然后利用 gradle 版本控制工具导入 jar。
3. 修改项目中 */rmms/src/main/resources/application.yml 的数据库连接名及用户验证。
4. 启动主函数 App.java 即可。最后打开浏览器，输入 http://localhost:8090/rmms，即可浏览系统。
