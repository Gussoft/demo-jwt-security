package com.gussoft.demojwtsecurity.service;

import com.gussoft.demojwtsecurity.exception.demoException;
import com.gussoft.demojwtsecurity.model.Student;
import java.util.List;

public interface StudentService {

    List<Student> findAll();

    Student getById(long id);

    Student save(Student obj);

    Student update(long id, Student obj);

    void delete(long id) throws demoException;

}
