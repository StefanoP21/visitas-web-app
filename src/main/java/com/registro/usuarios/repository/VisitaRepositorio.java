package com.registro.usuarios.repository;

import com.registro.usuarios.model.Visita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitaRepositorio extends JpaRepository<Visita, Long> {
//    Visita findByDni_afiliado(String dni_afiliado);
}
