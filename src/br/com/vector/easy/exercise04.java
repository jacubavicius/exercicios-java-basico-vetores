package br.com.vector.easy;

import java.util.Scanner;

public class exercise04 {
    public static void main(String[] args) {
//Preencha um array de 20 números inteiros e conte quantos são pares e quantos são ímpares.

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[20];
        int odd = 0;
        int even = 0;

        System.out.println("Informe 20 números: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();

            if(numbers[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.printf("\nA quantidade de números par é = %d", even);
        System.out.printf("\nA quantidade de números ímpar é = %d", odd);
    }
}
