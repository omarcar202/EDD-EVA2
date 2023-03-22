/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_18_interfaces_herencia;

/**
 *
 * @author invitado
 */
public class EVA2_18_INTERFACES_HERENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
interface intA{
 public abstract void A();
}
interface intB{
  void B();//implementacion esta incluido public abstract
}
interface intC extends intA,intB{
 public abstract void C();
}
class Pueba implements intC{

    @Override
    public void C() {
        
    }

    @Override
    public void A() {
        
    }
    @Override
    public void B() {
        
    }

}