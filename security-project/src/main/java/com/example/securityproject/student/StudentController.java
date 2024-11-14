package com.example.securityproject.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping
public class StudentController {
    @Autowired
    private StudentService service;


    @PostMapping("/register")
    public ResponseEntity<Response> register(@RequestBody Request request){
        return ResponseEntity.ok(service.register(request));
    }
    @GetMapping("/getall")
    public ResponseEntity<List<Response>> getall(){

        return ResponseEntity.ok(service.getAll());
    }
//    @PutMapping("/update/{id}")
//    public ResponseEntity<Response> update(@RequestBody Request request, @PathVariable Integer id){
//       return ResponseEntity.ok( service.update(id,request));
//    }
}
