

import java.util.Scanner;

 class PrimeiroNumeroNegativo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String [] entrada = sc.nextLine().split(" ");
        sc.close();

        System.out.println(primeiroNegativo(entrada, 0));
       
        
    }

    private  static String primeiroNegativo (String[] array, int i){
       if (i >= array.length){
            return "-";
       }

       if (Integer.parseInt(array[i]) < 0) {
            return array[i];
       }

       return primeiroNegativo(array, i + 1);
       }
        
        
       

       
    }
        




