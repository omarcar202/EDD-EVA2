

package eva2_8_super;


public class EVA2_8_SUPER {

  
    public static void main(String[] args) {
        
        Animal animal=new Animal("plop",10);
        Mamifero mamifero = new Mamifero("negro","plop",10);
        mamifero.getColorPelo();
    
                }
    
    
}
class Animal{
    private String nombre;
    private int peso;
public Animal(){
    System.out.println("Está vivo");
    }

    public Animal(String nombre, int peso) {
        this.nombre = nombre;
        this.peso = peso;
        System.out.println("Está vivo constructor 2");
    }

public void respirar(){
    System.out.println("Estoy respirando");
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

}
class Mamifero extends Animal{
    private String colorPelo;
 public Mamifero(){
     //super-->
     //lo primero a llamar en un constructor es llamar al constructor de la superclase
     //En nuestro caso está llamando a animal
     /*/Si trabajas con herencia lo primero es llamar al constructor dela superclase, por tanto la primera instrucción
    tiene que ser super
     /*/
     super();//lamada al constructor default
     System.out.println("mamifero");
 }

    public Mamifero(String colorPelo, String nombre, int peso) {
        super(nombre, peso);//llamada al constructor super. Este siempre tiene que ser llamado
        //si tenemos herencia y hay constructores, siempre tenemos que tener super
        this.colorPelo = colorPelo;
        System.out.println("Pelo color........."); //mamifero constructor 2
        System.out.println("mamifero constructor 2");
    }
    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
        
        //la ultima herencia hereda todo lo de las pasadas, entonces es como una cadena
        //super hace referencia en superclase
        //this hace referencia a una sola clase
    }
 
}


 