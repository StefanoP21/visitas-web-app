package com.registro.usuarios.service;

import com.registro.usuarios.model.Visita;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.ui.Model;

import java.util.List;

public interface VisitaServicio {
    List<Visita> listarVisitas();

    Visita guardarVisita(Visita visita);

    Visita obtenerVisita(Long id);

    Visita actualizarVisita(Visita visita);

    void eliminarVisita(Long id);

}
