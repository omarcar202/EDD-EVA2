/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_15_tienda;

import Productos.Computadora;
import Productos.Playera;
import eva2_15_tienda.SuperClases.Ropa;

/**
 *
 * @author invitado
 */
public class EVA2_15_TIENDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
            Computadora compu = new Computadora();
            compu.PrecioVenta(11);
        
            Ropa rop;
        rop = new Ropa() {};
            rop.getColor();
            
            Playera player = new Playera();
             
            
    }
    
    
}
//protected es visible en todas las clases 
//funciona como default(a nivel de paquetes es visible)
//y permite a las subclases acceso
//public,default,protected;private 
//restringuir herencia 
//final:constante y limitar herencia 