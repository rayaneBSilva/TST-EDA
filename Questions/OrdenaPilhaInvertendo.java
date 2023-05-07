import java.util.Stack;
import java.util.Scanner;

public class OrdenaPilhaInvertendo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int capacidade_Pilha = sc.nextInt();

        Stack<Integer> pilha = new Stack<Integer>();
        Stack<Integer> pilhaAux = new Stack<Integer>();

        for (int i = 0; i < capacidade_Pilha; i++) {
            pilha.push(sc.nextInt());
        }

        for(int i = 0; i < capacidade_Pilha; i ++){
            pilhaAux.push(getMax(pilha));
        }



        System.out.println(pilhaAux.toString());


       

    }

    private static int getMax(Stack<Integer> pilha) {

        int maior = 0;

        while(!pilha.isEmpty()){

           int dado = pilha.pop();
            if(dado > maior){
                maior = dado;
            }
        }
        return maior;
    }

   

}
