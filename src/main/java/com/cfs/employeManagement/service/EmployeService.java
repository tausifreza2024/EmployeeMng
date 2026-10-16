package com.cfs.employeManagement.service;

import com.cfs.employeManagement.entity.Employe;

import java.util.List;
import java.util.Optional;

public interface EmployeService<id> {

    Employe saveEmploye(Employe employe);
    List<Employe> getAllEmploye();
    Optional<Employe> getEmployeBYId(Integer id);

    Employe getEmployeeById(Integer id);

    Employe updateEmploye(Integer id, Employe employe);
    void deleteEmploye(Integer id);
}
