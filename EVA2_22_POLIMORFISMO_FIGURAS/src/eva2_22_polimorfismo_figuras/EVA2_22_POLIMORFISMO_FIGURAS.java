/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_22_polimorfismo_figuras;

/**
 *
 * @author invitado
 */
public class EVA2_22_POLIMORFISMO_FIGURAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Circulo circulo= new Circulo(5);
    circulo.imprimirDatos();
    Figuras figu= circulo;
        System.out.println("Area:"+figu.calcularArea());
    }
    
}
