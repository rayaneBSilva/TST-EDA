import java.util.Arrays;

public class BubbleSortSimples {
    public static void main(String[] args){
            int[] array = {5,4,0,2,1,6,7};
            for(int i = 0; i< array.length; i++){
                for(int j = 0; j < array.length -1 ; j++){
                    if(array[j] > array[j + 1]){
                        int aux = array[j];
                        array[j] = array[j+1];
                        array[j+1] = aux;
                    }
                    
                }
            }
            System.out.println(Arrays.toString(array));
         }

        
    }
