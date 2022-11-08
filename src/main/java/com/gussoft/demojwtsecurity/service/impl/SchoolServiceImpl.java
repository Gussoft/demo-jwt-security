package com.gussoft.demojwtsecurity.service.impl;

import com.gussoft.demojwtsecurity.exception.demoException;
import com.gussoft.demojwtsecurity.model.School;
import com.gussoft.demojwtsecurity.repository.SchoolRepository;
import com.gussoft.demojwtsecurity.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SchoolServiceImpl implements SchoolService {

    @Autowired
    private SchoolRepository repo;

    @Override
    public List<School> findAll() {
        return repo.findAll();
    }

    @Override
    public School getById(long id) {
        Optional<School> data = repo.findById(id);
        return data.orElse(null);
    }

    @Override
    public School save(School obj) {
        return repo.save(obj);
    }

    @Override
    public School update(long id, School obj) {
        Optional<School> data = repo.findById(id);
        if (data.isPresent()) {
            data.get().setNombre(obj.getNombre());
            data.get().setUbicacion(obj.getUbicacion());
            data.get().setStudent(obj.getStudent());
            return data.get();
        }
        return null;
    }

    @Override
    public void delete(long id) throws demoException {
        Optional<School> data = repo.findById(id);
        if (data.isPresent()) {
            repo.deleteById(id);
        } else {
            throw new demoException("Obj no encontrado");
        }
    }
}
