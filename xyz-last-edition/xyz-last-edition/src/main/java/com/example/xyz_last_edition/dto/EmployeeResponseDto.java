package com.example.xyz_last_edition.dto;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployeeResponseDto {
    private Long id;
    private String empName;
    private String email;
    private String phoneNumber;
    private Long aId;
    private String city;
    private String country;
}
