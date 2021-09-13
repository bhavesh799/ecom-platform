package com.techienukkad.ecomplatfrom.repository;

import com.techienukkad.ecomplatfrom.entity.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CustomersRepository extends JpaRepository<Customers, Integer> {

}