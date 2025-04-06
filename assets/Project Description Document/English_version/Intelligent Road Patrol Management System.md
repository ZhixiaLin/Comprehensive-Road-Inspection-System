# Intelligent Road Patrol Management System

## 1. Introduction

### 1.1 Project Background
In recent years, digital and intelligent technologies represented by the Internet have driven a new round of scientific and industrial revolution. The deep integration of these technologies with the real economy not only provides strong support for new industrialization but also injects new momentum into industrial transformation and green development.

China's 20th National Congress proposed to "accelerate the building of a strong transportation country," a strategic upgrade for advancing transport development, providing fundamental guidance for future improvements in China's transportation system toward sustainability and higher quality.

Under this strategic directive, road infrastructure—being the main carrier of transportation—plays a vital role in national economic and social development. However, issues such as road damage are increasingly prominent, affecting road lifespan and traffic safety. Traditional road inspections rely heavily on manual labor, often leading to high costs, long durations, poor accuracy, and safety risks.

Modern technologies such as high-definition cameras, sensors, and BeiDou GPS have been widely applied to improve inspection efficiency and precision. These advancements enable timely detection and early warnings, supporting intelligent road maintenance.

Recent policies, including the implementation of the **Highway Maintenance Technical Standard (JTG 5110—2023)** on March 1, 2024, emphasize mandatory routine, frequent, and periodic inspections, promoting smart, automated, and integrated maintenance approaches.

### 1.2 Project Overview
Currently, road maintenance in China mainly depends on daily manual inspections, which are labor-intensive and expensive. Some cities use automatic detection vehicles, but their high cost and low speed hinder widespread adoption, especially in rural areas.

**Challenges include:**
- Enhancing detection efficiency and reducing manual inspection costs;
- Enabling early detection to prevent minor defects from escalating;
- Integrating data across departments into a unified management system;
- Applying intelligent decision-making to ensure scientific and efficient maintenance;
- Addressing the shortage of professionals in smart patrol and data analytics.

**Project Goals:**
- Improve accuracy and timeliness of road inspections;
- Adapt to different road types and conditions;
- Ensure sustainable operation and management;
- Improve public transportation safety and cost-effectiveness.

**Core Features:**
- **Smart Patrol Platform:** Automates detection, localization, and assessment of road damage using advanced sensors, image recognition, and data analysis.
- **Business Management Platform:** One-stop system for managing patrol and maintenance tasks with dashboards and real-time data.
- **Intelligent Decision-Making Platform:** Uses AI, big data, and simulation to generate preventive maintenance plans and optimize management decisions.

### 1.3 Competitive Analysis
**Tonglu Cloud:**
- Strength: Strong academic background (Tongji University), diverse systems.
- Weakness: Complex hardware installation and low flexibility.

**Qianxun Vision:**
- Strength: Integrated BeiDou + AI system, brand influence.
- Weakness: Limited damage types detected, unsuitable for highways.

**Our System Advantages:**
1. Closed-loop smart maintenance: Real-time GPS positioning, AI detection, cloud dispatching, and feedback.
2. High integration and ease of use: Suitable for various vehicles and road types, with plug-and-play design.

### 1.4 Value and Social Impact
- **Extend Road Lifespan:** Enable early detection and timely repair, reduce degradation, and lower costs.
- **Enhance Road Service Quality:** Improve traffic safety and reduce accidents.
- **Support National Transportation Goals:** Boost infrastructure durability, public safety, and employment, while enabling greener urban development.



---
# 2. Project Management Plan

## 2.1 Schedule Management
The development of the system follows a structured schedule based on feasibility and requirement analysis. A detailed Gantt chart is used to visualize the progress, tasks, timelines, and responsible personnel.

**Key Tasks:**
1. Requirements Analysis (Oct 15–20)
2. Project Planning (Oct 20–22)
3. Traditional Analysis (Oct 23–31)
4. Object-Oriented Analysis (Nov 1–8)
5. System Design (Nov 9–15)
6. Implementation (Nov 16–Dec 15)
7. Testing (Dec 16–20)
8. Report Writing (Oct 15–Dec 30)
9. Final Presentation (Dec 20–31)

## 2.2 Process Management
The project development process is divided into five phases:
- **Initiation:** Preliminary planning, team division, requirement communication.
- **Planning:** Finalizing the framework and technology stack, risk assessment.
- **Development:** Feature coding, weekly syncs, iterative testing.
- **Quality Management:** Documentation reviews, requirement audits, test planning.
- **Conclusion:** Final handover, documentation and evaluation.

## 2.3 Resource Management
Resources are categorized into:
- **Internet Resources:** Online datasets, algorithm documentation.
- **Books & References:** Shared readings relevant to system modules.
- **Human Resources:** Clear task allocation, reward system, role responsibilities.

Team synergy was enhanced through regular meetings and incentive mechanisms.

---
# 3. System Requirements Specification

## 3.1 Feasibility Analysis

### 3.1.1 Economic Feasibility
The system reduces road maintenance costs through automation, enhancing efficiency and lifespan, and mitigating accidents and associated losses.

### 3.1.2 Technical Feasibility
- HD cameras + GPS + 4G/5G + GPU deep learning
- Real-time processing, automatic detection and classification
- Cloud-based alerts and dispatch
- Big data support for regulatory assessment

### 3.1.3 Social Feasibility
Supports smart city development and transportation modernization.

### 3.1.4 Risks and Mitigation
- Device compatibility → Open hardware access protocol
- Data security → Encryption, authentication, audit
- User acceptance → Training and documentation

### 3.1.5 Conclusion
Economically, technically, and socially feasible.

## 3.2 Cost Estimation
1. Function point model
2. COCOMO II for effort and schedule
3. Risk-adjusted final quotation

## 3.3 Functional Requirements
Outlined in use case specifications:
- Personnel, vehicle, and equipment management
- Patrol (daily, periodic, special)
- Maintenance (dispatch, tracking, evaluation)
- Data management and audit
- Statistical reports and dashboard

---
# 4. Traditional System Analysis

## 4.1 Data Flow Diagrams
- Top-level DFD: Overview of modules and data sources
- First-level DFD: Detailed flows for core functions
- Second-level DFD: Specific operations like patrol, equipment updates

## 4.2 Data Dictionary
Contains definitions for key system entities including:
- `PersonnelInformation`
- `Department`
- `VehicleInformation`
- `ProcurementRecord`
- `ComponentInformation`
- `FrontEndDevice`
- `SystemLog`
- `Road`
- `DiseaseBasicInformation`
- `DiseaseRecord`
- `InspectionTask`
- `InspectionRecord`
- `MaintenanceRecord`
- `regular_damage`
- `regular_smooth`

Each entry defines field names (Chinese & English), types, constraints, and descriptions.

---
# 5. Object-Oriented Analysis & Design

## 5.1 Preliminary Class Diagrams
- Global and local diagrams covering core entities and relationships.

## 5.2 Sequence Diagrams
- Visual flow of interactions for major operations (e.g., patrol, dispatch).

---

# 6. Module Design (OOP-based)
## 6.1 Personnel Management
- Add/edit/remove staff; assign roles

## 6.2 Vehicle & Equipment Management
- Asset lifecycle management

## 6.3 Patrol Management
- Schedule and execute inspections (daily/periodic/special)

## 6.4 Maintenance Management
- Manual & automatic task dispatch, progress tracking

## 6.5 Reporting & Analytics
- Data dashboards, performance indicators

## 6.6 System Audit
- Logs and usage traceability

---
# 7. Testing Documentation

## 7.1 Code Listing (Class Definitions)
- Core class code for personnel, patrol, maintenance

## 7.2 Test Design Techniques
- Equivalence Class Partitioning
- Boundary Value Analysis

## 7.3 Test Cases
- Unit, integration, system, performance

## 7.4 Sample Test Code
- Automated tests for CRUD operations and workflow validation

## 7.5 Test Results
- Screenshots or logs showing passed test cases and issues identified

---
# 8. User Manual

## 8.1 Login Interface
- User authentication via account and password

## 8.2 Main Dashboard
- Overview of patrol status, urgent alerts, and statistics

## 8.3 Modules and Navigation
- **Personnel Module:** Manage user roles and assignments
- **Road Module:** View and update road data
- **Patrol Module:** Schedule and execute inspections
- **Disease Module:** View, confirm, and archive road damage
- **Device Module:** Register and maintain hardware assets
- **Vehicle Module:** Dispatch and maintain transport units
- **Task Assignment:** Manual or automatic dispatch of maintenance orders
- **Data Analysis:** View trends and charts
- **Review Module:** Manual data corrections
- **Audit Module:** View logs and suspicious events

---
# 9. Team Reflections

## 9.1 Tong Boyang (Leader)
Oversaw planning, requirement analysis, DFD, equipment and audit module implementation, testing, and documentation.

## 9.2 Lin Zhixia
Responsible for use case, class, and Gantt diagrams; personnel and vehicle modules.

## 9.3 Zhang Zongbao
Led detailed class design and implemented patrol and disease modules.

## 9.4 Wang Tianci
Wrote use case and data dictionary; built statistics module.

## 9.5 Li Na
Designed sequence diagrams, analyzed DFDs, implemented assignment and data correction modules.



