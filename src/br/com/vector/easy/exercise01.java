package br.com.vector.easy;

import java.util.Scanner;

public class exercise01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];
        int sum = 0;
        float average;

        System.out.println("Informe 5 números:");
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();

            sum += numbers[i];
        }

        System.out.printf("\nA soma dos números informado é = %d", sum);
    }
}


