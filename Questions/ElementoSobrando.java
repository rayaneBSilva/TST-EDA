import java.util.Scanner;

public class ElementoSobrando {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String array1[] = sc.nextLine().split(" ");
        String array2[] = sc.nextLine().split(" ");
        String elementoSobrando = "";


        boolean status = true;
        for(int i = 0; i < array2.length; i ++){
            for(int j= 0; j < array1.length; j ++){
                if(Integer.parseInt(array2[i]) !=  Integer.parseInt(array1[j])){
                    status = false;
                    elementoSobrando = array2[i];
                }
            }

            if(status = false){
                break;
            }
        }

        System.out.println(elementoSobrando);

       
        
    }
}
