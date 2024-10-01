package br.com.vector.easy;

import java.util.Arrays;
import java.util.Scanner;

public class exercise05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];
        int[] inverse = new int[5];

        System.out.println("Informe 5 números: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
            inverse[numbers.length - (i+1)] = numbers[i];
        }

        System.out.print("\nA ordem inversa do vetor é = " + Arrays.toString(inverse));
    }
}
