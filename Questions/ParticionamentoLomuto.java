import java.util.Arrays;
import java.util.Scanner;

class ParticionamentoLomuto {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String[] entrada = sc.nextLine().split(" ");
        int[] array = getInteiros(entrada);
        partition(array);
        System.out.println(Arrays.toString(array));
        sc.close();
        
      

}


private static void partition(int[] array) {
    partition(array, 0, array.length - 1);
    }


private static void partition(int[] array, int leftIndex, int rightIndex) {

    int pivot = array[rightIndex];
    int i  = rightIndex;

    if (array.length == 0){
       return;
    }  else {
        for(int j = rightIndex - 1; j > -1 ; j --){
            if(array[j] > pivot){
                i--;
                swap(array, i, j);
                System.out.println(Arrays.toString(array));
            }
        }
        swap(array, rightIndex, i);
        System.out.println(Arrays.toString(array));

    }

    
}


private static void swap(int[] array, int j, int i) {

    int aux = array[j];
    array[j] = array[i];
    array[i] = aux;
}



private static int[] getInteiros(String[] entrada) {
       int[] array = new int[entrada.length];
       for (int i = 0; i < entrada.length ; i ++){
             array[i] = Integer.parseInt(entrada[i]);
       }
    return array;
    }

}
