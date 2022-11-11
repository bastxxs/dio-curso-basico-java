package edu.nivel.basico;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);

        int num;

        System.out.println("Digite um numero");

        num = number.nextInt();

        retornaFizzBuzz(num);

    }

    public static void retornaFizzBuzz(int num) {

        boolean fizzBuzz = num % 3 == 0 && num % 5 == 0;

        boolean fizz = num % 3 == 0;

        boolean buzz = num % 5 == 0;

        if (fizzBuzz) {

            System.out.println("FizzBuzz");

        } else if (fizz) {

            System.out.println("Fizz");

        } else if (buzz) {

            System.out.println("Buzz");

        } else {

            System.out.println(num);
        }
    }

}