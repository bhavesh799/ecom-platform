package com.techienukkad.ecomplatfrom.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "orderdetails")
public class Orderdetails implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "orderNumber", nullable = false)
    private Integer orderNumber;

    @Id
    @Column(name = "productCode", nullable = false)
    private String productCode;

    @Column(name = "quantityOrdered", nullable = false)
    private Integer quantityOrdered;

    @Column(name = "priceEach", nullable = false)
    private BigDecimal priceEach;

    @Column(name = "orderLineNumber", nullable = false)
    private Integer orderLineNumber;

}
