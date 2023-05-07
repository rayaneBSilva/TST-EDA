import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Scanner;

class InvertePilha {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamanhoPilha = sc.nextInt();

        Stack<Integer> pilha = new Stack<Integer>();
        Queue<Integer> fila = new LinkedList<Integer>();
        Stack<Integer> pilhaInvertida = new Stack<Integer>();

        for (int i = 0; i < tamanhoPilha; i++) {
            pilha.push(sc.nextInt());

        }

        while(!pilha.isEmpty()){
            fila.add(pilha.pop());
        }
        
        while(!fila.isEmpty()){
            pilhaInvertida.push(fila.remove());
        }

        imprimePilhaInvertida(pilhaInvertida);

        sc.close();

    }

    private static void imprimePilhaInvertida(Stack<Integer> pilha) {

        while(!pilha.isEmpty()){
            System.out.println(pilha.pop());
        }
    }

}