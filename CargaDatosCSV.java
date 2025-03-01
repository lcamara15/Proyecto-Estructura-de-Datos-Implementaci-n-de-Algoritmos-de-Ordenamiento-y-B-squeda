import java.io.*;
import java.util.*;

public class CargaDatosCSV {

    public static List<Integer> cargarDesdeCSV(String archivo) {
        List<Integer> lista = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                // Dividir la línea por comas y eliminar espacios
                String[] numeros = linea.split(",");
                for (String num : numeros) {
                    try {
                        lista.add(Integer.parseInt(num.trim())); // Convertir y agregar a la lista
                    } catch (NumberFormatException e) {
                        System.out.println("Dato inválido en el archivo: " + num.trim());
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        
        return lista;
    }

    public static void opcionCargarDatos(Scanner scanner, List<Integer> lista) {
        System.out.print("Ingrese la ruta del archivo CSV: ");
        String archivo = scanner.nextLine();
        
        lista.clear();  // Limpiar la lista antes de cargar nuevos datos
        List<Integer> datosCargados = cargarDesdeCSV(archivo);
        
        if (datosCargados.isEmpty()) {
            System.out.println("No se cargaron datos del archivo.");
        } else {
            lista.addAll(datosCargados);
            System.out.println("Datos cargados correctamente desde " + archivo);
            System.out.println("Datos cargados: " + lista);
        }
    }
}


