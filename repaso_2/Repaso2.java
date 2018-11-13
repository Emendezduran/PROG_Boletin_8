package repaso_2;

import java.util.Scanner;

/**
 *
 * @author emendezduran
 */
public class Repaso2 {

    public static void main(String[] args) {

        System.out.println("Teclea 5 numeros");

        Scanner scan1 = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            int variable1 = scan1.nextInt();
            System.out.println(variable1);
        }

    }
}
