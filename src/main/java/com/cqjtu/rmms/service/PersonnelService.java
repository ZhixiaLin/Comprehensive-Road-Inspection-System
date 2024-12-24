package com.cqjtu.rmms.service;

import com.cqjtu.rmms.entity.PersonnelInformation;
import java.util.List;

public interface PersonnelService {
    PersonnelInformation get(Integer employeeId);
    void addPersonnel(PersonnelInformation personnel);
    void removePersonnel(Integer employeeId);
    void updatePersonnel(PersonnelInformation personnel);
    List<PersonnelInformation> loadAll();
}