package com.techienukkad.ecomplatfrom.service.impl;

import com.techienukkad.ecomplatfrom.dto.CustomerDto;
import com.techienukkad.ecomplatfrom.dto.request.CustomerRegistrationRequest;
import com.techienukkad.ecomplatfrom.entity.Customers;
import com.techienukkad.ecomplatfrom.repository.CustomersRepository;
import com.techienukkad.ecomplatfrom.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomersRepository customersRepository;

    @Override
    public CustomerDto onBoardCustomer(CustomerRegistrationRequest customerRegistrationRequest) {

        Customers customer = new Customers();

        //Here use the entity class to send the data in the db, directly service class will not interact with DB
        customer.setAddressLine1(customerRegistrationRequest.getAddressLine1());
        customer.setAddressLine2(customerRegistrationRequest.getAddressLine1());
        customer.setCity(customerRegistrationRequest.getCity());
        customer.setContactFirstName(customerRegistrationRequest.getContactFirstName());
        customer.setContactLastName(customerRegistrationRequest.getContactLastName());
        customer.setCountry(customerRegistrationRequest.getCountry());
        customer.setCreditLimit(customerRegistrationRequest.getCreditLimit());
        customer.setCustomerName(customerRegistrationRequest.getCustomerName());
        customer.setCustomerNumber(customerRegistrationRequest.getCustomerNumber());
        customer.setPhone(customerRegistrationRequest.getPhone());
        customer.setPostalCode(customerRegistrationRequest.getPostalCode());
        customer.setSalesRepEmployeeNumber(customerRegistrationRequest.getSalesRepEmployeeNumber());
        customer.setState(customerRegistrationRequest.getState());
        customer.setState(customerRegistrationRequest.getState());

        Customers save = customersRepository.save(customer);

        CustomerDto customerDto = new CustomerDto(save);
        return customerDto;
    }
}
