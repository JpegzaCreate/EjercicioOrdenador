/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceep.test;

import com.ceep.dominio.Computadora;
import com.ceep.dominio.Monitor;
import com.ceep.dominio.Orden;
import com.ceep.dominio.Raton;
import com.ceep.dominio.Teclado;


public class testComputadora {
    public static void main(String[] args) {
        
        Monitor m1 = new Monitor("LG-Curve",21.5);
        Monitor m2 = new Monitor("Samsung-led-2k1", 27.0);
        Monitor m3 = new Monitor("Hp-144hz",19.3);
        
        Raton r1 = new Raton("USB","Netway-raii");
        Raton r2 = new Raton("USB","Rider");
        Raton r3 = new Raton("Inalámrico","hp-mouse");
        
        Teclado t1 = new Teclado ("USB","HP-mecanic");
        Teclado t2 = new Teclado ("Inalábrico","Acer-132");
        Teclado t3 = new Teclado ("USB","Goodnet");
        
        
        Computadora comp1 = new Computadora("Hp-Pavilion-Gmaing",m1,t1,r1);
        Computadora comp2 = new Computadora("Hp-Omen",m2,t2,r2);
        Computadora comp3 = new Computadora("Acer-Epends",m3,t3,r3);
        
        Orden orden1 = new Orden ();
        Orden orden2 = new Orden ();
        Orden orden3 = new Orden ();
        
        
        orden1.agregarComputadora(comp1);
        orden1.agregarComputadora(comp2);
        orden1.mostrarOrden();
        
        /*
        orden2.agregarComputadora(comp1);
        orden2.agregarComputadora(comp3);
        orden2.mostrarOrden();*/
        
        
        
    }
}
