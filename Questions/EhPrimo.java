import java.util.Scanner;

class EhPrimo {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int numero = sc.nextInt();
       System.out.println(ehPrimo(numero));
}

    private static boolean ehPrimo (int n){
        if (n <= 1){
            return false;
        }

        for (int i = 2; i * i <= n ; i ++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }


}
