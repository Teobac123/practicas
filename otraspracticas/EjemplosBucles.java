package practicas.otraspracticas;
public class EjemplosBucles {

    public static void main(String[] args) {
        // Ejemplo de bucle do-while
        int contadorDoWhile = 1;
        System.out.println("Ejemplo de bucle do-while:");
        do {
            System.out.println("Iteración " + contadorDoWhile);
            contadorDoWhile++;
        } while (contadorDoWhile <= 5);

        // Ejemplo de bucle for
        System.out.println("\nEjemplo de bucle for:");
        for (int contadorFor = 1; contadorFor <= 5; contadorFor++) {
            System.out.println("Iteración " + contadorFor);
        }

        // Ejemplo de bucle while
        int contadorWhile = 1;
        System.out.println("\nEjemplo de bucle while:");
        while (contadorWhile <= 5) {
            System.out.println("Iteración " + contadorWhile);
            contadorWhile++;
        }
    }
}
