/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_6_herencia_constructores;

/**
 *
 * @author invitado
 */
public class EVA2_6_HERENCIA_CONSTRUCTORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal an = new Animal();
        an.respirar();
        an.comer();
        
        Mamifero ma = new Mamifero();
        ma.comer();
        ma.respirar();
        ma.tenerPelo();
    }
    
}
