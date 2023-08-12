import HIjo.ScrumMaster;
import Padre.Empleado;

public class Main {

    public static void imprime(Empleado emple){
        System.out.println("objetos.obtenerDetalles() = " + emple.obtenerDetalles());
    }
    public static void main(String[] args) {
       /* Empleado em = new Empleado("juan", 2165);
       *//* em.direccion = "Calle 1";
          System.out.println("Nombre = " + em.getNombre());*//*

    */



        ScrumMaster sm = new ScrumMaster("Homero", 2165, "Sistemas");
        //System.out.println(sm.obtenerDetalles());
        imprime(sm);

    }

    public static void determinarTipo(Empleado emple){
        if (emple instanceof ScrumMaster) {
            System.out.println("Esto viene de ScrumMaster");
        }else if(emple instanceof Empleado){
            System.out.println("Es de tipo Empleado");
        }else if(emple instanceof Object){
            System.out.println("Es de tipo Object");
        }
    }


}