import java.util.Arrays;

public class QuickSelect {
    
    public static void main(String[] args) {
        
        int [] array = {6,7,0,4,3};
         quickSelect(array, 2);
         System.out.println(Arrays.toString(array));


    }

    public static int quickSelect(int[] array, int k) {
		
		if(verifica(array, k)){
			quickSelect(array, k, 0, array.length - 1);

		}
		return 0;
	}

	public static int quickSelect(int[] array, int k, int leftIndex, int rightIndex) {

		if (leftIndex < rightIndex){

			int index_pivot = particion(array, leftIndex, rightIndex);

			if(index_pivot > k - 1){
				quickSelect(array, k, leftIndex, index_pivot - 1);

			} else {
				quickSelect(array, k, index_pivot + 1, rightIndex);
			}
		}
		return array[k - 1];
	}

	public static void mediana(int[] array, int leftIndex, int rightIndex){

		int middle = (leftIndex + rightIndex) / 2;

		if(array[rightIndex] < array[leftIndex]){
			swap(array, rightIndex, leftIndex);
		}

		if(array[middle] < array[leftIndex]){
            swap(array, middle, leftIndex);

		}

		if(array[rightIndex] < array[middle]){
			swap(array, rightIndex, middle);
		}

		swap(array, leftIndex, middle);


	}

	private static void swap(int[] array, int i, int j) {

        int aux = array[i];
        array[i] = array[j];
        array[j] = aux;
    }

    private static int particion(int[] array, int leftIndex, int rightIndex) {
		mediana(array, leftIndex, rightIndex);
        
		int pivot = array[leftIndex];
		int i = leftIndex;

		for(int j = leftIndex + 1; j <= rightIndex; j ++){
           if(array[j] < pivot){
			   i ++;
			   swap(array, i, j);
		   }
		}

		swap(array, leftIndex, i);

		return i;


	}

	

	private static boolean verifica(int[] array, int k) {

		return array.length > 0 && k > 0; 
	}


}
