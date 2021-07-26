public class App {
    public static void main(String[] args) throws Exception {
        Taxi taxi1 = new Taxi();
        Autobus autobus1 = new Autobus();

        taxi1.setModelo("2020");
        taxi1.setNumLicencia(1234135);

        autobus1.setNumPlazas(30);
        autobus1.setModelo("2021");

        System.out.println(taxi1.toString());
        System.out.println(autobus1.toString());
        System.out.println("Modelo: "+taxi1.getModelo()+" NumLicencia: "+taxi1.getNumLicencia());
    }
}
