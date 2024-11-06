package com.example.xyz_last_edition.service;

import com.example.xyz_last_edition.dto.EmployeeRequestDto;
import com.example.xyz_last_edition.entity.Address;
import com.example.xyz_last_edition.entity.Employee;
import com.example.xyz_last_edition.repository.AddressRepository;
import com.example.xyz_last_edition.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private AddressRepository addressRepository;

    public Employee register(EmployeeRequestDto employeeRequestDto) {
        Employee employee = new Employee();
        employee.setEmpName(employeeRequestDto.getEmpName());
        employee.setEmail(employeeRequestDto.getEmail());
        employee.setPhoneNumber(employeeRequestDto.getPhoneNumber());

        Address address = new Address();
        address.setCity(employeeRequestDto.getCity());
        address.setCountry(employeeRequestDto.getCountry());

        Address savedAddress = addressRepository.save(address);
        employee.setAddress(savedAddress);
        employeeRepository.save(employee);
        return employee;
    }

    public Optional<Employee> findByEmpName(String empName) {
       return employeeRepository.findByEmpName(empName);
    }
    public Optional<Employee> findById(Long id) {
        return employeeRepository.findById(id);
    }

    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    public void deleteAllEmployees() {
        employeeRepository.deleteAll();
    }

    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }

    public Employee updateEmployee(Long id, EmployeeRequestDto employeeRequestDto) {

        Optional<Employee> optionalEmployee = employeeRepository.findById(id);
        Employee employee = optionalEmployee.get();
        employee.setEmpName(employeeRequestDto.getEmpName());
        employee.setEmail(employeeRequestDto.getEmail());
        employee.setPhoneNumber(employeeRequestDto.getPhoneNumber());

        Address address = employee.getAddress();
        if (address != null) {
            address.setCity(employeeRequestDto.getCity());
            address.setCountry(employeeRequestDto.getCountry());
            addressRepository.save(address);
        } else {
            address = new Address();
            address.setCity(employeeRequestDto.getCity());
            address.setCountry(employeeRequestDto.getCountry());
            Address savedAddress = addressRepository.save(address);
            employee.setAddress(savedAddress);
        }
        return employeeRepository.save(employee);
    }


}


