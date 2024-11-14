package com.example.securityproject.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
@RequestMapping
public class AdminController {
    @Autowired
    private AdminService service;
    @PostMapping("/admin/register")
    public ResponseEntity<Response> register(@RequestBody Request request){
        return ResponseEntity.ok(service.register(request));
    }
    @PostMapping("/admin/authenticate")
    public ResponseEntity<Response> authenticate(@RequestBody Request request){
        return ResponseEntity.ok(service.authenticate(request));

    }
//    @PatchMapping("/admin/change-pass")
//    public ResponseEntity<?> changePassword(
//            @RequestBody Request request,
//            Principal connectedUser
//    ) {
//        service.changePassword(request, connectedUser);
//        return ResponseEntity.ok().build();
//    }


}
