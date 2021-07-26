/*
Desde aquí se inicia a dar solución al ejercicio de la imagen:
Ejercicio-Herencia-java.jpg
*/
public class PrincipalEjercicio2 {
    
    public static void main(String [] args){
        //Creando un objeto de la clase Empleado --> Superclase
        Empleado empleado1 = new Empleado();
        empleado1.setNombre("José");
        System.out.println(empleado1.getNombre());
        System.out.println(empleado1);//Cuando se imprime el objeto automaticamente se hace el llamado al metodo toString() y se muestra la info del objeto
        
        //Creando un objeto de la clase Operario --> Clase hija de Empleado
        Operario operario1 = new Operario();
        operario1.setNombre("Leonardo");
        System.out.println(operario1.getNombre());
        System.out.println(operario1);//Cuando se imprime el objeto automaticamente se hace el llamado al metodo toString() y se muestra la info del objeto

        //Creando un objeto de la clase Oficial --> Clase hija de Operario
        Oficial oficial1 = new Oficial();
        oficial1.setNombre("Mario");
        System.out.println(oficial1.getNombre());
        System.out.println(oficial1);//Cuando se imprime el objeto automaticamente se hace el llamado al metodo toString() y se muestra la info del objeto
        

        //Creando un objeto de la clase Tecnico --> Clase hija de Operario
        Tecnico tecnico1 = new Tecnico();
        tecnico1.setNombre("Mario");
        System.out.println(tecnico1.getNombre());
        System.out.println(tecnico1);//Cuando se imprime el objeto automaticamente se hace el llamado al metodo toString() y se muestra la info del objeto
        
        
        //Creando un objeto de la clase Directivo --> Clase hija de Empleado
        Directivo directivo1 = new Directivo();
        directivo1.setNombre("Juan");
        System.out.println(directivo1.getNombre());
        System.out.println(directivo1);//Cuando se imprime el objeto automaticamente se hace el llamado al metodo toString() y se muestra la info del objeto
        

        


    }
}
