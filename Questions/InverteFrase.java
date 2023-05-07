import java.util.Stack;
import java.util.Scanner;

class InverteFrase {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String[] frase = sc.nextLine().split(" ");
        Stack<String> pilha = new Stack<String>();

        for(int i = 0; i < frase.length; i ++){

            pilha.push(frase[i]);
        }

        imprimePilhaInvertida(pilha);

       
    }

    private static void imprimePilhaInvertida(Stack<String> pilha) {

  
        while(!pilha.isEmpty()){
            System.out.println(pilha.pop());
        }
    }
}
