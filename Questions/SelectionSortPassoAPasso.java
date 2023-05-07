import java.util.Arrays;
import java.util.Scanner;

class SelectionSortPassoAPasso {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] entrada = sc.nextLine().split(" ");
        sort(entrada);
        sc.close();
    }

 
    public static void sort(String[] array){
          for(int i = 0; i < array.length ; i ++){
            int menor = i;
            for(int j = i + 1; j < array.length; j ++){
                if(Integer.parseInt(array[j]) < Integer.parseInt(array[menor])){
                    menor = j;
                }
            }

            String aux = array[i];
            array[i] = array[menor];
            array[menor] = aux;

            if(menor != i){
                System.out.println(Arrays.toString(array));
            }
            

                

        }
    }
          
            
}
    
