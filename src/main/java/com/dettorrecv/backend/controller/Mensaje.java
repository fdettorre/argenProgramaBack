/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dettorrecv.backend.controller;

/**
 *
 * @author Fernando D'Ettorre
 */
public class Mensaje {
      private String msn="";

    public Mensaje() {
    }

    public Mensaje(String msn) {
        this.msn = msn;
    }

    public String getMsn() {
        return this.msn;
    }

    public void setMsn(String msn) {
        this.msn = msn;
    }  
}
