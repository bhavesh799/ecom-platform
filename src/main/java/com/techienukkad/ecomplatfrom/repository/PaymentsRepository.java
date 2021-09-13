package com.techienukkad.ecomplatfrom.repository;

import com.techienukkad.ecomplatfrom.entity.Payments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PaymentsRepository extends JpaRepository<Payments, String>, JpaSpecificationExecutor<Payments> {

}