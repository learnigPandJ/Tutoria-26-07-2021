public class Autobus extends Vehiculo{
    private int numPlazas;

    public int getNumPlazas(){
        return this.numPlazas;
    }

    public void setNumPlazas(int numPlazas){
        this.numPlazas = numPlazas;
    }

    public String toString(){
        return String.format("Matricula: %s, Modelo: %s, Potencia: %s, NumPlazas: %s",this.matricula,this.modelo,this.potencia,this.numPlazas);
    }
}
