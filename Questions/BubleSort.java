import java.util.Scanner;

class BubbleSort {

	
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] array = sc.nextLine().split(" ");
        bubbleSort(array);

		sc.close();

	}

	private static void bubbleSort(String[] array) {

		boolean flag = false;
		boolean ordenado = arrayOrdenado(array);

		if (ordenado) {
			System.out.println(imprimeArray(array));
		} else {
			while (!ordenado) {
				flag = false;
				for (int i = 1; i < array.length; i++) {
					if (Integer.parseInt(array[i]) < Integer.parseInt(array[i - 1])) {
						String aux = array[i];
		                array[i] = array[i - 1];
		                array[i - 1] = aux;
						flag = true;
					}
				}
				if (!flag) {
					ordenado = true;
				} else {
					System.out.println(imprimeArray(array));
				}

			}
		}
	}

	private static boolean arrayOrdenado(String[] array) {
		for (int i = 1; i < array.length; i++) {
			if (Integer.parseInt(array[i]) < Integer.parseInt(array[i - 1])) {
				return false;
			}
		}
		return true;
	}
	
	
	
	

	private static String imprimeArray(String[] array) {
		String resultado = "";

		int i;
		for (i = 0; i < array.length - 1; i++) {
			resultado += array[i] + " ";
		}
		resultado += array[array.length - 1] + "";

		return resultado;
	}
	

}



 



