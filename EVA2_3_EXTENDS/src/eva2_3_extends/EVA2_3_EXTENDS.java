

package eva2_3_extends;


public class EVA2_3_EXTENDS {

   
    public static void main(String[] args) {
        
        Estudiante estu = new Estudiante();
        estu.setNombre("Asbel");
        estu.setApellido("Ortega");
        
        estu.setNocontrol("22550356");
        System.out.println("DATOS DEL ESTUDIANTE");
        System.out.println(estu.getNombre());
        System.out.println(estu.getApellido());
        System.out.println(estu.getEdad());
        System.out.println(estu.getnocontrol());
        
        Docentes doce1 = new Docentes();
        doce1.setPlaza("DFGSDF");
        doce1.setNombre("Ruben");
        doce1.setApellido("Hernandez");
        doce1.setEdad(25);
    }
    
}
