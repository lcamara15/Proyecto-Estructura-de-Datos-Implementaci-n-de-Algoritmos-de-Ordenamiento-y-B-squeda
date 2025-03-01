import java.util.List;

public class QuickSort {
    public static void ordenar(List<Integer> lista, int inicio, int fin) {
        if (inicio < fin) {
            int indicePivote = particion(lista, inicio, fin);
            ordenar(lista, inicio, indicePivote - 1);
            ordenar(lista, indicePivote + 1, fin);
        }
    }

    private static int particion(List<Integer> lista, int inicio, int fin) {
        int pivote = lista.get(fin);
        int i = inicio - 1;

        for (int j = inicio; j < fin; j++) {
            if (lista.get(j) < pivote) {
                i++;
                int temp = lista.get(i);
                lista.set(i, lista.get(j));
                lista.set(j, temp);
            }
        }

        int temp = lista.get(i + 1);
        lista.set(i + 1, lista.get(fin));
        lista.set(fin, temp);

        return i + 1;
    }

    public static void opcionQuickSort(List<Integer> lista) {
        if (lista.isEmpty()) {
            System.out.println("[ ] No hay datos cargados. Cargue datos primero.");
            return;
        }
        ordenar(lista, 0, lista.size() - 1);
        System.out.println("Lista ordenada con Quick Sort.");
        System.out.println("Lista ordenada: " + lista);
    }
}
