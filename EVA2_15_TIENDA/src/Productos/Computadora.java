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
public class Computadora extends Electronica{
   private double Tama;
   private int memoria;
   private String procesador;
    private String disco;
   
    public Computadora(double Tama, int memoria, String procesador, String disco) {
        this.Tama = 0;
        this.memoria = 0;
        this.procesador = "";
        this.disco = "";
    }

    public Computadora(double Tama, int memoria, String procesador, String disco, String fabricante, String modelo, int garantia, String nombre, String unidad, double precio) {
        super(fabricante, modelo, garantia, nombre, unidad, precio);
        this.Tama = Tama;
        this.memoria = memoria;
        this.procesador = procesador;
        this.disco = disco;
    }

    public double getTama() {
        return Tama;
    }

    public void setTama(double Tama) {
        this.Tama = Tama;
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
      
      //10 unidades--> el precio es del 80%
     if(cant<10)
         return getPrecio() * cant;
     else
         return (getPrecio()*0.8)*cant;
    }
}
