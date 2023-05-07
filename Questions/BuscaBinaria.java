public class BuscaBinaria {

    public static void main(String[] args){

        Integer[] array = {1,4,2,6,8,9};
        int valor = countLess(array, 2);
        System.out.println(valor);
    }
    
    private static int countLess(Integer[] array, int k) {
        return busca(array, k, 0, array.length - 1);
    }

    private static int busca(Integer[] array, int k, int left, int right) {
        if(left > right)
            return 0;
        int numMenores = 0;
        int middle = (left + right) / 2;
        if(array[middle] >= k)
            numMenores = busca(array, k, left, middle - 1);
        else
            numMenores = Math.max(middle + 1, busca(array, k, middle + 1, right));
        return numMenores;
    }
}

