public class Estatistica {
    public static void main(String[] args){

        int[] novo_array = {2,3,4,1};
        int valor = getOrderStatistics(novo_array, 2);

        System.out.println(valor);
        
    }

    public static int getOrderStatistics(int [] array, int k){

        int maximoValue = 0;
        int minimoValue = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[maximoValue])
                maximoValue = i;
            if (array[i] < array[minimoValue])
                minimoValue = i;
        }

            return getOrderStatisticsRec(array, k, 1, minimoValue, maximoValue);
        }

    private static int getOrderStatisticsRec(int[] array, int k, int qtdMinimo, int minimoValue, int maximoValue) {
        
        if (qtdMinimo == k)
			return array[minimoValue];

		if (qtdMinimo == array.length)
			return 0;
		
		int minimo = maximoValue;
			
		for (int i = 0; i < array.length; i++) {
			
			if (array[i] < array[minimo]) {
				if (array[i] > array[minimoValue]){
                    minimo = i;
                }
					
			}
		}
		
		return getOrderStatisticsRec(array, k, qtdMinimo + 1, minimo, maximoValue);

	}
    }

  
