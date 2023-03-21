/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_15_tienda.SuperClases;

/**
 *
 * @author invitado
 */
public abstract class Electronica extends Producto {
    
    
    private String fabricante;
     private String modelo;
      private int garantia;

    public Electronica(String fabricante, String modelo, int garantia) {
        super(fabricante, modelo, garantia);
        this.fabricante = "";
        this.modelo ="";
        this.garantia = 0;
    }
    

    public Electronica(String fabricante, String modelo, int garantia, String nombre, String unidad, double precio) {
        super(nombre, unidad, precio);
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.garantia = garantia;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }
      
    
      
}
