import java.util.Arrays;

public class TenarySort {

    public static void main(String[] args){

        int [] array = {1,0,2,0,0,0,2,0,1};
        sort(array);
        System.out.println(Arrays.toString(array));
    }


    public static void sort(int[] ternaryArray) {

		int leftIndex = 0;
		int rightIndex = ternaryArray.length - 1;

	

			int cont = 0;
			int maximo = leftIndex;
			int minimo = leftIndex;
			int medio = leftIndex;

			int i = 0;
			while (cont < 2) {
				if (ternaryArray[i] > ternaryArray[maximo]) {
					if (cont == 1)
						medio = maximo;
					else
						maximo = i;
					
					cont++;

				} else if (ternaryArray[i] < ternaryArray[minimo]) {
					if (cont == 1)
						medio = minimo;
					else
						minimo = i;
					
					cont++;
				}
				i++;
			}

			swap(ternaryArray, medio, leftIndex);
			
			int index = leftIndex;

			int pivotIndex = leftIndex;
			int pivotValue = ternaryArray[pivotIndex];

			while (index <= rightIndex) {

				if (ternaryArray[index] < (pivotValue)) {
					swap(ternaryArray, index, leftIndex);
					leftIndex++;
					index++;
				} else if (pivotValue < ternaryArray[index]) {
					swap(ternaryArray, index, rightIndex);
					rightIndex--;
				} else {
					index++;
				}
			}
		}


    private static void swap(int[] array, int i, int j) {

        int aux = array[i];
        array[i] = array[j];
        array[j] = aux;
    }
}
	
		

	
