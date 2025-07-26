
package desafio_fundamentos;

import java.util.*;

public class desafio1 {
    public static void main(String [] args ){
    var scanner = new Scanner(System.in);

    System.out.println("Um valor booleano indicando se o visitante possui autorização (true ou false)");
        boolean hasPermission = scanner.nextBoolean(); 
        System.out.println("Um número inteiro representando a idade do visitante" 
                    );// Lê um valor booleano (true ou false)
        int age = scanner.nextInt(); // Lê a idade como inteiro

        // TODO: Verifique condições de acesso
        if (hasPermission == true && age>=18){
          System.out.println("Acesso permitido");
        }  
        else if (hasPermission == false){
          System.out.println("Acesso negado");
        }
        else {
          System.out.println("Idade insuficiente");  
        };



    scanner.close();
}    
}

    

