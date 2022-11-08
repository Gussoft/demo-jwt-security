package com.gussoft.demojwtsecurity.service.impl;

import com.gussoft.demojwtsecurity.exception.demoException;
import com.gussoft.demojwtsecurity.model.Usuario;
import com.gussoft.demojwtsecurity.repository.UsuarioRepository;
import com.gussoft.demojwtsecurity.service.UsuarioService;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository repo;

    @Override
    public List<Usuario> findAll() {
        return repo.findAll();
    }

    @Override
    public Usuario getById(long id) {
        return null;
    }

    @Override
    public Optional<Usuario> getOneByEmail(String email) {
        return repo.findOneByEmail(email);
    }

    @Override
    public Usuario save(Usuario obj) {
        return null;
    }

    @Override
    public Usuario update(long id, Usuario obj) {
        return null;
    }

    @Override
    public void delete(long id) throws demoException {

    }
}
