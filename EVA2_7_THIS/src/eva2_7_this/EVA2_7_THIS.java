/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_7_this;

/**
 *
 * @author invitado
 */
public class EVA2_7_THIS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       //imprimir();
        //this no se puede usar en un contexto estatico
        
    }
    public void imprimir(){
    //tambien es visible this
    }
}
//this es una referencia a una instancia de la clase
//todos los objetos tienen this
//pueden usar this en cualquier clase
//this solo existe internamente dentro del objeto
class persona{
private String nombre;

    public persona(String nombre) {
        this.nombre = nombre;
        //this.nombre es el atributo de la clase
        //nombre es la variable(parametro)declarado en el metodo
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;      
    }

 public void imprimirDatos(){
     System.out.println("El nombre es:"+ this.nombre);
 }
}