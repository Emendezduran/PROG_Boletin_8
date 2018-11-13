package repaso_8;

import java.util.Scanner;

/**
 *
 * @author emendezduran
 */
public class Repaso8 {

    public static void main(String[] args) {

        System.out.println("Teclee el valor del lado");
        Scanner scanlado = new Scanner(System.in);
        float lado;
        do {

            do {
                lado = scanlado.nextFloat();
                if (lado < 0) {
                    System.out.println("Introduce un valor positivo");
                }
            } while (lado < 0);

            float area = lado * lado;
            System.out.println("El area del cuadrado es: " + area);
            System.out.println("Teclee el valor del lado del siguiente cuadrado, para finalizar pulse 0");
        } while (lado != 0);
    }
}
