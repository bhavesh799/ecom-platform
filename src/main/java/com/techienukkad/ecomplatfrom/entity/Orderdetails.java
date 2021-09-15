package com.techienukkad.ecomplatfrom.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "orderdetails")
public class Orderdetails implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private OrderDetailPk orderDetailPk;

    @Column(name = "orderNumber", nullable = false,updatable = false,insertable = false)
    private Integer orderNumber;


    @Column(name = "productCode", nullable = false,updatable = false,insertable = false)
    private String productCode;

    @Column(name = "quantityOrdered", nullable = false)
    private Integer quantityOrdered;

    @Column(name = "priceEach", nullable = false)
    private BigDecimal priceEach;

    @Column(name = "orderLineNumber", nullable = false)
    private Integer orderLineNumber;

}
