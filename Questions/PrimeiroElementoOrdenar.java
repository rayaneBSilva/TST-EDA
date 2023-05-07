import java.util.Arrays;
import java.util.Scanner;


class PrimeiroElementoOrdenar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] entrada = sc.nextLine().split(" ");
        int primeiro = Integer.parseInt(entrada[0]);
        for (int i = 0; i < entrada.length ; i++){
            if (primeiro > Integer.parseInt(entrada[i])){
                String aux = entrada[i];
                entrada[i] = entrada[i - 1];
                entrada[i - 1] = aux;
            }
            
        }
        System.out.println(Arrays.toString(entrada));

    }


}
