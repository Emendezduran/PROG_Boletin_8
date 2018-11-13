package repaso_3;

import java.util.Scanner;

/**
 *
 * @author emendezduran
 */
public class repaso3 {
    
    public static void main(String[] args) {
        
    
    System.out.println("Teclea numeros");
    
    Scanner scan1 = new Scanner(System.in);
    int variable1 = 1;
    
    while (variable1 !=0){
        variable1 = scan1.nextInt();
        System.out.println(variable1);
    }
    
    }
}
