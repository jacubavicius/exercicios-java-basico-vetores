package br.com.vector.medio;

import java.util.Arrays;
import java.util.Scanner;

public class exercise19 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] vector = new int[10];
        int[] copy = new int[vector.length];

        System.out.println("Informe 10 números: ");
        for (int i = 0; i < vector.length; i++) {
            vector[i] = input.nextInt();

            copy[i] = vector[i];
        }

        System.out.println(Arrays.toString(vector));
        System.out.println(Arrays.toString(copy));
    }
}
