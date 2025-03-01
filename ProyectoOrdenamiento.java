import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProyectoOrdenamiento {

    public static void mostrarInformacion(Scanner scanner) {
        // Datos del proyecto
        String universidad = "Universidad Da Vinci de Guatemala";
        String curso = "Estructura de Datos";
        String docente = "Ing. Brandon Chitay";

        System.out.print("¡Bienvenido (a)! Por favor, ingrese su nombre: ");
        String estudiante = scanner.nextLine();

        // Listas de tareas completadas y pendientes
        List<String> puntosHechos = new ArrayList<>();
        List<String> puntosFaltantes = new ArrayList<>();

        // Se inicia el proyecto con algunos puntos completados
        puntosHechos.add("1. Información del Desarrollador");
        puntosHechos.add("2. Menú Principal");

        // Lista de tareas restantes
        puntosFaltantes.add("3. Carga de Datos desde un CSV");
        puntosFaltantes.add("4. Algoritmo de Ordenamiento - Bubble Sort");
        puntosFaltantes.add("5. Algoritmo de Ordenamiento - Enhanced Bubble Sort");
        puntosFaltantes.add("6. Algoritmo de Ordenamiento - Quick Sort");
        puntosFaltantes.add("7. Algoritmo de Ordenamiento - Selection Sort");
        puntosFaltantes.add("8. Algoritmo de Ordenamiento - Merge Sort");
        puntosFaltantes.add("9. Algoritmo de Búsqueda - Binary Search");
        puntosFaltantes.add("10. Presentación Final en YouTube");

        // Mostrar la información en consola
        System.out.println("\n========================================");
        System.out.println(universidad);
        System.out.println(curso);
        System.out.println(docente + "\n");
        System.out.println("Nombre del estudiante: " + estudiante + "\n");

        System.out.println("PUNTOS HECHOS:");
        for (String punto : puntosHechos) {
            System.out.println("[X] " + punto); 
        }

        System.out.println("\nPUNTOS FALTANTES:");
        for (String punto : puntosFaltantes) {
            System.out.println("[ ] " + punto); 
        }

        System.out.println("========================================");

        System.out.println("Presione Enter para continuar...");
        scanner.nextLine();

        // Llamar al menú principal
        mostrarMenu(scanner);
    }

    public static void mostrarMenu(Scanner scanner) {
        List<Integer> listaDatos = new ArrayList<>();
        int opcion;

        do {
            System.out.println("\n========== MENÚ PRINCIPAL ==========");
            System.out.println("1. Cargar datos desde un archivo CSV");
            System.out.println("2. Ordenar datos usando Bubble Sort");
            System.out.println("3. Ordenar datos usando Enhanced Bubble Sort");
            System.out.println("4. Ordenar datos usando Quick Sort");
            System.out.println("5. Ordenar datos usando Selection Sort");
            System.out.println("6. Ordenar datos usando Merge Sort");
            System.out.println("7. Buscar un número con Binary Search");
            System.out.println("8. Mostrar datos cargados");
            System.out.println("9. Salir");
            System.out.print("Ingrese una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.println("Opción seleccionada: Cargar datos desde un CSV...");
                    CargaDatosCSV.opcionCargarDatos(scanner, listaDatos);
                    break;
                case 2:
                    System.out.println("Opción seleccionada: Bubble Sort...");
                    BubbleSort.opcionBubbleSort(listaDatos);
                    break;
                case 3:
                    System.out.println("Opción seleccionada: Enhanced Bubble Sort...");
                    EnhancedBubbleSort.opcionEnhancedBubbleSort(listaDatos);
                    break;
                case 4:
                    System.out.println("Opción seleccionada: Quick Sort...");
                    QuickSort.opcionQuickSort(listaDatos);
                    break;
                case 5:
                    System.out.println("Opción seleccionada: Selection Sort...");
                    SelectionSort.opcionSelectionSort(listaDatos);
                    break;
                case 6:
                    System.out.println("Opción seleccionada: Merge Sort...");
                    MergeSort.opcionMergeSort(listaDatos);
                    break;
                case 7:
                    System.out.println("Opción seleccionada: Binary Search...");
                    BinarySearch.opcionBinarySearch(listaDatos, scanner); 
                    break;
                case 8:
                    System.out.println("Datos actualmente cargados:");
                    if (listaDatos.isEmpty()) {
                        System.out.println("No hay datos cargados.");
                    } else {
                        System.out.println(listaDatos);
                    }
                    break;
                case 9:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 9);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        mostrarInformacion(scanner);
        scanner.close(); // Cerrar el scanner correctamente
    }
} 

    
