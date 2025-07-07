import java.util.*;

public class exercicio5 {
        public static void main(String [] args){
            var leitor = new Scanner(System.in);

            System.out.println("Digite a idade da pessoa A --> ");
            int idade_pessoa_a = leitor.nextInt();
            System.out.println("Digite a idade da pessoa B --> "); 
            int idade_pessoa_b = leitor.nextInt();
            int diferenca = 0;

            if (idade_pessoa_a > idade_pessoa_b) {
                diferenca = idade_pessoa_a - idade_pessoa_b;
            } else{
                diferenca = idade_pessoa_b - idade_pessoa_a;
            }

            System.out.printf("A diferença da pessoa A para a b é de --> %d",diferenca);
    }
}
