/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceep.dominio;

/**
 *
 * @author javip
 */
public class Raton extends DispositivoEntrada {
    
    private int idRaton;
    private int contadorRatones;

    
    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
    }

    
    @Override
    public String toString() {
        return "Raton{" + "idRaton=" + idRaton + ", contadorRatones=" + contadorRatones + '}';
    }
    
    
    
}
