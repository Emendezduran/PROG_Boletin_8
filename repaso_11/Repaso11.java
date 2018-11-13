package repaso_11;

import java.util.Scanner;

/**
 *
 * @author emendezduran
 */
public class Repaso11 {

    public static void main(String[] args) {
        
         Scanner scan1 = new Scanner(System.in);
         
         for(int a=0 ; a<3 ; a++){
         System.out.println("Teclea sucesivamente la nota de cada Modulo");
         float nota = 0;
                  
         for(int i=0; i<6; i++){
         nota = nota + scan1.nextFloat();
         }
         float media = nota/6;
         System.out.println("Nota Media:" + media);
         }
    }
}
