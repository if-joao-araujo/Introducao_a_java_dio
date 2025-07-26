// O usuario irá digitar um numero, e eu devo mostrar a tabuada desse numero
import java.util.*;
public class exercicio1{
    public static void main(String [] args){
    
    var leitor = new Scanner(System.in);

    System.err.print("Digite um numero para a tabuada dele ser exibida --> ");
    int numero = leitor.nextInt();
    
    
    for (int contador = 1; contador <= 10;contador+=1){
        int multiplicacao = contador*numero;
        System.err.printf("%s X %s == %s\n",numero,contador,multiplicacao);
    }
    leitor.close();


    }

};