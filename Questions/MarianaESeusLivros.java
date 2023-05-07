import java.util.Scanner;


class MarianaESeusLivros {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] entrada = sc.nextLine().split(",");

        for(int i = 0; i < entrada.length ; i ++){
            int j = i;
            while(j > 0 && entrada[j].compareTo(entrada[j - 1]) < 0){
                String aux = entrada[j];
                entrada[j] = entrada[j - 1];
                entrada[j - 1] = aux;
                j --;
                
            }
            System.out.println(imprimeArray(entrada));
        }


    }

    private static String imprimeArray(String[] entrada){
        String resp = "";

        for(int i = 0; i < entrada.length - 1; i ++){
            resp += entrada[i] + ", ";
        }
        resp += entrada[entrada.length - 1];
        return resp;


    }
}
