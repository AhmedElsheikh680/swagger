package com.spring.swagger.controller;

import com.spring.swagger.model.Employee;
import com.spring.swagger.repo.EmployeeRepo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@Api(description = "Employee Controller Layer")
@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    @Autowired
    private EmployeeRepo employeeRepo;


    //http://localhost:8080/api/v1/employees
    @GetMapping("/employees")
    public List<Employee> employees(){
        return employeeRepo.findAll();
    }


    @ApiOperation(value = "Get Employee", notes = "You Must Get Object of Employee")
    //http://localhost:8080/api/v1/employee?id=
    @GetMapping("/employee")
    public ResponseEntity<Employee> getEmployee(@RequestParam int id){

        return ResponseEntity.status(HttpStatus.OK).body(
                employeeRepo.findById(id).get()
        );
    }



    @ApiOperation(value = "Save Employee", notes = "You Must Save Object Of Employee")
    //http://localhost:8080/api/v1/employee
    @PostMapping("/employee")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
        return ResponseEntity.status(HttpStatus.CREATED).body(
                employeeRepo.save(employee)
        );

    }


    @ApiOperation(value = "Edit Employee", notes = "You Must Edit Object Of Employee")
    //http://localhost:8080/api/v1/employee
    @PutMapping("/employee")
    public Employee updateEmployee(@RequestBody Employee employee){
        return employeeRepo.save(employee);
    }



    @ApiOperation(value = "Delete Employee", notes = "You Must Delete Object Of Employee")
    //http://localhost:8080/api/v1/employee?id=
    @DeleteMapping("/employee")
    public void deleteEmployee(@RequestParam int id){
        employeeRepo.deleteById(id);
    }


















}
