package edu.nivel.basico;

import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        int A, N;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero");

        A = input.nextInt();

        System.out.println("Digite o tamanho do limite");

        N = input.nextInt();

        int M = N / A;

        int soma = M * (M + 1) / 2;

        int resultado = A * sum;

        System.out.println("Soma dos multiplos de " + A +
                " até " + N + " = " + resultado);

    }
}
