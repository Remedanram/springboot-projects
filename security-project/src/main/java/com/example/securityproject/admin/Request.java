package com.example.securityproject.admin;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Request {
    private String name;
    private String email;
    private String password;
    private Role role;
//    private String currentPassword;
//    private String newPassword;
//    private String confirmationPassword;
}
