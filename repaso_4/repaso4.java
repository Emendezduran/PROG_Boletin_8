package repaso_4;

import java.util.Scanner;

/**
 *
 * @author emendezduran
 */
public class repaso4 {
 
    public static void main(String[] args) {
        
        System.out.println("teclea numeros positivos");
        Scanner scan1 = new Scanner(System.in);
        int variable1;
        
        do{
        variable1 = scan1.nextInt();
        System.out.println(variable1);
        }while (variable1 >=0);    
        
        
    }
}
