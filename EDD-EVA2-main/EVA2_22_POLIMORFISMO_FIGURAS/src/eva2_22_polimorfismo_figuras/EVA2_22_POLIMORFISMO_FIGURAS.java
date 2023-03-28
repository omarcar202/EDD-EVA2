/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_22_polimorfismo_figuras;

import java.util.Scanner;

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
  Circulo[] circulos = new Circulo[10];
//un arreglo en java va de la posicion a la N-1
//N es la cantidad de elementos arreglados 
//for(int i =0; i<circulos.legth;i++){
 //circulos[i]=new Circulo();//creamos cada uno de los objetos
 //circulos[i].imprimirDatos();
//}
  Figuras figuras=new Figuras();
Scanner input = new Scanner(System.in);
        System.out.println("cuantas figuras quieres captar");
        int cant = input.nextInt
    figuras=new Figuras[cant];
    for(int i =0; i<cant;i++){
        System.out.println("capturar el tipo de figura:");
        System.out.println("1.circulo,2.triangulo");
        int figu=input.nextInt();
        if(figuras[i]instanceof Circulo){//circulo
           // System.out.println("circulo:");
        Circulo circu=(Circulo)figuras[i];//casting
            circu.imprimirDatos();
        }else{//triangulo
            // System.out.println("Triangulo:");
        Triangulo trian=(Triangulo)figuras[i];//casting
       trian.imprimirDatos();
        }
    }
    //imprimir los resultados 
    for(int i =0; i<figuras.leght;i++){
        System.out.println("Figuras:"+i;
        System.out.println("Area:"+figuras[i].calcularArea());
        System.out.println("perimetro:"+figuras[i].calcularPerimetro());
    }
    }
            
}
