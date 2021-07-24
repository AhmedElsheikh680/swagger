package com.spring.swagger.controller;

import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Api(value = "This Is Player Controller")
@Tag(name = "Player controller Layer", description = "Controller Layer")
@RestController
@RequestMapping("/api/v1")
public class PlayerController {


    @Operation(tags = "Player controller Layer")
    @GetMapping("/getName")
    public String getName(){
        return "Ahmed";
    }

    @Operation(tags = "Employee Controller Layer")
    @GetMapping("/getStudent")
    public String getStudent(){
        return "I am Student Ahmed Elsheikh";
    }
}
