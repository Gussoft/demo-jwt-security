package com.gussoft.demojwtsecurity.service;

import com.gussoft.demojwtsecurity.exception.demoException;
import com.gussoft.demojwtsecurity.model.Usuario;
import java.util.List;
import java.util.Optional;

public interface UsuarioService {

    List<Usuario> findAll();

    Usuario getById(long id);

    Optional<Usuario> getOneByEmail(String email);

    Usuario save(Usuario obj);

    Usuario update(long id, Usuario obj);

    void delete(long id) throws demoException;

}
