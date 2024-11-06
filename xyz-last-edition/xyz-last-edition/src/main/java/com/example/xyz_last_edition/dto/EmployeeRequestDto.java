package com.example.xyz_last_edition.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployeeRequestDto{
//    private String name;
    private String empName;
    private String email;
    private String phoneNumber;
    private String city;
    private String country;

//    public EmployeeRequestDto() {
//    }
//
//    public EmployeeRequestDto(String empName,
//                              String email,
//                              String phoneNumber,
//                              String city,
//                              String country) {
//        this.empName = empName;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
//        this.city = city;
//        this.country = country;
//    }
}
