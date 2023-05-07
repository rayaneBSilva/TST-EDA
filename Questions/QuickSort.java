import java.util.Arrays;


public class QuickSort {
    public static void main(String[] args) {
        int [] array = new int[]{3,10,4,2,14,0,7,1};
        quickSort(array, 0, array.length - 1);
        printSort(array);
    }

    private static void quickSort(int[] array, int leftIndex, int rightIndex) {
      
        if (leftIndex >= rightIndex) return;

        int middle = (leftIndex + rightIndex) / 2;
        swap(array, middle, rightIndex); 
        int pivot = array[rightIndex];
        int count = leftIndex;

        for(int j = leftIndex; j < rightIndex ; j++){
            if(array[j] <= pivot){
                swap(array, j, count);
                count++;
                
            }
        }
        swap(array, rightIndex, count);
        quickSort(array, leftIndex, count - 1);
        quickSort(array, count + 1, rightIndex);
    }

    private static void swap(int[] array, int i, int j) {
        int aux = array[i];
        array[i] = array[j];
        array[j] = aux;
    }
  
    private static void printSort(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
