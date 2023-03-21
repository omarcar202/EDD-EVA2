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
public abstract class Ropa extends Producto {
    
private String talla;
private String marca;
private String color;
private String corte;
private String material;

    public Ropa(String talla, String marca, String color, String corte, String material, String nombre, String unidad, double precio) {
        super(nombre, unidad, precio);
        this.talla = talla;
        this.marca = marca;
        this.color = color;
        this.corte = corte;
        this.material = material;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCorte() {
        return corte;
    }

    public void setCorte(String corte) {
        this.corte = corte;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
   
}
