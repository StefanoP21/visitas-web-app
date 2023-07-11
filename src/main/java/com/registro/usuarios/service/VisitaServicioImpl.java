package com.registro.usuarios.service;

import com.registro.usuarios.model.Visita;
import com.registro.usuarios.repository.VisitaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

@Service
public class VisitaServicioImpl implements VisitaServicio {
    @Autowired
    private VisitaRepositorio visitaRepositorio;

    @Override
    public List<Visita> listarVisitas() {
        return visitaRepositorio.findAll();
    }

    @Override
    public Visita guardarVisita(Visita visita) {
        return visitaRepositorio.save(visita);
    }

    @Override
    public Visita obtenerVisita(Long id) {
        return visitaRepositorio.findById(id).get();
    }

    @Override
    public Visita actualizarVisita(Visita visita) {
        return visitaRepositorio.save(visita);
    }

    @Override
    public void eliminarVisita(Long id) {
        visitaRepositorio.deleteById(id);
    }

}
