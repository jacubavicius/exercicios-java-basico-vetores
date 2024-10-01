package br.com.vector.easy;

import java.util.Scanner;

public class exercise01 {
    //oCrie um programa que armazene 5 números inteiros em um array e calcule a soma de todos os elementos.
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

        average = (float) sum / numbers.length;

        System.out.printf("A média dos números informado é = %.2f", average);
    }
}


