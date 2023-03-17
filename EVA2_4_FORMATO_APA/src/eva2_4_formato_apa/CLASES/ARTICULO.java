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
public class ARTICULO extends DOCUMENTO {
    private String traductor;
    private String Revista;
    private String Paginas;

    public String getTraductor() {
        return traductor;
    }

    public void setTraductor(String traductor) {
        this.traductor = traductor;
    }

    public String getRevista() {
        return Revista;
    }

    public void setRevista(String Revista) {
        this.Revista = Revista;
    }

    public String getPaginas() {
        return Paginas;
    }

    public void setPaginas(String Paginas) {
        this.Paginas = Paginas;
    }
    
    
    
}
