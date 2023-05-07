import java.util.Scanner;

public class SomaDois {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String[] entrada = sc.nextLine().split(" ");
        int numero = sc.nextInt();
        System.out.println(SomaPar(entrada, numero));
        
        }

        public static String SomaPar(String[] entrada, int n){
            for (int i = 0; i < entrada.length; i ++){
                for(int j = i + 1 ; j < entrada.length; j ++)
                    if (Integer.parseInt(entrada[i]) + (Integer.parseInt(entrada[j])) == n){
                       return entrada[i] + " " + entrada[j];
                }
            }
            return "-1";
        }
    }

