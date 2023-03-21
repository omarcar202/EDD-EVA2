/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_16_protected;

/**
 *
 * @author invitado
 */
public class EVA2_16_PROTECTED {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        superClase objSuper = new superClase();
        objSuper.dato=100;
    }
    
}

class superClase{

    protected int dato;

class SubClase extends superClase{
public void imprimirDato(){
    System.out.println("El vaos de dato:"+ dato);

}
}
}
