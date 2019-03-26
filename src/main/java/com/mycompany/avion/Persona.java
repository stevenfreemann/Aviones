/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.avion;

import java.util.Date;

/**
 *
 * @author Steven
 */
public class Persona {
    private int cedula;
    private String nombre;
    private Date fechaNacimiento;
    /**
     * constructor Del objeto persona
     * @param cedula
     * @param nombre
     * @param fecha 
     */
    public Persona(int cedula, String nombre, Date fecha) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.fechaNacimiento = fecha;
    }

   

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    

   

    
    
}
