package br.com.vector.medio;

import java.util.Arrays;
import java.util.Scanner;

public class exercise15 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[11];
        int position = numbers.length - 1;
        boolean palindrome = true;

        System.out.println("Informe 10 números: ");
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        for(int i = 0; i < numbers.length / 2; i++) {
            if(numbers[i] != numbers[position]) {
                palindrome = false;
            }
            position--;
        }

        System.out.println(!palindrome ? "\nO vetor não é um palíndromo: " + Arrays.toString(numbers)
                : "\nO vetor é um palíndromo: " + Arrays.toString(numbers));
    }
}
