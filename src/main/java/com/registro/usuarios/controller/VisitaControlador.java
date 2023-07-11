package com.registro.usuarios.controller;

import com.registro.usuarios.model.Visita;
import com.registro.usuarios.service.VisitaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.sql.SQLException;

@Controller
public class VisitaControlador {
    @Autowired
    private VisitaServicio visitaServicio;

    @GetMapping({"/visitas", "/"})
    public String listarVisitas(Model model) {
        model.addAttribute("visitas", visitaServicio.listarVisitas());
        return "index";
    }

    @GetMapping("/visitas/crear")
    public String crearVisita(Model model) {
        Visita visita = new Visita();
        model.addAttribute("visita", visita);
        return "crear_visita";
    }

    @PostMapping("/visitas")
    public String guardarVisita(@ModelAttribute("visita") Visita visita, Model model) {
        try {
            visitaServicio.guardarVisita(visita);
            return "redirect:/visitas";
        } catch (DataAccessException e) {
            model.addAttribute("error", e.getMessage());
        }
        return "crear_visita";
    }

    @GetMapping("/visitas/editar/{id}")
    public String editarVisita(@PathVariable Long id, Model model) {
        Visita visita = visitaServicio.obtenerVisita(id);
        model.addAttribute("visita", visita);
        return "editar_visita";
    }

    @PostMapping("/visitas/{id}")
    public String actualizarVisita(@PathVariable Long id, @ModelAttribute("visita") Visita visita, Model model) {
        try {
            visitaServicio.actualizarVisita(visita);
            return "redirect:/visitas";
        } catch (DataAccessException e) {
            model.addAttribute("error", e.getMessage());
        }
        return "editar_visita";
    }

    @GetMapping("/visitas/eliminar/{id}")
    public String eliminarVisita(@PathVariable Long id) {
        visitaServicio.eliminarVisita(id);
        return "redirect:/visitas";
    }
}
