import java.util.Arrays;
import java.util.Scanner;


class UltimoElementoOrdenar{
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        String[] entrada = sc.nextLine().split(" ");
        for (int i = 0; i < entrada.length ; i ++){
            if (Integer.parseInt(entrada[entrada.length - 1]) < Integer.parseInt(entrada[i])){
                String aux = entrada[i];
                entrada[i] = entrada[entrada.length -1];
                entrada[entrada.length - 1] = aux;
            }
        }
        System.out.println(Arrays.toString(entrada));
        }
   
    }
   
