package com.techienukkad.ecomplatfrom.dto;

import com.techienukkad.ecomplatfrom.entity.Customers;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class CustomerDto {

    private Integer customerNumber;
    private String customerName;
    private String contactFirstName;
    private String contactLastName;
    private String phone;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String postalCode;
    private String country;
    private int salesRepEmployeeNumber;
    private BigDecimal creditLimit;


    public CustomerDto(Customers save) {
       this.contactFirstName = save.getContactFirstName();
       this.addressLine1=save.getAddressLine1();
       this.addressLine2=save.getAddressLine2();
       this.customerNumber=save.getCustomerNumber();
       this.customerName= save.getCustomerName();
       this.contactLastName=save.getContactLastName();
       this.phone=save.getPhone();
       this.city=save.getCity();
       this.state=save.getState();
       this.postalCode=save.getPostalCode();
       this.country=save.getCountry();
       this.salesRepEmployeeNumber=save.getSalesRepEmployeeNumber();
       this.creditLimit=save.getCreditLimit();
    }
}
