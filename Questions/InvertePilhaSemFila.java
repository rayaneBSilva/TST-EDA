import java.util.Scanner;
import java.util.Stack;

public class InvertePilhaSemFila {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        Stack<Integer> pilha = new Stack<Integer>();
        Stack<Integer> pilhaAuxiliar = new Stack<Integer>();
        int tamanhoDaPilha = sc.nextInt();

        for(int i = 0; i < tamanhoDaPilha; i ++){
            pilha.push(sc.nextInt());
        }

        while(!pilha.isEmpty()){
            pilhaAuxiliar.push(pilha.pop());
        }

        imprimePilhaInvertida(pilhaAuxiliar);

        sc.close();
        


    }

    private static void imprimePilhaInvertida(Stack<Integer> pilha) {

        while(!pilha.isEmpty()){
            System.out.println(pilha.pop());
        }
    }
}
