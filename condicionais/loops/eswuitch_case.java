import java.util.*;

public class eswuitch_case {
     public static void main(String [] args){
        var leitor = new Scanner(System.in);
        
        System.out.println("Digite uma opção de 1 a 7 --> ");
        int opcao = leitor.nextInt();

        switch(opcao){
            case 1:
              System.out.println("Segunda feira");
              break;
            case 2:
              System.out.println("terça feira");
                break;
            case 3:
              System.out.println("quarta feira");
                break;
            case 4:      
              System.out.println("quinta feira");
                break;
            case 5:        
              System.out.println("sexta feira");
                break;
            case 6:  
              System.out.println("sabado ");
               break;
            case 7:           
              System.out.println("domingo");
               break;
            default:
            System.out.println("Digite uma opção valida");

            leitor.close();
        }

     }
}
