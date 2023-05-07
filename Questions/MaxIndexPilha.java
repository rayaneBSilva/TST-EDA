import java.util.Scanner;
import java.util.Stack;

public class MaxIndexPilha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Integer> pilha = new Stack<Integer>();

        String entrada [] = sc.nextLine().split(" ");
        int posicao = sc.nextInt();


        for(int i = 0; i < entrada.length; i ++){

            pilha.push(Integer.parseInt(entrada[i]));
        }

        int max = MaxPilha(pilha, posicao);
        System.out.println(max);
        sc.close();
    }

    private static int MaxPilha(Stack<Integer> pilha, int posicao) {

        int maior = 0;
        int cont = -1;

        while(cont != posicao){
            int dado = pilha.pop();
            if(dado > maior){
                maior = dado;
            }
            cont ++;
            

        }

        return maior;
    }
}
