/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.avion;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Steven
 */
public class Avion {
    /**
     * Lista de de los asientos
     */
    List <Vip> vip = new ArrayList<>();;
    List <General> general = new ArrayList<>(); ;

   
    public List<Vip> getVip() {
        return vip;
    }

    public void setVip(List<Vip> vip) {
        this.vip = vip;
    }

    public List<General> getGeneral() {
        return general;
    }

    public void setGeneral(List<General> general) {
        this.general = general;
    }

    
    
}
