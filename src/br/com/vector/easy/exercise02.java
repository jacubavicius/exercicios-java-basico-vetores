package br.com.vector.easy;

import java.util.Scanner;

public class exercise02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];
        int sum = 0;
        float average;

        System.out.println("Informe 10 números:");
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();

            sum += numbers[i];
        }

        average = (float) sum / numbers.length;

        System.out.printf("\nA média dos números informados é = %.2f", average);
    }
}
