package com.gussoft.demojwtsecurity.controller;

import com.gussoft.demojwtsecurity.model.Student;
import com.gussoft.demojwtsecurity.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping(
            path ="/students/",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    ResponseEntity<List<Student>> getAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @PostMapping(
            path ="/students/",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    ResponseEntity<Student> create(@RequestBody Student student) {
        Student data = service.save(student);
        return ResponseEntity.ok(data);
    }

}
