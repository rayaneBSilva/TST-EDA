public class VetorCircular {
    public static void main(String args[]){
        VetorCircular v = new VetorCircular();
        int [] numeros =  {4,5,6,1};
        System.out.print(v.vetorCircular(numeros, 6));
    
    }


    public String vetorCircular(int [] array, int quantidadeElementos){
         String resp = " ";
         
        
         while (resp.length() < quantidadeElementos){
            for (int j = 0; j < array.length ; j ++ ){
                resp += array[j];
                
            }
         }
         return resp;   
                        
                }
                     
                         
            }
            
           
            

            
        
            
            
       
        
    



