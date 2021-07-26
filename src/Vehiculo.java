public class Vehiculo {
    // Modificadores de acceso: public, private, protected
    protected String matricula;
    protected String modelo;
    protected float potencia;

    public String getMatricula(){
        return this.matricula;
    }

    public void  setMatricula(String matricula){
        this.matricula = matricula;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public float getPotencia(){
        return this.potencia;
    }

    public void  setPotencia(float potencia){
        this.potencia = potencia;
    }
}
