public class Taxi extends Vehiculo{
    private int numLicencia;

    public int getNumLicencia(){
        return this.numLicencia;
    }

    public void setNumLicencia(int numLicencia){
        this.numLicencia = numLicencia;
    }

    public String toString(){
        return String.format("Matricula: %s, Modelo: %s, Potencia: %s, NumLicencia: %s",this.matricula,this.modelo,this.potencia,this.numLicencia);
    }
}
