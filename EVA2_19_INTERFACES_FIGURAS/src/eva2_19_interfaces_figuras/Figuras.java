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
//no se puden instanciar las interfaces 
//son como un contrato: estoy obligado a implementar
//solo metodos abstractos y constantes
public interface Figuras {
    public abstract double calcularArea();
    double calcularPeri();
}
