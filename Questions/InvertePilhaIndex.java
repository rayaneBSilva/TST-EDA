import java.util.Scanner;
import java.util.Stack;

class InvertePilhaIndex {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Stack<Integer> pilha = new Stack<Integer>();
        Stack<Integer> pilhaAux = new Stack<Integer>();
        Stack<Integer> pilhaAuxInvertida = new Stack<Integer>();

        int capacidade_Pilha = sc.nextInt();

        for(int i = 0 ; i < capacidade_Pilha ; i++){
            pilha.push(sc.nextInt());
        }

        int indice = sc.nextInt();
        int cont = -1;

        System.out.println("-");

        while(cont != indice){
            pilhaAux.push(pilha.pop());
            cont ++;
        }

        while(!pilhaAux.isEmpty()){
            pilhaAuxInvertida.push(pilhaAux.pop());
        }

        while(!pilhaAuxInvertida.isEmpty()){
            pilha.push(pilhaAuxInvertida.pop());
        }

        imprimePilhaInvertida(pilha);

    
    }

    private static void imprimePilhaInvertida(Stack<Integer> pilha) {

        while(!pilha.isEmpty()){
            System.out.println(pilha.pop());
        }
    }
}
