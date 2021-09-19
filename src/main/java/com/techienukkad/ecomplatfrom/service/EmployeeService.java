package com.techienukkad.ecomplatfrom.service;

import com.techienukkad.ecomplatfrom.dto.request.EmployeeRegistration;
import com.techienukkad.ecomplatfrom.dto.response.EmployeeResponseDto;

public interface EmployeeService {

   EmployeeResponseDto registerEmployees(EmployeeRegistration employeeRegistration);
}
