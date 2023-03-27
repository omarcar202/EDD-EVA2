/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_21_polimorfismo;

/**
 *
 * @author invitado
 */
public class EVA2_21_POLIMORFISMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante estu = new Estudiante("omar","carrillo",19,"22550285");
           estu.imprimirDatos();
        Docente docente = new Docente();
        docente.setNombre("martina");
        docente.setApellido("chavez");
        docente.setPlaza("tiempo completo");
        docente.setEdad(22);
        docente.imprimirDatos();
        //puedo tratar a los objwtoa sw las subclase
        //como objetos de la superclase
        //al reves no se puede
        Persona perso = estu;
       //estoy generalizando(simplificando)
        Persona perso2 = docente;
        Persona perso3 = new Persona();
        //Es imposible convertir una persona en un estudiante 
        //no podemos agregar cosas,simplemente ocultamos
        
        //Estudiante estudiante =perso3;
    }
    
}
