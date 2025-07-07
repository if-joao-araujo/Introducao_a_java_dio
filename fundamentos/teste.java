import java.util.*;

public class teste {
    public static void main(String[] args) {
        System.out.println("Olá Mundo!");
        Scanner leitor = new Scanner(System.in);
        
        int soma = 0;
        int contador = 1;
        while (contador <=4) {
             System.out.println("Digite a nota("+contador+") -> ");
             int numero = leitor.nextInt();
             soma += numero;
             contador ++;
        }
        double media = (double) soma/contador;
        System.out.println("A média é igual a:"+(media));
        leitor.close();

    }
}