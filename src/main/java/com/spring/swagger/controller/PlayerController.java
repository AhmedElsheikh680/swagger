package com.spring.swagger.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@Api(description = "Player Controller layer")
@RestController
@RequestMapping("/api/v1")
public class PlayerController {



    @ApiOperation(value = "Get Name",tags = "employee-controller")
    @GetMapping("/getName")
    public String getName(){
        return "Ahmed";
    }


    @ApiOperation(value = "Get Student")
    @GetMapping("/getStudent")
    public String getStudent(){
        return "I am Student Ahmed Elsheikh";
    }
}
