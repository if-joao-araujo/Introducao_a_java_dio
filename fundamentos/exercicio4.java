import java.util.*;
public class exercicio4 {
    public static void main(String [] args){
    var leitor = new Scanner(System.in);
    
    System.out.println("Digite o lado A do retangulo --> ");
    double lado_a = leitor.nextDouble();
    System.out.println("Digite o lado B do retangulo --> ");
    double lado_b = leitor.nextDouble();
    double area = lado_a*lado_b;
    System.out.printf("A area do retangulo igual a --> [: %f :]",area);


    }
}
