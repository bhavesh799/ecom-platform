package com.techienukkad.ecomplatfrom.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

@Data
@Entity
@Table(name = "payments")
public class Payments implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private PaymentPk paymentPk;

    @Column(name = "customerNumber", nullable = false,updatable = false,insertable = false)
    private Integer customerNumber;


    @Column(name = "checkNumber", nullable = false,updatable = false,insertable = false)
    private String checkNumber;

    @Column(name = "paymentDate", nullable = false)
    private Date paymentDate;

    @Column(name = "amount", nullable = false)
    private BigDecimal amount;

}
