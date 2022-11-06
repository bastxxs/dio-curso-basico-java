package edu.nivel.basico;

import java.text.BreakIterator;
import java.util.Scanner;

public class NumerosIguais {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a;
        int b;

        System.out.println("Digite o primeiro número");
        a = sc.nextInt();

        System.out.println("Digite o segundo número");
        b = sc.nextInt();

        if (a == b) {

            System.out.println("Sao iguais!");

        } else {

            System.out.println("Nao sao iguais!");

        }

    }
}