package br.com.vector.easy;

import java.util.Scanner;

public class exercise07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[20];
        int element;
        int result = 0;

        System.out.print("Informe 1 número: ");
        element = input.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 10);
            result = numbers[i] == element ? result + 1 : result;
        }

        System.out.printf("O número %d aparece %d vezes no array.", element, result);
    }
}
