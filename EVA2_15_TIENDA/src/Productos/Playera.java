/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Productos;

import eva2_15_tienda.SuperClases.Ropa;

/**
 *
 * @author invitado
 */
public class Playera extends Ropa {
     
    private String talla;
    private String tipo;

    public Playera(String talla, String marca, String color, String corte, String material, String nombre, String unidad, double precio) {
        super(talla, marca, color, corte, material, nombre, unidad, precio);
    }
 
    public double Precioventa (int cant,String talla, String tipo){
           
            this.talla = talla;
            this.tipo = tipo;
        return 0;
        }

        public String getTalla() {
            return talla;
        }

        public void setTalla(String talla) {
            this.talla = talla;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

    @Override
    public double PrecioVenta(int cant) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    }
      


