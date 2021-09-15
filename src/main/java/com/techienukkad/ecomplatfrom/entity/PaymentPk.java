package com.techienukkad.ecomplatfrom.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;
import java.io.Serializable;

@Embeddable
public class PaymentPk implements Serializable {

    @Column(name = "customerNumber", nullable = false)
    private Integer customerNumber;

    @Column(name = "checkNumber", nullable = false)
    private String checkNumber;
}
