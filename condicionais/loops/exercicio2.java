// Calcular imc Classificação do IMC:
//Abaixo do peso: IMC menor que 18,5.
//Peso normal: IMC entre 18,5 e 24,9.
//Sobrepeso: IMC entre 25 e 29,9.
//Obesidade: IMC igual ou superior a 30. 
import java.util.*;

public class exercicio2 {
    public static void main(String [] args){
    
    var leitor = new Scanner(System.in);

    System.out.println("Digite sua altura: ");
    double altura = leitor.nextDouble();
    System.err.println("Digite seu peso: ");
    double peso = leitor.nextDouble();

    double imc = (altura*altura)/peso;
   
    if (imc <= 18.5){
        System.err.printf("Seu IMC é de  (%f), então você está abaixo do peso",imc);     
    }
    else if (imc >= 18.5 || imc <= 24.9){
        System.err.printf("Seu IMC é de  (%f), então você está no peso ideal ",imc);
    }
     else if (imc <=29.9){
        System.err.printf("Seu IMC é de  (%f), então você é gordo ",imc);
     }
     else{
        System.err.printf("Seu IMC é de  (%f), então você é um planeta ",imc);

     };
     leitor.close();
    
    }
    
}


   

