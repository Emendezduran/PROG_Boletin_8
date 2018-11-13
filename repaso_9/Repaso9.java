package repaso_9;

import java.util.Scanner;

/**
 *
 * @author emendezduran
 */
public class Repaso9 {
    
    public static void main(String[] args) {
        
        System.out.println("Teclee numeros");
        Scanner scan1 = new Scanner(System.in);
        float numero = 0;
        
        do{    
        numero = numero + scan1.nextFloat();   
            System.out.println(numero);
        } while (numero<100);
        
    }
    
}
