package com.example.securityproject.student;

import com.example.securityproject.student.Request;
import com.example.securityproject.student.Response;
import com.example.securityproject.student.Student;
import com.example.securityproject.student.StudentRepository;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Builder

public class StudentService {
    @Autowired
    private StudentRepository repository;

    public Response register(Request request) {
        var student = Student.builder()
                .name(request.getName())
                .dep(request.getDep())
                .email(request.getEmail())
                .password(request.getPassword())
                .build();
        repository.save(student);
        return Response.builder()
                .id(student.getId())
                .name(student.getName())
                .email(student.getEmail())
                .dep(student.getDep())
                .password(student.getPassword())
                .build();
    }
    public List<Response> getAll() {
        return repository.findAll().stream()
                .map(student -> Response.builder()
                        .id(student.getId())
                        .name(student.getName())
                        .email(student.getEmail())
                        .dep(student.getDep())
                        .build())
                .collect(Collectors.toList());
    }

//    public Response update(Integer id, Request request) {
//        Student student=repository.findById(id)
//                .orElseThrow(() -> new RuntimeException("Book not found"));
//        student.setName(request.getName());
//        student.setDep(request.getDep());
//        student.setPassword(request.getPassword());
//        student.setEmail(request.getEmail());
//       return Response.builder()
//               .name(student.getName())
//               .email(student.getEmail())
//               .dep(student.getDep())
//               .password(student.getPassword())
//               .build();
//    }
}