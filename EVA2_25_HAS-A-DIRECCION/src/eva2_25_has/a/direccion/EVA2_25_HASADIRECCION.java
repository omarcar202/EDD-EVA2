/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_25_has.a.direccion;

/**
 *
 * @author invitado
 */
public class EVA2_25_HASADIRECCION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Personas persona = new Personas();
        persona.setNombre("omar");
        persona.setApellido("carrillo");
        persona.setEdad(19);
        //para asignar la direccion,debemos de crear un objeto de tipo direccion
        Direccion direccion = new Direccion();
        direccion.setCalle("industrias");
        direccion.setEstado("1101");
        direccion.setColonia("complejo industerial chihuahua");
        direccion.setCp("31135");
        direccion.setCiudad("chihuahua");
        direccion.setEstado("chihuahua");
        persona.setDireccion(direccion);
        persona.imprimirDatos();
    }
    
}

class   Direccion {
 private String calle;
 private int numero;
 private String colonia;
 private String cp;
 private String ciudad;
 private String estado;

 public Direccion(){
   this.calle = "-----";
        this.numero = 0;
        this.colonia = "-----";
        this.cp = "-----";
        this.ciudad = "-----";
        this.estado = "-----";
 }
    public Direccion(String calle, int numero, String colonia, String cp, String ciudad, String estado) {
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.cp = cp;
        this.ciudad = ciudad;
        this.estado = estado;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
  void imprimirDatos(){
      System.out.println("Direccion:");
      System.out.println(calle+"#"+numero+","+colonia+"\n c.p."+cp+","+ciudad+","+estado);
  }
}
class Personas {
private String nombre;
private String apellido;
private int edad;
private Direccion direccion;//persona Has a (tienen una )direccion

public Personas(){
        this.nombre = "-----";
        this.apellido ="-----";
        this.edad =0;
        this.direccion = null;//no existe el objeto direccion
}
    public Personas(String nombre, String apellido, int edad, Direccion direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
   public void imprimirDatos(){
       System.out.println("persona:");
       System.out.println(nombre+" "+apellido+" "+edad+"años.");
      if(direccion==null)
           System.out.println("sin direccion.");
      else
          
       direccion.imprimirDatos();
   
   }
}

class Sucursal{
   private String nombreSucursal;
   private Direccion direccion;

}
