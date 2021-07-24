package com.spring.swagger.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "emp")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @ApiModelProperty(value = "This Is ID Of Employee")
    private int id;

    @ApiModelProperty(value = "This Is Full Name Of Employee", required = true)
    @Column(name = "full_name")
    private String fullName;

    @Column(name = "age")
    private String age;

    @Column(name = "address")
    private String address;

    @Column(name = "phone")
    private String phone;
}
