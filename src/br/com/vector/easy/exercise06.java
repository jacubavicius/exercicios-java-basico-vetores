package br.com.vector.easy;

import java.util.Scanner;

public class exercise06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o tamanho do vetor: ");
        int size = input.nextInt();

        int result = 1;
        int[] numbers = new int[size];

        System.out.printf("\nInforme %d números: \n", size);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
            result *= numbers[i];
        }

        System.out.printf("\nA multiplicação de todos os números é = %d", result);
    }
}
