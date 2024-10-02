package br.com.vector.medio;

import java.util.Arrays;
import java.util.Scanner;

public class exercise12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];
        int change;

        System.out.println("Informe 10 números: ");
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if(numbers[i] < numbers[j]) {
                    change = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = change;
                }
            }
        }

        System.out.println("\nArray ordenado em ordem crescente: " + Arrays.toString(numbers));
    }
}
