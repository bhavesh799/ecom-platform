package com.techienukkad.ecomplatfrom.controller;

import com.techienukkad.ecomplatfrom.constants.EcomConstatns;
import com.techienukkad.ecomplatfrom.dto.ErrorDto;
import com.techienukkad.ecomplatfrom.dto.request.EmployeeRegistration;
import com.techienukkad.ecomplatfrom.dto.response.EmployeeResponseDto;
import com.techienukkad.ecomplatfrom.dto.response.GenericResponse;
import com.techienukkad.ecomplatfrom.service.EmployeeService;
import com.techienukkad.ecomplatfrom.service.impl.CustomerServiceImpl;
import com.techienukkad.ecomplatfrom.validator.RegistrationValidator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/employee")
@Slf4j
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private RegistrationValidator registrationValidator;

    @PostMapping(value = "/registration", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public GenericResponse<EmployeeResponseDto> registerEmployee(@RequestBody EmployeeRegistration employeeRegistration) {

        List<ErrorDto> errorDtoList = new ArrayList<>();
        ErrorDto errorDto = new ErrorDto();
        GenericResponse<EmployeeResponseDto> employeeResponseDtoGenericResponse = new GenericResponse<>();

        GenericResponse<EmployeeResponseDto> responseDtoGenericResponse = registrationValidator.validateCustomerRegistrationData(employeeRegistration, errorDtoList);


        try {
            EmployeeResponseDto employeeResponseDto = employeeService.registerEmployees(employeeRegistration);
            employeeResponseDtoGenericResponse.setData(employeeResponseDto);
            employeeResponseDtoGenericResponse.setStatus(EcomConstatns.SUCCESS);
            employeeResponseDtoGenericResponse.setMessage(EcomConstatns.REGISTERMESSAGE);
        } catch (Exception e) {
            log.error("error", e);
            errorDto.setErrorCode(EcomConstatns.ERRORCODE);
            errorDto.setErrorMessage(EcomConstatns.FAILURE);
            errorDtoList.add(errorDto);
            employeeResponseDtoGenericResponse.setErrors(errorDtoList);
        }

        return employeeResponseDtoGenericResponse;

    }

}
