import java.util.Arrays;
import java.util.Scanner;


public class SelectionRecursivo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] entrada = sc.nextLine().split(" ");
        sort(entrada);
        sc.close();
    }

    public static void sort(String[] array){
        sort(array, 0);
    }

    public static void sort(String[] array, int i){
        if (i == array.length - 1){
            return;
        } else {
            int menor = i;
            for(int j = i + 1; j < array.length; j ++){
                if(Integer.parseInt(array[j]) < Integer.parseInt(array[menor])){
                    menor = j;
                }
            }

            String aux = array[i];
            array[i] = array[menor];
            array[menor] = aux;
            System.out.println(Arrays.toString(array));
            sort(array, i + 1);

                

        }
          
            
        }
    }

