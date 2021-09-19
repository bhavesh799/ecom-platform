package com.techienukkad.ecomplatfrom.validator.RegValidatorImpl;

import com.techienukkad.ecomplatfrom.constants.EcomConstatns;
import com.techienukkad.ecomplatfrom.dto.ErrorDto;
import com.techienukkad.ecomplatfrom.dto.request.CustomerRegistrationRequest;
import com.techienukkad.ecomplatfrom.dto.request.EmployeeRegistration;
import com.techienukkad.ecomplatfrom.dto.response.EmployeeResponseDto;
import com.techienukkad.ecomplatfrom.dto.response.GenericResponse;
import com.techienukkad.ecomplatfrom.validator.RegistrationValidator;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RegistrationValidatorImpl implements RegistrationValidator {


    @Override
    public GenericResponse<EmployeeResponseDto> validateCustomerRegistrationData(EmployeeRegistration customerRegistrationRequest, List<ErrorDto> errorDtos) {

        GenericResponse<EmployeeResponseDto> dtoGenericResponse = new GenericResponse<>();
        ErrorDto errorDto = new ErrorDto();
        if (customerRegistrationRequest.getEmployeeNumber() == null) {
            errorDto.setErrorMessage(EcomConstatns.employeeNoNullMessage);
            errorDto.setErrorCode(EcomConstatns.badRequestErrorCode);
            errorDtos.add(errorDto);
            dtoGenericResponse.setErrors(errorDtos);
        }

        return dtoGenericResponse;
    }
}
