package practicas;
import java.util.Scanner;

public class MenuEjemplo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        int OpcionCorrecta;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Has seleccionado la opción 1.");
                    break;
                case 2:
                    System.out.println("Has seleccionado la opción 2.");
                    break;
                case 3:
                    System.out.println("Has seleccionado la opción 3.");
                    break;
                case 4:
                    System.out.println("Has seleccionado la opción 4. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, selecciona una opción válida.");
            }

        } while (opcion != 4);

        scanner.close();
    }

    public static void mostrarMenu() {
        System.out.println("==== Menú ====");
        System.out.println("1. Opción 1");
        System.out.println("2. Opción 2");
        System.out.println("3. Opción 3");
        System.out.println("4. Salir");
        System.out.print("Selecciona una opción: ");
    }
}

