package com.example.xyz_last_edition.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long aId;
    private String city;
    private String country;
//    @OneToMany(cascade = CascadeType.ALL)
//    private List<Employee> employee;

}
