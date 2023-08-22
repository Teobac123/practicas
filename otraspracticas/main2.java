package practicas;
import java.util.Scanner;
import java.util.Stack;

public class main2
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una oración con paréntesis: ");
        String oracion = scanner.nextLine();

        if (verificarBalanceoParentesis(oracion)) {
            System.out.println("Los paréntesis están balanceados en la oración.");
        } else {
            System.out.println("Los paréntesis NO están balanceados en la oración.");
        }

        scanner.close();
    }

    public static boolean verificarBalanceoParentesis(String oracion) {
        Stack<Character> pila = new Stack<>();

        for (int i = 0; i < oracion.length(); i++) {
            char caracter = oracion.charAt(i);

            if (caracter == '(') {
                pila.push(caracter);
            } else if (caracter == ')') {
                if (pila.isEmpty()) {
                    return false; // Hay un paréntesis de cierre sin su correspondiente de apertura
                }
                pila.pop(); // Se encontró un paréntesis de cierre que corresponde a uno de apertura
            }
        }

        return pila.isEmpty(); // Si la pila está vacía, los paréntesis están balanceados
    }
}


