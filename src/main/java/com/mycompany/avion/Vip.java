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
public class Vip {
    private String ubicacion;
    private String estado;
    public Persona per;
    /**
     * Constructor de los asientos VIP
     * @param estado
     * @param Ubicacion 
     */
    public Vip(String estado,String Ubicacion) {
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
