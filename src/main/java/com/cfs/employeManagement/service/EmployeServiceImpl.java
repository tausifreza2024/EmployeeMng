package com.cfs.employeManagement.service;

import com.cfs.employeManagement.entity.Employe;
import com.cfs.employeManagement.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeServiceImpl implements EmployeService{

      @Autowired
      private EmployeeRepo employeeRepo;

    @Override
    public Employe saveEmploye(Employe employe) {
        return employeeRepo.save(employe);
    }

    @Override
    public List<Employe> getAllEmploye() {
        return employeeRepo.findAll();
    }

    @Override
    public Optional<Employe> getEmployeBYId(Integer id) {
        return employeeRepo.findById(id);
    }

    @Override
    public Employe getEmployeeById(Integer id) {
        return employeeRepo.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Employee not found with ID: " + id));
    }

    @Override
    public Employe updateEmploye(Integer id, Employe employe) {

        Employe existingEmployee = employeeRepo.findById(id)
                .orElseThrow(() ->
                        new RuntimeException(
                                "Employee not found with ID: " + id));

        existingEmployee.setName(employe.getName());
        existingEmployee.setEmail(employe.getEmail());
        existingEmployee.setDepartmetn(employe.getDepartmetn());
        existingEmployee.setSalary(employe.getSalary());

        return employeeRepo.save(existingEmployee);
    }

    @Override
    public void deleteEmploye(Integer id) {

        Employe existingEmployee=employeeRepo.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Employee not found with ID: " + id));
          employeeRepo.delete(existingEmployee);

    }
}
