package com.dettorrecv.backend.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Fernando D'Ettorre
 */

@Getter @Setter

@Entity

public class Empleador implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nombre;
    private String email;
    private String titulo;
    private String telefono;
    private String imagen;
    private String cuit;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaInicio;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaFin;
    private String tareas;
    

    public Empleador() {
    }


    public Empleador(Long id, String nombre, String email, String titulo, String telefono, String imagen, String cuit, 
            Date fechaInicio, Date fechaFin, String tareas ) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.titulo = titulo;
        this.telefono = telefono;
        this.imagen = imagen;
        this.cuit = cuit;
        this.fechaInicio = fechaInicio;
        this.fechaInicio = fechaInicio;
        this.tareas = tareas;
    }

}

