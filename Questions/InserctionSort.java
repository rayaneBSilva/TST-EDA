
import java.util.Arrays;

public class InserctionSort {
    public static void main(String args[]){
        int[] v = {7,1,9,12,2,3,10};
        for (int i = 1; i < v.length; i ++){
            int j = i;
            while (j > 0 && v[j] < v[j - 1]){
                int aux = v[j];
                v[j] = v[j - 1];
                v[j - 1] = aux;
            j --;
                
            }
    }

    System.out.print(Arrays.toString(v));
    

    }
}
