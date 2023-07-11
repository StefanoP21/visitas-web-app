package com.registro.usuarios.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.registro.usuarios.controller.dto.UsuarioRegistroDTO;
import com.registro.usuarios.model.Usuario;

public interface UsuarioServicio extends UserDetailsService{
	Usuario guardar(UsuarioRegistroDTO registroDTO);
}
