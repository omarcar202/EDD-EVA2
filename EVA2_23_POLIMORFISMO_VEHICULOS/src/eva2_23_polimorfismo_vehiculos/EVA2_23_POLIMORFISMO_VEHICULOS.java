/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_23_polimorfismo_vehiculos;

/**
 *
 * @author invitado
 */
public class EVA2_23_POLIMORFISMO_VEHICULOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Automovil auto = new Automovil("Tesla",0,"X",2020);
   cambiarVelocidad(auto,20);
   Bicicleta bici = new Bicicleta("Montaña","XXX","Harley daividson ",0);
   cambiarVelocidad(50,bici)
   //class objetct--->
           
           }
    
    public static cambiarVelocidad(DatosVehiculo Vehi,int velocidad){
    Vehi.acelerar(Vel);
    Vehi.tablero();
    }
}

interface DatosVehiculo{
public abstract void acelerar(int cambio);
 void tablero();

}
 class Vehiculo{
 protected int velocidad;
 private String marca;

    public Vehiculo(int velocidad, String marca) {
        this.velocidad = 0;
        this.marca = "-------";
    }
//la velocidad se va modificar con acelerar
    public int getVelocidad() {
        return velocidad;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
 
 }

class Automovil extends Vehiculo implements DatosVehiculo{
   
    private String modelo;
    private int año;

    public Automovil(String modelo, int año, int velocidad, String marca) {
        super(velocidad, marca);
        this.modelo = modelo;
        this.año = año;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public void acelerar(int cambio) {
      int cambioVel=velocidad+cambio;
        if(cambioVel>=0)//aceptar solo evlocidades positivas o cero
        velocidad+=cambioVel;//acumulador
    }

    @Override
    public void tablero() {
        System.out.println("velocidad del automovil:"+getVelocidad());
    }
 

}
class Bicicleta extends Vehiculo implements DatosVehiculo{
private String tipo;//montaña,pista,etc
private String rodada;


    public Bicicleta(String tipo, String rodada, int velocidad, String marca) {
        super(velocidad, marca);
        this.tipo = tipo;
        this.rodada = rodada;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRodada() {
        return rodada;
    }

    public void setRodada(String rodada) {
        this.rodada = rodada;
    }
  @Override
    public void acelerar(int cambio) {
      int cambioVel=velocidad+cambio;
        if(cambioVel>=0)//aceptar solo evlocidades positivas o cero
        velocidad+=cambioVel;//acumulador
    }

    @Override
    public void tablero() {
        System.out.println("velocidad del automovil:"+getVelocidad());
    }
 
}