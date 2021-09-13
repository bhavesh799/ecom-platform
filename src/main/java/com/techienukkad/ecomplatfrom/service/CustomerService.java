package com.techienukkad.ecomplatfrom.service;

import com.techienukkad.ecomplatfrom.dto.CustomerDto;
import com.techienukkad.ecomplatfrom.dto.request.CustomerRegistrationRequest;

public interface CustomerService {

	CustomerDto onBoardCustomer(CustomerRegistrationRequest customerRegistrationRequest);
}
