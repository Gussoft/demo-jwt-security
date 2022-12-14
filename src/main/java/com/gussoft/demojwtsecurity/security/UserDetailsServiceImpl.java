package com.gussoft.demojwtsecurity.security;

import com.gussoft.demojwtsecurity.model.Usuario;
import com.gussoft.demojwtsecurity.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UsuarioService service;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Usuario usuario = service
                .getOneByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("El usuario con Email: " + email + "no existe!"));
        return new UserDetailsImpl(usuario);
    }
}
