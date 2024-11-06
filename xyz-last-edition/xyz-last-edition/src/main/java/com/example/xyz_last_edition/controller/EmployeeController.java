package com.example.xyz_last_edition.controller;

import com.example.xyz_last_edition.dto.EmployeeRequestDto;
import com.example.xyz_last_edition.entity.Employee;
import com.example.xyz_last_edition.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping(value="/register")
    public Employee register(@RequestBody EmployeeRequestDto employeeRequestDto){
     return employeeService.register(employeeRequestDto);
    }
    @GetMapping("/getall")
    public ResponseEntity<List<Employee>> getAllEmployees() {
        return ResponseEntity.ok(employeeService.findAll());
    }
    @GetMapping("/get/{id}")
    public ResponseEntity<Optional<Employee>> getEmployeeById(@PathVariable Long id) {
        return ResponseEntity.ok(employeeService.findById(id)); }

    @GetMapping("/search/{empName}")
    public ResponseEntity<Optional<Employee>> getEmployeeByName(@PathVariable String empName) {
        return  ResponseEntity.ok(employeeService.findByEmpName(empName));
    }
    @PutMapping("/update/{id}")
    public Employee updateEmployee(@PathVariable Long id,@RequestBody EmployeeRequestDto employeeRequestDto) {
        return employeeService.updateEmployee( id,employeeRequestDto);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
        return ResponseEntity.noContent().build();
    }
    @DeleteMapping("/delete")
    public ResponseEntity<Void> deleteAllEmployees() {
        employeeService.deleteAllEmployees();
        return ResponseEntity.noContent().build(); // Return 204 No Content
    }
//    @GetMapping("get/{id}")
//    public List<EmployeeResponseDto> getById(@PathVariable Long id){
//        return employeeService.getById(id);
//    }



}
