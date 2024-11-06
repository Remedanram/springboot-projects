package com.example.xyz_last_edition.repository;

import com.example.xyz_last_edition.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long > {


    Optional<Employee> findByEmpName(String empName);
}
