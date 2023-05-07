import java.util.ArrayList;
import java.util.List;

public class Merge {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(0);
        lista.add(3);
        lista.add(9);
        lista.add(18);
        lista.add(5);
        lista.add(4);
        lista.add(6);
        lista.add(10);
        ordenar(lista);
        System.out.println(lista.toString());
    }

    public static void ordenar(List<Integer> lista) {
        ordenar(lista, 0, lista.size() - 1);
    }

    private static void ordenar(List<Integer> lista, int inicio, int fim) {
        if (inicio >= fim) return;

        int meio = (inicio + fim) / 2;

        ordenar(lista, inicio, meio);
        ordenar(lista, meio + 1, fim);
        intercalar(lista, inicio, meio, fim);
    }

    private static void intercalar(List<Integer> lista, int inicio, int meio, int fim) {

        int i = inicio;
        int j = meio + 1;

        List<Integer> temp = new ArrayList<>(fim - inicio + 1);

        while (i <= meio && j <= fim) {
            int a = lista.get(i);
            int b = lista.get(j);
            if (a < b) {
                temp.add(a);
                i++;
            } else {
                temp.add(b);
                j++;
            }
        }

        while (i <= meio) {
            temp.add(lista.get(i));
            i++;
        }

        while (j <= fim) {
            temp.add(lista.get(j));
            j++;
        }

        for (int k = 0; k < temp.size(); k++) {
            lista.set(k + inicio, temp.get(k));
        }
    }
}

