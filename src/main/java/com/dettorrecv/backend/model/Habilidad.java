package com.dettorrecv.backend.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Fernando D'Ettorre
 */

@Getter @Setter

@Entity

public class Habilidad implements Serializable{
    
@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nombre;
    private Long valor;

    public Habilidad () {
    }
    
    public Habilidad(Long id, String nombre, Long valor) {
        this.id = id;
        this.nombre = nombre;
        this.valor = valor;
    }
    
 
    
}
