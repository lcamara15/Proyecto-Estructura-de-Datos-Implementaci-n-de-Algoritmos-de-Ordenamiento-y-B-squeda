import java.util.List;
import java.util.Scanner;

public class BinarySearch {
    public static int buscar(List<Integer> lista, int objetivo) {
        int inicio = 0;
        int fin = lista.size() - 1;

        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;
            
            if (lista.get(medio) == objetivo) {
                return medio;
            }
            if (lista.get(medio) < objetivo) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        return -1;
    }

    // Modificamos para que reciba el Scanner como parámetro
    public static void opcionBinarySearch(List<Integer> lista, Scanner scanner) {
        if (lista.isEmpty()) {
            System.out.println("No hay datos cargados. Cargue datos primero.");
            return;
        }

        System.out.print("Ingrese el número que desea buscar: ");
        int objetivo = scanner.nextInt();  // Ahora usamos el Scanner recibido como argumento

        int resultado = buscar(lista, objetivo);

        if (resultado == -1) {
            System.out.println("El número no está en la lista.");
        } else {
            System.out.println("El número " + objetivo + " se encuentra en el índice: " + resultado);
        }
    }
}
