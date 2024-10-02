package br.com.vector.medio;

import java.util.Arrays;

public class exercise17 {
    public static void main(String[] args) {

        int[] numbers = new int[10];
        int max = 30;
        int min = -30;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * (max - min) + 1) + min;
        }

        System.out.println("Array original: " + Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Math.max(numbers[i], 0);
        }

        System.out.println("Array sem negativos: " + Arrays.toString(numbers));
    }
}
