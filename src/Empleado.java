public class Empleado {
    protected String nombre;

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String toString(){
        return "Empleado " + this.nombre;
        //return String.format("Empleado: %s",this.nombre);
    }
}
