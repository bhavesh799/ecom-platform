package com.techienukkad.ecomplatfrom.repository;

import com.techienukkad.ecomplatfrom.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface OrdersRepository extends JpaRepository<Orders, Integer>, JpaSpecificationExecutor<Orders> {

}