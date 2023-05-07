import java.util.Arrays;
import java.util.Scanner;

public class EstatiscaDeOrdem{
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String[] entrada = sc.nextLine().split(" ");
        int[] array = getInteiros(entrada);
        int valor = indiceEstatistica(array, 3);
        int [] valor2 = maioresEstatistica(array, 3);
        System.out.println(Arrays.toString(valor2));
        System.out.println(valor);
            
        }


        private static int[] maioresEstatistica(int[] array, int k){
            int estatistica = indiceEstatistica(array, array.length - k);

            int[] novo_array = new int[k];

            for(int i = 0; i < array.length ; i ++){
                if(array[i] >= estatistica){
                    novo_array[i - (array.length - k)] = array[i];
                }
            }
            return novo_array;
        }


        private static int indiceEstatistica(int[] array, int k) {
          
            for(int i = 0; i < k ; i ++){
                int menor = i;
                for(int j = i + 1; j < array.length ; j ++){
                    if(array[j] < array[menor]){
                        menor = j;
                    }
                }
                int aux = array[i];
                array[i] = array[menor];
                array[menor] = aux;
            }
            return array[k - 1];
        }


    private static int[] getInteiros(String[] entrada) {

        int[] novo_array = new int[entrada.length];

        for(int i = 0; i < entrada.length ; i ++){
            novo_array[i] = Integer.parseInt(entrada[i]);
        }
        return novo_array;
    
    }
}


