package br.com.vector.medio;

import java.util.Arrays;

public class exercise16 {
    public static void main(String[] args) {

        int[] vector01 = new int[5];
        int[] vector02 = new int[vector01.length];
        int[] product = new int[vector01.length];

        for (int i = 0; i < vector01.length; i++) {
            vector01[i] = (int)(Math.random() * 10);
            vector02[i] = (int)(Math.random() * 10);

            product[i] = vector01[i] * vector02[i];
        }


        System.out.println("O array de produtos dos vetores " + Arrays.toString(vector01)
        + " e " + Arrays.toString(vector02) + " é = " + Arrays.toString(product));
    }
}
