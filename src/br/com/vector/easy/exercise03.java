package br.com.vector.easy;

import java.util.Scanner;

public class exercise03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers =  new int[10];

        System.out.println("Informe 10 números: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        int minor = numbers[1];
        int major = numbers[1];

        for(int number : numbers) {
            minor = Math.min(number, minor);
            major = Math.max(number, major);
        }

        System.out.printf("\nO menor número é = %d", minor);
        System.out.printf("\nO maior número é = %d", major);

    }
}
