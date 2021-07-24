package com.spring.swagger.controller;

import com.spring.swagger.model.Employee;
import com.spring.swagger.repo.EmployeeRepo;
import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@Api(value = "This Is Employee Controller", description = "Controller layer")
@Tag(name = "Employee Controller Layer")
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

    @Tag(name = "Employee Controller Layer")
    //http://localhost:8080/api/v1/employee
    @PostMapping("/employee")
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeRepo.save(employee);
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
