import java.util.Scanner;
import java.util.Stack;

class Parenteses {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String expressaoMat = sc.nextLine();
        imprimeResultado(expressaoMat);

    }
        public static void imprimeResultado(String expressao){
            if(verificaParenteses(expressao)){
                System.out.println("S");
            } else {
                System.out.println("N");
            }
        }
        
        final static String ABRE = "(";
        final static String FECHA = ")";
    
        public static boolean verificaParenteses (String expressao){
            
            Stack<Character> pilha = new Stack<>();
            char simbolo, topo;
            
            for(int i = 0; i < expressao.length(); i ++){
                simbolo = expressao.charAt(i);
                
                if (ABRE.indexOf(simbolo) > -1){
                    pilha.push(simbolo);
                    
                } else if (FECHA.indexOf(simbolo) > -1){
                    
                    if (pilha.isEmpty()){
                        return false;
                    } else {
                        topo = pilha.pop();
                        
                        if (ABRE.indexOf(topo) != FECHA.indexOf(simbolo)){
                            return false;
                        }
                    }
                }
                
            }
            
            return pilha.isEmpty();
        }
    }
