package repaso_5;

import java.util.Scanner;

/**
 *
 * @author emendezduran
 */
public class Repaso5 {

    public static void main(String[] args) {
        
        System.out.println("Teclee el valor del lado");
        Scanner scanlado = new Scanner(System.in);
        float lado = scanlado.nextFloat();
        float area = lado * lado;
        System.out.println("El area del cuadrado es: " + area);
    }
}
