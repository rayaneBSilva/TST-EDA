import java.util.Arrays;
import java.util.Scanner;

public class TopN {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] array = getInteiros(sc);
        int quantidade = sc.nextInt();
        Sort(array);
        String saida = imprimeMaiores(array, quantidade);
        System.out.println(saida.trim());
        sc.close();
    }

    private static void Sort(int[] array) {

        for (int i = 0; i < array.length; i++) {

            array[i] =- array[i];
        }

        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {

            array[i] =- array[i];
        }
    }

    private static String imprimeMaiores(int[] array, int quantidade) {

        String saida = "";

        for (int i = 0; i < quantidade; i++) {
            saida += array[i] + " ";

        }

        return saida;
    }

    private static int[] getInteiros(Scanner sc) {

        String[] entrada = sc.nextLine().split(" ");
        int[] novo_Array = new int[entrada.length];

        for (int i = 0; i < entrada.length; i++) {

            novo_Array[i] = Integer.parseInt(entrada[i]);
        }
        return novo_Array;
    }
}
