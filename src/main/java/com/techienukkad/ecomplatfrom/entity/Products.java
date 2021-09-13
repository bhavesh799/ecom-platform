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
@Table(name = "products")
public class Products implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "productCode", nullable = false)
    private String productCode;

    @Column(name = "productName", nullable = false)
    private String productName;

    @Column(name = "productLine", nullable = false)
    private String productLine;

    @Column(name = "productScale", nullable = false)
    private String productScale;

    @Column(name = "productVendor", nullable = false)
    private String productVendor;

    @Column(name = "quantityInStock", nullable = false)
    private Integer quantityInStock;

    @Column(name = "buyPrice", nullable = false)
    private BigDecimal buyPrice;

    @Column(name = "MSRP", nullable = false)
    private BigDecimal MSRP;

    @Column(name = "productDescription", nullable = false)
    private String productDescription;

}
