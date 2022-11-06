package edu.nivel.basico;

import java.util.Scanner;

public class SomaNumero {

    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        // TODO: Imprima o somatório de N (utilize o método "somatorio").

        int N;

        N = numero.nextInt();

        System.out.println(somatorio(N));

    }

    /**
     * Método útil que calcula o somatório de um número usando recursividade.
     */
    static int somatorio(int numero) {
        if (numero == 0) {
            return 0;
        } else {
            return numero + somatorio(numero - 1);
        }

    }
}