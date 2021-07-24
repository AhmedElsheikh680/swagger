package com.spring.swagger.controller;

import com.spring.swagger.model.Employee;
import com.spring.swagger.repo.EmployeeRepo;
import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@Api(value = "This Is Employee Controller")
@Tag(name = "Employee Controller Layer", description = "Controller Layer")
@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Tag(name = "Employee Controller Layer")
    //http://localhost:8080/api/v1/employees
    @GetMapping("/employees")
    public List<Employee> employees(){
        return employeeRepo.findAll();
    }


    @Tag(name = "Employee Controller Layer")
    //http://localhost:8080/api/v1/employee?id=
    @GetMapping("/employee")
    public Employee getEmployee(@RequestParam int id){
        return employeeRepo.findById(id).get();
    }



    @Operation(description = "Save Employee", summary = "Save Employee", tags = "Employee Controller Layer",
        responses ={
            @ApiResponse(responseCode = "201", description = "Created")
        }
    )
    //http://localhost:8080/api/v1/employee
    @PostMapping("/employee")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
        return ResponseEntity.status(HttpStatus.CREATED).body(
                employeeRepo.save(employee)
        );

    }

    @Tag(name = "Employee Controller Layer")
    //http://localhost:8080/api/v1/employee
    @PutMapping("/employee")
    public Employee updateEmployee(@RequestBody Employee employee){
        return employeeRepo.save(employee);
    }

    @Tag(name = "Employee Controller Layer")
    //http://localhost:8080/api/v1/employee?id=
    @DeleteMapping("/employee")
    public void deleteEmployee(@RequestParam int id){
        employeeRepo.deleteById(id);
    }


















}
