package com.dettorrecv.backend.model;

import java.io.Serializable;
import java.util.ArrayList;
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


public class Usuariobackmysql implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String username;
    private String password;
    private String email;
    private boolean eliminado;

public Usuariobackmysql(){
}
    
    public Usuariobackmysql(Long id, String username, String password, String email, boolean eliminado) {
        this.id= id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.eliminado = eliminado;
    }

    public Usuariobackmysql(Long id, String username, String password, String email, boolean eliminado, ArrayList<Object> arrayList) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Usuariobackmysql(String username, String password, String email, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
