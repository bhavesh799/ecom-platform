package com.techienukkad.ecomplatfrom.repository;

import com.techienukkad.ecomplatfrom.entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface EmployeesRepository extends JpaRepository<Employees, Integer>, JpaSpecificationExecutor<Employees> {

}