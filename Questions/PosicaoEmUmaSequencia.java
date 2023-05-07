import java.util.Scanner;

public class PosicaoEmUmaSequencia {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        String[] entrada = sc.nextLine().split(" ");
        System.out.println(findIndex(entrada,numero));


    }


        public static int findIndex(String[] entrada, int n){
            for(int i = 0; i < entrada.length; i ++){
                if((Integer.parseInt(entrada[i])) == n){

                    return i;
                 }
           

            }

            return 0;
        }

      

    


}
