package com.techienukkad.ecomplatfrom.repository;

import com.techienukkad.ecomplatfrom.entity.HibernateSequence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface HibernateSequenceRepository extends JpaRepository<HibernateSequence, Void>, JpaSpecificationExecutor<HibernateSequence> {

}