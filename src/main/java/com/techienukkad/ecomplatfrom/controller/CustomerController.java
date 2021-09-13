package com.techienukkad.ecomplatfrom.controller;

import com.techienukkad.ecomplatfrom.constants.EcomConstatns;
import com.techienukkad.ecomplatfrom.dto.CustomerDto;
import com.techienukkad.ecomplatfrom.dto.ErrorDto;
import com.techienukkad.ecomplatfrom.dto.request.CustomerRegistrationRequest;
import com.techienukkad.ecomplatfrom.dto.response.GenericResponse;
import com.techienukkad.ecomplatfrom.validator.RegistrationValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techienukkad.ecomplatfrom.service.CustomerService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    //private RegistrationValidator registrationValidator;

    @PostMapping(value = "/registration", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public GenericResponse<CustomerDto> registerCustomer(@RequestBody CustomerRegistrationRequest customerRegistrationRequest) {

       // registrationValidator.validateCustomerRegistrationData(customerRegistrationRequest);
        List<ErrorDto> errorDtoList = new ArrayList<>();
        GenericResponse<CustomerDto> response = new GenericResponse<CustomerDto>();
        ErrorDto errorDto = new ErrorDto();
        try {
            CustomerDto customerDto = customerService.onBoardCustomer(customerRegistrationRequest);

            response.setData(customerDto);
            response.setMessage(EcomConstatns.REGISTERMESSAGE);
            response.setStatus(EcomConstatns.SUCCESS);

            //is it required to set Error list as null

            //HOW @Null work and where i can catch the error

        } catch (Exception e) {
            //here any other parameter in Generic response class

            //How to add @NotNull vala error
            errorDto.setErrorCode(EcomConstatns.ERRORCODE);
            errorDto.setErrorMessage(EcomConstatns.FAILURE);
            errorDtoList.add(errorDto);
            response.setErrors(errorDtoList);
        }
        return response;
    }
}
