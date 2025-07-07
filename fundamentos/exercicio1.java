import java.util.*;

public class exercicio1 {
    public static void main(String [] args){
       var leitor = new Scanner(System.in);

       System.out.println("Digite seu nome --> ");
       String nome = leitor.nextLine();
       System.out.println("Digite sua idade --> ");
       int idade = leitor.nextInt();

       System.out.printf("Seu nome é --> (%s)\nSua idade é --> (%d)",nome,idade);



    }
    
}

