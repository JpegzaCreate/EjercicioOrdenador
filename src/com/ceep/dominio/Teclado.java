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
public class Teclado extends DispositivoEntrada {
    
    private int teclado;
    private int contadorTeclado;

    public Teclado (String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.teclado = teclado;
        this.contadorTeclado = contadorTeclado;
    }

    @Override
    public String toString() {
        return "Teclado{" + "teclado=" + teclado + ", contadorTeclado=" + contadorTeclado + '}';
    }
    
    
    
}
