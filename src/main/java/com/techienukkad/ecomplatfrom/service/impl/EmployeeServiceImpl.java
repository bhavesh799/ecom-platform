package com.techienukkad.ecomplatfrom.service.impl;

import com.techienukkad.ecomplatfrom.dto.request.EmployeeRegistration;
import com.techienukkad.ecomplatfrom.dto.response.EmployeeResponseDto;
import com.techienukkad.ecomplatfrom.entity.Employees;
import com.techienukkad.ecomplatfrom.repository.EmployeesRepository;
import com.techienukkad.ecomplatfrom.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeesRepository employeesRepository;

    @Override
    public EmployeeResponseDto registerEmployees(EmployeeRegistration employeeRegistration){

        Employees employees = new Employees(); //Entity class object to set data in entity
        employees.setEmail(employeeRegistration.getEmail());
        employees.setEmployeeNumber(employeeRegistration.getEmployeeNumber());
        employees.setExtension(employeeRegistration.getExtension());
        employees.setFirstName(employeeRegistration.getFirstName());
        employees.setJobTitle(employeeRegistration.getJobTitle());
        employees.setLastName(employeeRegistration.getLastName());
        employees.setOfficeCode(employeeRegistration.getOfficeCode());
        employees.setReportsTo(employeeRegistration.getReportsTo());

        Employees save = employeesRepository.save(employees); //called JPA method to save data in DB

        EmployeeResponseDto employeeResponseDto = new EmployeeResponseDto(); //Set the data in response DTO class from DB
        employeeResponseDto.setEmail(save.getEmail());
        employeeResponseDto.setEmployeeNumber(save.getEmployeeNumber());
        employeeResponseDto.setExtension(save.getExtension());
        employeeResponseDto.setFirstName(save.getFirstName());
        employeeResponseDto.setJobTitle(save.getJobTitle());
        employeeResponseDto.setLastName(save.getLastName());
        employeeResponseDto.setOfficeCode(save.getOfficeCode());
        employeeResponseDto.setReportsTo(save.getReportsTo());

        return employeeResponseDto;
    }

}
