/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_19_interfaces_figuras;

/**
 *
 * @author invitado
 */
public class EVA2_19_INTERFACES_FIGURAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       //NO SE PUEDEN INSTANCIAR
        //Figuras figura = new Figura();
        Circulo circu = new Circulo(20);
        circu.imprimirDatos();
        Triangulo trian = new Triangulo();
        trian.setAltura(20);
        trian.setBase(20);
        trian.imprimirDatos();
    }
    
}
