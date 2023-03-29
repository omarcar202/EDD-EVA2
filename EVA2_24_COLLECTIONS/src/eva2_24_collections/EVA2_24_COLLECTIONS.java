/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_24_collections;

/**
 *
 * @author invitado
 */
public class EVA2_24_COLLECTIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    //COLLECTIONS-->CONTENEDORES
        ArrayList miArreglo=new ArrayList();
        miArreglo.add(new persona());
         miArreglo.add(new perro());
          miArreglo.add(new automovil());
          
          ArrayList<Interger> miArreglo2= new ArrayList<Interger>();
          miArreglo2.add(100);
           miArreglo2.add(200);
            miArreglo2.add(300);
             miArreglo2.add(400);
                  System.out.println(miArreglo2);
    }
    class persona{}
    class automovil{}
    class perro{}
}
