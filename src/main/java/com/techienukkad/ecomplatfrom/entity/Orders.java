package com.techienukkad.ecomplatfrom.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Data
@Entity
@Table(name = "orders")
public class Orders implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "orderNumber", nullable = false)
    private Integer orderNumber;

    @Column(name = "orderDate", nullable = false)
    private Date orderDate;

    @Column(name = "requiredDate", nullable = false)
    private Date requiredDate;

    @Column(name = "shippedDate")
    private Date shippedDate;

    @Column(name = "status", nullable = false)
    private String status;

    @Column(name = "customerNumber", nullable = false)
    private Integer customerNumber;

    @Column(name = "comments")
    private String comments;

}
