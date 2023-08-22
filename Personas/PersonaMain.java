package practicas.Personas;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class PersonaMain {

    public static void main(String[] args) {

        List <Persona> listaPersonas = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        while(true) {
            System.out.println("1. Agregar usuario");
            System.out.println("2. Mostrar usuarios");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = s.nextInt();
            s.nextLine();

            switch(opcion){
                case 1: System.out.println("Ingrese el nombre: ");
                    String nombre = s.nextLine();
                    System.out.println("Ingrese el apellido: ");
                    String apellido = s.nextLine();
                    System.out.println("Ingrese su edad: ");
                    int edad = s.nextInt();
                    System.out.println("Ingrese su nacionalidad: ");
                    String nacionalidad = s.nextLine();
                    System.out.println("Ingrese su Documento Nacional de Identidad(DNI): ");
                    int DNI = s.nextInt();
                    System.out.println("Ingrese su sexo: ");
                    String sexo = s.nextLine();

                    Persona nuevaPersona = new Persona(nombre, apellido, edad, nacionalidad, DNI, sexo);
                    listaPersonas.add(nuevaPersona);
                    System.out.println("Persona agregada");
                    break;
                case 2:
                    System.out.println("Lista de Personas");
                    for(Persona persona : listaPersonas){
                        System.out.println(persona);
                    }
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    s.close();
                    System.exit(0);
                default: 
                    System.out.println("Opción no valida.");
                    break;

            }
        }
    }
}
