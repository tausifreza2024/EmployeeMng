package com.cfs.employeManagement.controller;

import com.cfs.employeManagement.entity.Employe;
import com.cfs.employeManagement.service.EmployeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeController {


    @Autowired
    private EmployeService employeService;

    @PostMapping
    public Employe saveEmploye(@RequestBody Employe employe) {
        return employeService.saveEmploye(employe);
    }

    @GetMapping
    public List<Employe> getAllEmployee() {
        return employeService.getAllEmploye();
    }

    @GetMapping("/{id}")
    public Optional<Employe> getEmployeBYId(@PathVariable Integer id) {
        return employeService.getEmployeBYId(id);
    }

    @PutMapping("/{id}")
    public Employe updateEmploye(
            @PathVariable Integer id,
            @RequestBody Employe employe) {

        return employeService.updateEmploye(id, employe);
    }

    @DeleteMapping("/{id}")
    public void deleteEmploye(@PathVariable Integer id) {
        employeService.deleteEmploye(id);
    }


}
