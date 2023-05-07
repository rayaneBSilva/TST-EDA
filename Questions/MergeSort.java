import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = getInteger(scan);
        sort(array);
        printSort(array);
       }


    public static void sort(int[] array){
        sort(array, 0, array.length -1);
    }
    
    private static void sort(int[] v, int left, int right) {

        boolean valid = inputValidation(v, left, right);
        System.out.println(valid);
        System.out.println(left);
        System.out.println(right);

        if(valid)
            if (left >= right) return;
            else {
                int middle = (left + right) / 2;
                sort(v, left, middle);
                sort(v, middle + 1, right);
                merge(v, left, middle, right);
            }
    }
    


    private static void merge(int[] v, int left, int middle, int right) {

        int[] helper = new int[v.length];

        for(int i = 0; i < v.length; i++){
            helper[i] = v[i];
        }

        int i = left;
        int j = middle + 1;
        int k = left;

        while (i <= middle && j <= right){
            if(helper[i] <= helper[j])
                v[k++] = helper[i++];
            else
                v[k++] = helper[j++];

        }

        while(i <= middle){
            v[k++] = helper[i++];
        }

        while( j <= right){
            v[k++] = helper[j++];
        }
    }

    private static int[] getInteger(Scanner scan) {

        String[] entrada = scan.nextLine().split(" ");
        int[] array = new int[entrada.length];

        for(int i = 0; i < entrada.length; i++){
            array[i] = Integer.parseInt(entrada[i]);
            
        }
        return array;
    }

    private static void printSort(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    private static boolean inputValidation(int[] v, int left, int right) {
        if (v == null)
            return false;
    
        if (v.length == 0)
            return false;
        if(right >= v.length)
            return false;
        if(left < 0 || right < 0)
            return false;
        
        if(left >= right)
           return false;

        return true;
    }
}
