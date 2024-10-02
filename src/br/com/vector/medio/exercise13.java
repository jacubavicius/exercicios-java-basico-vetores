package br.com.vector.medio;

import java.util.Arrays;
import java.util.Scanner;

public class exercise13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[15];
        int element;
        boolean exists = false;

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random() * 20);
        }

        System.out.print("Escolha um número de 1 a 20: ");
        element = input.nextInt();

        for(int number : numbers) {
            if(number == element) {
                exists = true;
                break;

            }
        }

        System.out.println(!exists ? "\nO número " + element + " NÃO está presente no vetor: " + Arrays.toString(numbers)
                : "\nO número " + element + " está presente no vetor: " + Arrays.toString(numbers));
    }
}
