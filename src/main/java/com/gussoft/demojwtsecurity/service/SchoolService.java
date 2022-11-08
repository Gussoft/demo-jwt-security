package com.gussoft.demojwtsecurity.service;

import com.gussoft.demojwtsecurity.exception.demoException;
import com.gussoft.demojwtsecurity.model.School;
import java.util.List;

public interface SchoolService {

    List<School> findAll();

    School getById(long id);

    School save(School obj);

    School update(long id, School obj);

    void delete(long id) throws demoException;

}
