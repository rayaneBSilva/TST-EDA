import java.util.Arrays;

public class BubbleBidimensional {
    
    public static void main(String[] args ){
        int [] array = {1,6,7,9,0};
        bubble(array);
        System.out.println(Arrays.toString(array));
    }

    public static void bubble(int [] array){

        for(int i = 0; i < array.length - 1; i ++){
            if (array[i] > array[i + 1]){
                int aux = array[i];
                array[i] = array[i + 1];
                array[i + 1] = aux;
            }

            for(int j = array.length - 1; j > 0; j --){
                if(array[j] < array[j - 1]){
                    int aux = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = aux;
                }
            }
        }
    }
}
