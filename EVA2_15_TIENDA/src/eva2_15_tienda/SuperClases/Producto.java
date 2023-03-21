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
public abstract class Producto {
    private String nombre;
    private String unidad;
   protected double precio;

    public Producto(String nombre, String unidad, double precio) {
        this.nombre = "";
        this.unidad = "";
        this.precio = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
     
    public abstract double PrecioVenta(int cant);
}
