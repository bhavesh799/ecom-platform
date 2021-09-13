package com.techienukkad.ecomplatfrom.dto.request;

import com.techienukkad.ecomplatfrom.constants.EcomConstatns;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Data
public class CustomerRegistrationRequest {

    private Integer customerNumber;
    @NotNull(message = EcomConstatns.customerNameNullMessage)
    private String customerName;
    private String contactFirstName;
    private String contactLastName;
    @Size(min = 10,max = 10)
    @NotNull(message = EcomConstatns.mobileNoNullMessage)
    private String phone;
    @NotNull(message = EcomConstatns.addressLine1NullMessage)
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    @Size(min = 6,max = 6)
    @NotNull(message = EcomConstatns.postalCodeNullMessage)
    private String postalCode;
    private String country;
    private int salesRepEmployeeNumber;
    private BigDecimal creditLimit;
}
