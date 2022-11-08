package com.gussoft.demojwtsecurity.service.impl;

import com.gussoft.demojwtsecurity.exception.demoException;
import com.gussoft.demojwtsecurity.model.Student;
import com.gussoft.demojwtsecurity.repository.StudentRepository;
import com.gussoft.demojwtsecurity.service.StudentService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository repo;

    @Override
    public List<Student> findAll() {
        return repo.findAll();
    }

    @Override
    public Student getById(long id) {
        Optional<Student> data = repo.findById(id);
        return data.orElse(null);
    }

    @Override
    public Student save(Student obj) {
        return repo.save(obj);
    }

    @Override
    public Student update(long id, Student obj) {
        Optional<Student> data = repo.findById(id);
        if (data.isPresent()) {
            data.get().setName(obj.getName());
            data.get().setDireccion(obj.getDireccion());
            data.get().setGenero(obj.getGenero());
            data.get().setEstado(obj.getEstado());
            data.get().setSchool(obj.getSchool());
            return data.get();
        }
        return null;
    }

    @Override
    public void delete(long id) throws demoException {
        Optional<Student> data = repo.findById(id);
        if (data.isPresent()) {
            repo.deleteById(id);
        } else {
            throw new demoException("Obj no encontrado");
        }
    }
}
