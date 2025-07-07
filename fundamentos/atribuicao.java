import java.util.*;
public class atribuicao {  
        public static void main(String[] args){
            var leitor = new Scanner(System.in);
            System.out.println("Quanto é 5 + 5 : ");
            int valor  = leitor.nextInt(); 
            boolean correto = valor == 10;
            System.out.printf("O resultado correto é -> 10, voçê digitou (%s) está certo? -> (%s)",valor,correto );

    }
}
