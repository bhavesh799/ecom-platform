package com.techienukkad.ecomplatfrom.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

@Data
@Entity
@Table(name = "payments")
public class Payments implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "customerNumber", nullable = false)
    private Integer customerNumber;

    @Id
    @Column(name = "checkNumber", nullable = false)
    private String checkNumber;

    @Column(name = "paymentDate", nullable = false)
    private Date paymentDate;

    @Column(name = "amount", nullable = false)
    private BigDecimal amount;

}
