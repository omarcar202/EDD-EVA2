/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Productos;

import eva2_15_tienda.SuperClases.Electronica;

/**
 *
 * @author invitado
 */
public final  class Computadora extends Electronica{
   private double tamaño;
   private int memoria;
   private String procesador;
    private String disco;
  
    
    public Computadora(double tamaño, int memoria, String procesador, String disco, String fabricante, String modelo, int garantia, String nombre, String unidad, double precio) {
        super(fabricante, modelo, garantia, nombre, unidad, precio);
        this.tamaño = tamaño;
        this.memoria = memoria;
        this.procesador = procesador;
        this.disco = disco;
    }

    public double gettamaño() {
        return tamaño;
    }

    public void settamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getDisco() {
        return disco;
    }

    public void setDisco(String disco) {
        this.disco = disco;
    }
     @Override
    public double PrecioVenta(int cant) {
        //antes de cierta cantidad manejamos precio normal
        //despues de cierta cantidad hay un descuento
      
      //unidades > 10 --> el precio es del 80%
     if(cant<10)
         return precio * cant;
     //le esstas dando el 20% de descuento entonces quedaria un 80% de precio que es el 0.8 por el que estas multiplicando
     else
         return (precio*0.8)*cant;
    }
}
//computadora es una clase final:
//ya no se puede heredar de una clase final
//class laptop extends Computadora{}


