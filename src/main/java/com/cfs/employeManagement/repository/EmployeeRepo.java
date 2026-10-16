package com.cfs.employeManagement.repository;

import com.cfs.employeManagement.entity.Employe;
import org.springframework.data.jpa.repository.JpaRepository;


//dont need @Repositry(register as bean) annotation because use JpaRepository, spring creates a proxy object of EmployeeRepo using class(internal) at startup and registers it as a bean, so @Repository is not needed.
public interface EmployeeRepo extends JpaRepository<Employe,Integer> { //interface can extend another interface.

}
