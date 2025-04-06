# Intelligent Road Patrol Management System

## 1. Introduction

### 1.1 Project Background
In recent years, digital and intelligent technologies represented by the Internet have propelled a new wave of technological revolution and industrial transformation. The deep integration of these advanced technologies with the real economy not only provides strong support for new industrialization but also injects fresh momentum into industrial digitalization and green development.

China’s 20th National Congress highlighted the need to “accelerate the building of a strong transportation nation,” marking a strategic upgrade in advancing transportation initiatives. This directive provides fundamental guidance for future improvements in China’s transportation system to make it more sustainable and higher in quality.

Under this strategy, the rapid development of China’s transportation sector has made roads a vital carrier. Road safety, smooth traffic flow, and efficient operation significantly influence the national economy and social well-being. Yet, issues like road damage are becoming more and more prominent, severely affecting road lifespan and traffic safety. Road defect inspections have thus become a critical measure to ensure road safety.

Traditional road inspections mostly rely on manual labor, leading to high operational costs, long inspection times, and substantial human error. Additionally, it is difficult to guarantee the safety of inspectors themselves. These drawbacks fail to meet today’s needs for fast, efficient, precise, and cost-effective road maintenance. With the advancement of information and intelligent technologies, the use of high-definition (HD) cameras, sensors, and high-precision BeiDou positioning has been widely adopted in road inspections, significantly enhancing their efficiency and accuracy.

In recent years, relevant government authorities have taken an increasing interest in highway maintenance, introducing various policy directives. A notable example is the **Highway Maintenance Technical Standard (JTG 5110—2023)**, published on November 23, 2023, by the Ministry of Transport. This industry standard for highway engineering becomes effective on March 1, 2024. It emphasizes:
> “Daily inspections, frequent check-ups, and routine checks must be conducted at prescribed intervals. These are mandatory requirements... Daily inspections should mainly use drive-by observation, supplemented by photographs or video. When unusual conditions are detected, inspectors should exit the vehicle for closer checks. Any abnormal conditions should be recorded and reported.”

These government documents stress digital and intelligent highway maintenance, often highlighting automation, intelligence, and integrated detection systems. This focus on digitalized and “smart” highway maintenance demonstrates the government’s commitment to combining highways with digital technologies.

#### Table 1-1 Government Policies

| Policy                                                                                               | Date     | Key Points                                                                                                          |
|------------------------------------------------------------------------------------------------------|----------|---------------------------------------------------------------------------------------------------------------------|
| **Highway Maintenance Technical Standard** <br>(JTG 5110—2023)                                       | 2023.12  | Mandatory industry standard for highway engineering, effective Mar 1, 2024.                                         |
| *Five-Year Action Plan for Speeding Up the Building of a Strong Transportation Nation (2023–2027)*   | 2023.03  | Calls for full coverage of automated road surface condition checks (where conditions permit) for rural highways.    |
| *Opinion on Constructing “Four Good Rural Roads” 2.0 to Advance the “Two Pioneering Initiatives”*    | 2023.04  | Accelerates the development of a comprehensive, integrated rural highway platform to enable fully intelligent mgmt. |
| *Zhejiang Province National and Provincial Highway Maintenance Management Measures (Trial)*           | 2022.06  | Enhances science-based, standardized, and regulated highway maintenance management.                                 |

Particularly important is the new **Highway Maintenance Technical Standard (JTG 5110—2023)** which takes effect on March 1, 2024. As a mandatory industry standard for highway engineering, it sets out further requirements for the frequency and standards of highway inspections, creating a favorable environment for the growth of intelligent road patrol solutions.

#### Table 1-2 National and Provincial Highway Maintenance Work System Implementation Checklist

| No. | Assessment Item                             | Assessment Content                                                                                                                                                                                                                           |
|-----|---------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| 1   | Daily Maintenance Inspection, Check         | Focuses on the establishment and enforcement of inspection and check systems, including daily road surface patrol, structural checks for bridges, tunnels, slopes, retaining walls, etc.                                                        |
| 2   | Road Cleaning and Maintenance               | Focuses on the status of cleaning and greening work, including garbage removal, surface cleanliness, cleaning of guardrails, signs, tunnels, etc., and whether relevant tasks are carried out on schedule.                                       |
| 3   | Routine Repair and Upkeep of Roadbeds/Pavement | Checks overall roadbed stability and regular repairs (filling cracks, patching potholes), material usage, and timing of repairs, ensuring timely maintenance with standardized procedures.                                                      |
| 4   | Minor Maintenance and Inspection of Bridges/Tunnels | Checks bridge and tunnel maintenance, ensuring cleanliness, timely repair of minor damages, and regular inspection and record-keeping.                                                                                                              |
| 5   | Routine Maintenance of Drainage Facilities  | Ensures all drainage systems (culverts, gutters, etc.) are intact, removing blockages to prevent water accumulation on the road surface.                                                                                                        |
| 6   | Routine Maintenance of Other Traffic Facilities | Checks traffic signs, guardrails, anti-rust painting, and other relevant infrastructure to ensure they are in good condition and promptly repaired if damaged.                                                                                 |
| 7   | Daily Maintenance Work Zone Management      | Verifies if maintenance work zones comply with safety regulations, including signage layout, traffic organization, worker protective equipment, etc.                                                                                            |
| 8   | Maintenance Engineering Management          | Includes project management aspects such as budget, bidding, quality control, safety management, and on-site operations.                                                                                                                         |

### 1.2 Project Overview
Currently, road maintenance in China primarily depends on manual daily inspections. Typically, daily checks are required, and each road section needs a team of more than ten people to identify and record damages every 2–3 months. Some organizations have attempted to adopt specialized automatic detection vehicles, but these vehicles are extremely expensive—costing hundreds of thousands or even millions of yuan—and operate at relatively slow speeds. Therefore, they are not cost-effective for large-scale use, especially on rural roads.

Apart from the high cost of current inspection methods, several challenges remain in the road maintenance field:

- **Enhancing detection efficiency** while reducing manual inspection costs and time
- **Timely detection and prevention** of minor road damage to avoid severe deterioration
- **Integrating data** from different departments into a unified management system
- **Leveraging advanced technologies** to inform scientific decision-making in road maintenance
- **Addressing talent shortages** in intelligent road patrol and data analytics

Keeping pace with global smart city development and domestic urbanization, improving road management and maintenance workflows through intelligent means is crucial to foster safe public travel and support sustainable urban growth.

The main objectives of this system are:

1. **Improved accuracy and real-time detection** of road damages at reduced labor costs
2. **Adaptability** across various road types (e.g., highways, urban main roads)
3. **Sustainable operational management**, ensuring stable performance over the long term
4. **Broader social impact**, enhancing traffic safety and contributing to economic development

Key functional highlights include:

- **Smart Patrol Platform**: Uses advanced sensing, image recognition, and data analysis to automate the full cycle of damage detection, classification, and position tracking.
- **Business Management Platform**: Provides unified management of patrol and maintenance tasks, featuring real-time data dashboards.
- **Intelligent Decision Platform**: Integrates big data, AI, and simulation modeling for preventive maintenance planning and optimized decision-making.

### 1.3 Competitive Analysis
Several companies already operate in the highway smart inspection service market, notably **Tonglu Cloud** (Shanghai Tonglu Yun Transportation Technology) and **Qianxun Vision**. Both entered the highway inspection services market around October 2023, emerging as industry leaders.

1. **Tonglu Cloud**
    - **Products**: Rural Road Surface Data Management System, Highway Intelligent Inspection System, Expressway Maintenance Intelligent Management System, Road Maintenance Scientific Intelligent Decision Support System, and Municipal Road Smart Management System
    - **Advantage**: Strong industry foundation through Tongji University resources and extensive domain experience
    - **Disadvantage**: Complex hardware installation requires multiple camera arrays, high-precision positioning units, and other sensors, making operation and setup cumbersome.

2. **Qianxun Vision**
    - **Products**: Integrated BeiDou+AI Road Smart Inspection System
    - **Advantage**: Leverages Qianxun Position’s brand recognition, has extensive market influence
    - **Disadvantage**: Detects only 14 standard road defects; limited to speeds of around 80 km/h, making it unsuitable for higher-speed scenarios such as expressways

**Our solution** offers the following key differentiators:

1. **Intelligent maintenance closed-loop**: Incorporates high-precision GPS differential positioning, AI detection with GPU deep learning, real-time cloud data transfer, automated work order dispatch, and post-maintenance feedback.
2. **High integration, easy to use**: Plug-and-play design suitable for a wide range of vehicles, enabling inspection on urban roads, rural roads, or expressways without additional complex installations.

### 1.4 Value and Social Impact
1. **Extending Road Lifespan**: Proactive detection and timely repairs reduce deterioration, cutting down on maintenance costs and minimizing accident risks.
2. **Enhancing Road Service Quality**: Intelligent maintenance and rapid response reduce traffic disruptions and improve overall safety.
3. **Contributing to National Transportation Goals**: Reinforces strong infrastructure foundations, promotes public safety, creates job opportunities, and drives environmentally friendly urban development.

---

# 2. Project Management Plan

## 2.1 Schedule Management
After feasibility and requirements analyses determined the necessity and scope of the system, the project now enters the official development phase. Effective project management—ensuring on-time, high-quality work completion—hinges on a structured schedule.

We use a **project plan table** to visualize tasks, timelines, responsibilities, and resource allocation. Below is a summary of the key tasks:

| ID | Task Name                      | Duration    | Start Date     | End Date       | Responsible              |
|----|--------------------------------|-------------|----------------|---------------|--------------------------|
| 1  | Requirements Analysis          | 6 workdays  | 2024-10-15     | 2024-10-20     | Tong Boyang, Lin Zhixia  |
| 1.1| Collect & analyze documents    | 3 workdays  | 2024-10-15     | 2024-10-17     | Tong Boyang             |
| 1.2| Draft requirements specs       | 3 workdays  | 2024-10-18     | 2024-10-20     | Lin Zhixia              |
| 2  | Project Planning               | 3 workdays  | 2024-10-20     | 2024-10-22     | Tong Boyang, Lin Zhixia  |
| 2.1| Identify project team & resources | 1 workday | 2024-10-20     | 2024-10-20     | Tong Boyang             |
| 2.2| Develop project schedule & risk mgmt | 2 days   | 2024-10-21     | 2024-10-22     | Lin Zhixia              |
| 3  | Traditional Analysis Phase     | 9 workdays  | 2024-10-23     | 2024-10-31     | Li Na, Wang Tianci      |
| 3.1| Data Flow Diagram analysis     | 5 workdays  | 2024-10-23     | 2024-10-27     | Li Na                   |
| 3.2| Draft data dictionary          | 4 workdays  | 2024-10-28     | 2024-10-31     | Wang Tianci             |
| 4  | Object-Oriented Analysis       | 8 workdays  | 2024-11-1      | 2024-11-8      | Wang Tianci, Li Na      |
| 4.1| Create initial class diagram   | 4 workdays  | 2024-11-1      | 2024-11-4      | Wang Tianci             |
| 4.2| Draw sequence diagrams         | 4 workdays  | 2024-11-5      | 2024-11-8      | Li Na                   |
| 5  | Object-Oriented Design         | 7 workdays  | 2024-11-9      | 2024-11-15     | Zhang Zongbao, Lin Zhixia |
| 5.1| Detailed class diagrams        | 4 workdays  | 2024-11-9      | 2024-11-12     | Zhang Zongbao           |
| 5.2| Define class attributes/methods| 3 workdays  | 2024-11-13     | 2024-11-15     | Lin Zhixia              |
| 6  | Implementation Phase           | 30 workdays | 2024-11-16     | 2024-12-15     | Tong Boyang, Zhang Zongbao |
| 6.1| Develop core functions         | 18 workdays | 2024-11-16     | 2024-12-3      | Tong Boyang             |
| 6.2| Integrate modules              | 12 workdays | 2024-12-4      | 2024-12-15     | Zhang Zongbao           |
| 7  | Testing Phase                  | 5 workdays  | 2024-12-16     | 2024-12-20     | Tong Boyang, Zhang Zongbao |
| 7.1| Unit testing                   | 2 workdays  | 2024-12-16     | 2024-12-17     | Tong Boyang             |
| 7.2| Integration testing            | 1 workday   | 2024-12-18     | 2024-12-18     | Tong Boyang             |
| 7.3| System acceptance testing      | 1 workday   | 2024-12-19     | 2024-12-19     | Zhang Zongbao           |
| 7.4| Performance testing            | 1 workday   | 2024-12-20     | 2024-12-20     | Zhang Zongbao           |
| 8  | Documentation                  | 77 workdays | 2024-10-15     | 2024-12-30     | Tong Boyang             |
| 9  | Presentation & Demo            | 12 workdays | 2024-12-20     | 2024-12-31     | Tong Boyang             |

A Gantt chart built with MS Project visually represents these tasks.

## 2.2 Process Management
Our team customized the development process into five phases: **Initiation, Planning, Development, Quality Management, and Conclusion**. In actual practice—especially when employing prototypes or iterative methods—some tasks may overlap.

### 2.2.1 Initiation
1. Draft a preliminary plan and assign responsibilities based on each member’s strengths.
2. Communicate with the client to clarify and confirm requirements.
3. Evaluate the scope and estimate the initial workload based on the confirmed requirements.

### 2.2.2 Planning
1. Based on the research materials, finalize the system framework and major functional modules.
2. Conduct a risk assessment for resources needed and identify potential technical obstacles.
3. Document the final technology stacks and solutions.

### 2.2.3 Development
1. Implement the modules and integrate them under the final architecture.
2. Hold sync meetings every three days to address functional or technical issues.
3. Perform iterative tests with each added module to catch errors early.
4. Develop a comprehensive test plan, including test criteria and acceptance conditions.

### 2.2.4 Quality Management
Quality management spans the entire life cycle—covering requirement correctness, design validation, testing, and final reviews.

- **Quality Planning**: Create a document specifying measures, resources, and sequence of tasks.
- **Quality Assurance**: Regular evaluations to ensure adherence to the plan, detect deviations, and facilitate timely corrections.
- **Quality Control**: Conduct reviews, inspections, and testing to confirm each deliverable meets requirements.

### 2.2.5 Conclusion
1. Each team member carries out stage-based summaries, plus a final project-wide summary upon completion.
2. The customer can track the project progress via milestone demos and final acceptance.
3. Lessons learned are documented to benefit future development work.

## 2.3 Resource Management
Project resources span a broad range of useful assets. For this project, our team organizes them into three main categories:

1. **Internet Resources**
    - Gather online data sets, algorithmic documentation, and technology references.

2. **Books & References**
    - Team members consult relevant materials from libraries to deepen technical understanding.

3. **Human Resources**
    - Clear definition of responsibilities and roles ensures all tasks have assigned owners.
    - Implement motivational strategies, such as reward mechanisms and team-building activities, to encourage better collaboration.

---

# 3. System Requirements Specification

## 3.1 Feasibility Analysis

### 3.1.1 Economic Feasibility
With rapid urbanization, infrastructure construction—particularly roads—is expanding. Introducing an integrated road patrol management system reduces road maintenance costs and boosts efficiency. It also lengthens road service life and lowers potential accident-related losses, positively influencing the city’s economic development.

### 3.1.2 Technical Feasibility
We use industrial-grade HD cameras, high-precision GPS positioning, 4G/5G wireless transmission, and GPU-based deep learning to automatically identify common road defects in real time, then upload data to the cloud for analysis. An alert system triggers repair tasks with designated deadlines and responsible units, forming a closed-loop solution.

### 3.1.3 Social Feasibility
The system aligns with national goals of building smart cities and enhancing public services. By improving road safety and supporting local industries (e.g., data analytics and intelligent transportation), it can foster technology innovation and talent development, bolstering the broader social and economic environment.

### 3.1.4 Risks and Mitigation
- **Hardware/Software Incompatibility**: Adopt standardized hardware interfaces.
- **Data Security**: Implement encryption, authentication, and audits.
- **User Resistance**: Provide thorough training and maintain a dedicated support team.

### 3.1.5 Conclusion
Overall, the system is **economically**, **technically**, and **socially** feasible.

## 3.2 Cost Estimation
Typical steps:
1. Estimate software size (Function Points).
2. Estimate workload and timeline using COCOMO II.
3. Incorporate risk adjustments into a final quote.

*(Detailed formulas, intermediate data, and final calculations are omitted here for brevity.)*

## 3.3 Functional Requirements
Below is a consolidated use case diagram. (See original references for details.)

**Key use cases**—with more extensive definitions in the final documentation—include:

1. Personnel, Vehicle, and Equipment Management
2. Daily, Regular, and Special Road Patrol
3. Maintenance Dispatch, Tracking, and Evaluation
4. Data Management & Audits
5. Statistical Reports & Dashboard

---

# 4. Traditional System Analysis

## 4.1 Data Flow Diagrams

### 4.1.1 Top-Level DFD
Depicts overall system modules, user interactions, and external data sources.

### 4.1.2 First-Level DFD
Shows core processes such as **Patrol**, **Maintenance**, **Equipment**, and how they exchange data internally.

### 4.1.3 Second-Level DFD
Zooms into specific sub-processes (e.g., scheduling patrol tasks, updating equipment records).

## 4.2 Data Dictionary
Key entities and fields (Chinese & English), data types, constraints, and brief descriptions.

1. **PersonnelInformation**
    - `employeeId` (PK), `employeeName`, `departmentId` (FK), etc.

2. **Department**
    - `departmentId` (PK), `departmentName`

3. **VehicleInformation**
    - `vehicleId` (PK), `vehicleType`, `vehicleStatus`

4. **ProcurementRecord**
    - `procurementRecordId` (PK), `procurementContent`, `approvalStatus`, etc.

5. **ComponentInformation**
    - `deviceId` (PK), `frontEndDeviceId` (FK), `deviceType`, `deviceName`, etc.

6. **FrontEndDevice**
    - `frontEndDeviceId` (PK), `frontEndDeviceName`, `frontEndDeviceStatus`

7. **SystemLog**
    - `systemLogId` (PK), `systemLogTime`, `systemLogInfo`

8. **Road**
    - `road_id` (PK), `road_name`, `road_AADT`, `road_del`, etc.

9. **DiseaseBasicInformation**
    - `diseaseId` (PK), `diseaseFeature`, `diseaseCategory`, `diseaseLevel`

10. **DiseaseRecord**
- `diseaseRecordId` (PK), `diseaseCoordinates`, `roadId` (FK), `diseaseId` (FK), etc.

11. **InspectionTask**
- `inspectionTaskId` (PK), `inspectionTaskType`

12. **InspectionRecord**
- `inspectionRecordId` (PK), `inspectionTaskId` (FK), `employeeId` (FK), etc.

13. **MaintenanceRecord**
- `maintenanceRecordId` (PK), `employeeId`, `diseaseRecordId` (FK), etc.

14. **regular_damage**
- Records for periodic damage checks (damage_no, inspector_name, road_name, etc.)

15. **regular_smooth**
- Records for regular surface smoothness data (smooth_no, road_id, IRI, etc.)

*(Additional dictionary fields, constraints, and details continue as per original reference.)*

---

# 5. Object-Oriented Analysis & Design

## 5.1 Preliminary Class Diagrams
Includes **global** and **local** class diagrams, illustrating entities such as:

- **Personnel**, **Department**, **Vehicle**, **Equipment**, **Road**, **Disease**, **Inspection**, etc.
- Relationships (association, aggregation, inheritance) and basic attributes/methods.

## 5.2 Sequence Diagrams
Demonstrate **interaction flows** for major system operations—e.g., how a patrol request triggers data capture, which triggers an alert for maintenance, etc.

---

# 6. Module Design (OOP-based)

## 6.1 Personnel Management
- Create/edit/delete staff information
- Assign roles and track staff activity

## 6.2 Vehicle & Equipment Management
- Manage asset lifecycle (procurement, maintenance, transfer, disposal)

## 6.3 Patrol Management
- Schedule and execute **daily**, **periodic**, and **special** inspections

## 6.4 Maintenance Management
- Dispatch (manual or automatic) for repair tasks
- Monitor tasks, track execution progress

## 6.5 Reporting & Analytics
- Generate data dashboards and performance indicators for decision support

## 6.6 System Audit
- Log data, track suspicious or critical events

---

# 7. Testing Documentation

## 7.1 Code Listing (Class Definitions)
Includes core classes for personnel, patrol, maintenance, and data handling.

## 7.2 Test Design Techniques
- **Equivalence Class Partitioning**
- **Boundary Value Analysis**

## 7.3 Test Cases
- **Unit Tests** for each module
- **Integration** and **System** tests for end-to-end verification
- **Performance Tests** under various load conditions

## 7.4 Sample Test Code
Demonstrates automated tests covering CRUD operations and workflow validation.

## 7.5 Test Results
Show screenshots or log outputs of successful test cases and issues discovered, plus corrective actions.

---

# 8. User Manual

## 8.1 Login Interface
- Authentication via username/password
- Role-based login and permission validation

## 8.2 Main Dashboard
- Summaries of patrol status, urgent alerts, and key statistics

## 8.3 Modules & Navigation

- **Personnel Module**: Manage user profiles and roles
- **Road Module**: Access and update road data
- **Patrol Module**: Manage day-to-day, scheduled, and emergency patrol tasks
- **Disease Module**: Record, confirm, and archive road defects or diseases
- **Device Module**: Register and maintain hardware equipment
- **Vehicle Module**: Coordinate and service transport units
- **Task Assignment**: Dispatch maintenance tasks manually or automatically
- **Data Analysis**: Generate statistical charts, track real-time data
- **Review Module**: Make corrections or manual adjustments to data
- **Audit Module**: Examine logs and investigate unusual operations

---

# 9. Team Reflections

## 9.1 Tong Boyang (Leader)
Oversaw the entire project, including requirement analysis, data flow diagrams, equipment & audit modules, testing, documentation, and final presentation.

## 9.2 Lin Zhixia
Created the use case diagrams, class diagrams, Gantt chart, and implemented personnel and vehicle modules.

## 9.3 Zhang Zongbao
Responsible for detailed class design and patrol/disease modules implementation, as well as module integration.

## 9.4 Wang Tianci
Drafted use cases and data dictionary, developed data statistics module.

## 9.5 Li Na
Designed sequence diagrams, analyzed data flow diagrams, and implemented the dispatch and data correction modules.
