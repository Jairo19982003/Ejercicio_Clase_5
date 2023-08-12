package Padre;

public class Empleado {
    private String nombre;

    private double sueldo;

    public Empleado (String nombre, double sueldo){
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String obtenerDetalles(){
        return "nombre: " + this.nombre + ", sueldo: " + this.sueldo + ", direccion: " + this.direccion;
    }

    public String direccion;


    public String getNombre() {

        if (nombre.equals("Homero")) {
           this.nombre= "No Homero";
        }else{
            this.nombre= nombre;
        }
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {

        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString(){
        return "su nombre="+ this.getNombre()+", sueldo="+this.getSueldo();
    }
}
