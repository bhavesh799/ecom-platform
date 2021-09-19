package com.techienukkad.ecomplatfrom.dto.request;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class EmployeeRegistration {


    @NotNull(message = "employee no can not be null")
    private Integer employeeNumber;

    private String lastName;

    private String firstName;

    private String extension;
    @NotNull(message = "email can not be null")
    private String email;

    private String officeCode;

    private Integer reportsTo;

    private String jobTitle;
}
