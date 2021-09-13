package com.techienukkad.ecomplatfrom.repository;

import com.techienukkad.ecomplatfrom.entity.Offices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface OfficesRepository extends JpaRepository<Offices, String>, JpaSpecificationExecutor<Offices> {

}