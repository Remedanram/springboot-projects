package com.example.securityproject.student;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Response {
    private Integer id;
    private String name;
    private String dep;
    private String email;
    private String password;
}
