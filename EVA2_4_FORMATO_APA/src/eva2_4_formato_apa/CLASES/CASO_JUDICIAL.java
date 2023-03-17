/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_4_formato_apa.CLASES;

/**
 *
 * @author invitado
 */
public class CASO_JUDICIAL extends DOCUMENTO {
    private int no_caso;
    private String tribunal;
    private String relator;
    private String Abogado;

    public int getNo_caso() {
        return no_caso;
    }

    public void setNo_caso(int no_caso) {
        this.no_caso = no_caso;
    }

    public String getTribunal() {
        return tribunal;
    }

    public void setTribunal(String tribunal) {
        this.tribunal = tribunal;
    }

    public String getRelator() {
        return relator;
    }

    public void setRelator(String relator) {
        this.relator = relator;
    }

    public String getAbogado() {
        return Abogado;
    }

    public void setAbogado(String Abogado) {
        this.Abogado = Abogado;
    }
    
    
}
