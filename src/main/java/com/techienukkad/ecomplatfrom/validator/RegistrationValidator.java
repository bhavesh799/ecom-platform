package com.techienukkad.ecomplatfrom.validator;

import com.techienukkad.ecomplatfrom.dto.ErrorDto;
import com.techienukkad.ecomplatfrom.dto.request.CustomerRegistrationRequest;
import com.techienukkad.ecomplatfrom.dto.request.EmployeeRegistration;
import com.techienukkad.ecomplatfrom.dto.response.EmployeeResponseDto;
import com.techienukkad.ecomplatfrom.dto.response.GenericResponse;

import java.util.List;

public interface RegistrationValidator {


     GenericResponse<EmployeeResponseDto> validateCustomerRegistrationData(EmployeeRegistration customerRegistrationRequest, List<ErrorDto> errorDtos);




}
