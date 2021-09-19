package com.techienukkad.ecomplatfrom.dto.response;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class EmployeeResponseDto {

    @NotNull(message = "employee no can not be null")
    private Integer employeeNumber;

    private String lastName;

    private String firstName;

    private String extension;

    private String email;

    private String officeCode;

    private Integer reportsTo;

    private String jobTitle;
}
