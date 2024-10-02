package br.com.vector.easy;

import java.util.Scanner;

public class exercise09 {
    public static void main(String[] args) {
//o	Crie um array de 10 números e calcule a soma dos elementos que estão em posições ímpares.
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];
        int sum = 0;

        System.out.println("Informe 10 números: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();

            sum = i % 2 != 0 ? sum + numbers[i] : sum;
        }

        System.out.printf("\n1A soma dos números ímpares é = %d", sum);
    }
}
