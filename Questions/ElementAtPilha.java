import java.util.Stack;
import java.util.LinkedList;
import java.util.Scanner;

public class ElementAtPilha {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Stack<Integer> pilha = new Stack<Integer>();
        Stack<Integer> pilhaAuxiliar = new Stack<Integer>();
        LinkedList<Integer> list = new LinkedList<Integer>();
    
        String[] elementos = sc.nextLine().split(" ");
        int posicao = sc.nextInt();

        for(int i = 0; i < elementos.length; i ++){
            pilha.push(Integer.parseInt(elementos[i]));

        }

        while(!pilha.isEmpty()){
            pilhaAuxiliar.push(pilha.pop());
        }

        while(!pilhaAuxiliar.isEmpty()){
            list.add(pilhaAuxiliar.pop());
        }

        if(posicao < 0 || posicao > list.size()){
            System.out.println("indice invalido");
        } else {
            System.out.println(list.get(posicao));
        }

        
        
    }
}
