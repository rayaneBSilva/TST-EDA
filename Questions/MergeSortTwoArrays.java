import java.util.Arrays;
import java.util.Scanner;

public class MergeSortTwoArrays {
    
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        String[] entrada = sc.nextLine().split(" ");
        String[] entrada2 = sc.nextLine().split(" ");
        int[] array1 = getInteiros(entrada);
        int[] array2 = getInteiros(entrada2);
        int[] valor = merge(array1, array2);
        System.out.println(Arrays.toString(valor));
    }


    public static int [] merge(int [] array, int [] array2){
            int[] helper = new int[array.length + array2.length];

            int i = 0;
            int j = 0;
            int k = 0;

            while(i < array.length && j < array2.length){
                if(array[i] < array2[j]){
                    helper[k++] = array[i++];
                } else {
                    helper[k++] = array2[j++];
                }
                    
            }

            while( i < array.length){
                helper[k++] = array[i++];
            }

            while(j < array2.length){
                helper[k++] = array2[j++];
            }
            return helper;
            
        }
    

    

    private static int[] getInteiros(String[] entrada) {
        int[] array = new int[entrada.length];
        for(int i = 0; i < entrada.length; i ++){
            array[i] = Integer.parseInt(entrada[i]);

        }
        return array;
    }

   

}
