/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.avion;

/**
 *
 * @author Steven
 */
public class General {
    
    private String ubicacion;
    private String estado;
    Persona per;
    /**
    * constructor de los asientos general
    * @param estado
    * @param Ubicacion 
    */
    public General(String estado, String Ubicacion) {
        this.estado = estado;
        
        this.ubicacion= Ubicacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Persona getPer() {
        return per;
    }

    public void setPer(Persona per) {
        this.per = per;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    
    
}
