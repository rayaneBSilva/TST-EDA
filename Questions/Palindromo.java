import java.util.Arrays;
import java.util.Scanner;



public class Palindromo {

    public static void main(String args[]){
        int[] entrada = {1,13,0,4,5};
        Palindromo p = new Palindromo();
        System.out.println(Arrays.toString(p.Palindromos(entrada, 5)));
    }

    public int[] Palindromos(int[] array, int target){
        int[] par = new int[2];
        for (int i = 0; i < array.length ; i ++){
          for (int j = i + 1 ; j < array.length ; j ++){
             if (array[i] + array[j] == target){
                 par[0] = array[i];
                 par[1] = array[j];
                 return par;
            }
        }
     
    }

        return par;
   

    }

}
