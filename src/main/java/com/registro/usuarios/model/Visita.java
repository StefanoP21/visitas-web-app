package com.registro.usuarios.model;

import org.hibernate.validator.constraints.UniqueElements;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.websocket.OnError;

@Entity
@Table(name = "tbl_visitas", uniqueConstraints = {
        @UniqueConstraint(columnNames = "dni_afiliado")
})
public class Visita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "local", nullable = false)
    private String local;
    @Column(name = "dni_afiliado", nullable = false)
    private String dni_afiliado;
    @Column(name = "fecha", nullable = false)
    private String fecha;
    @Column(name = "hora", nullable = false)
    private String hora;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getDni_afiliado() {
        return dni_afiliado;
    }

    public void setDni_afiliado(String dni_afiliado) {
        this.dni_afiliado = dni_afiliado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Visita(Long id, String local, String dni_afiliado, String fecha, String hora) {
        this.id = id;
        this.local = local;
        this.dni_afiliado = dni_afiliado;
        this.fecha = fecha;
        this.hora = hora;
    }

    public Visita() {

    }

    @Override
    public String toString() {
        return "Visita{" +
                "id=" + id +
                ", local='" + local + '\'' +
                ", dni_afiliado='" + dni_afiliado + '\'' +
                ", fecha='" + fecha + '\'' +
                ", hora='" + hora + '\'' +
                '}';
    }
}
