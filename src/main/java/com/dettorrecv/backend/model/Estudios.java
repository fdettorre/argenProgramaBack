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

public class Estudios implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nombre;
    private String titulo;
    private String imagen;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaInicio;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaFin;
    private String promedio;

    public Estudios (){
    }
    
    public Estudios(Long id, String nombre, String titulo, String imagen, Date fechaInicio, Date fechaFin, String promedio) {
        this.id = id;
        this.nombre = nombre;
        this.titulo = titulo;
        this.imagen = imagen;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.promedio = promedio;
    }



}
