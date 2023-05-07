import java.util.Stack;
import java.util.Scanner;


class MaxPilha{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Stack<Integer> pilha = new Stack<Integer>();

        String[] elementosPilha = sc.nextLine().split(" ");

        for(int i = 0; i < elementosPilha.length; i ++){
            pilha.push(Integer.parseInt(elementosPilha[i]));
        }


        int maiorPilha = getMax(pilha);
        System.out.println(maiorPilha);
        sc.close();

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