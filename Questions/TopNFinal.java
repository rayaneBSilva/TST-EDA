import java.util.Arrays;
import java.util.Scanner;

class TopNFinal {

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

     
        for(int i = 0; i < array.length; i ++ ){
            int j = i;

            while(j > 0 && array[j] < array[j - 1]){
                swap(array, j, j - 1);
                j--;
            }
            }
            
        }

    private static void swap(int[] array, int i, int j) {

        int aux = array[i];
        array[i] = array[j];
        array[j] = aux;
    }

    private static String imprimeMaiores(int[] array, int quantidade) {

        String saida = "";
        int cont = 0;

        for (int i = array.length - 1 ; i >= 0 ; i--) {
            if(cont != quantidade){
                saida += array[i] + " ";
                cont++;
            }
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
