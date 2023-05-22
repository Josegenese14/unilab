package com.uninassau.unilab.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uninassau.unilab.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, String > {

}
