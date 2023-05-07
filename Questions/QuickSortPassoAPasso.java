import java.util.Scanner;

class QuickSortPassoAPasso {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String[] entrada = sc.nextLine().split(" ");
		int[] array = getArrayInteiros(entrada);
		quickSort(array);
		sc.close();
	}

	private static void quickSort(int[] array) {
		quickSort(array, 0, array.length - 1);
	}

	private static void quickSort(int[] array, int leftIndex, int rightIndex) {
		if (leftIndex < rightIndex) {
			int index_pivot = partition(array, leftIndex, rightIndex);
			quickSort(array, leftIndex, index_pivot - 1);
			quickSort(array, index_pivot + 1, rightIndex);
		}
	}

	private static int partition(int[] array, int leftIndex, int rightIndex) {
		int pivot = array[leftIndex];
		int i = leftIndex;

		for (int j = leftIndex + 1; j <= rightIndex; j++) {
			if (array[j] < pivot) {
				i++;
				int aux = array[i];
                array[i] = array[j];
                array[j] = aux;
			}
		}
		int aux = array[leftIndex];
        array[leftIndex] = array[i];
        array[i] = aux;
		imprimeArray(array);
		return i;
	}



	private static int[] getArrayInteiros(String[] entrada) {
		int[] array = new int[entrada.length];
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(entrada[i]);
		}
		return array;
	}

	private static void imprimeArray(int[] array) {
		String resp = "";
		for (int i = 0; i < array.length - 1; i++) {
			resp += array[i] + " ";
		}
		resp += array[array.length - 1] + "";
		System.out.println(resp);
	}

}