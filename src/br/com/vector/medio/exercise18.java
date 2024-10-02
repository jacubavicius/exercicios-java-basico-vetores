package br.com.vector.medio;

import java.util.Arrays;

public class exercise18 {
    public static void main(String[] args) {

        int[] vector01 = new int[5];
        int[] vector02 = new int[vector01.length];
        int[] sum = new int[vector01.length];

        for (int i = 0; i < vector01.length; i++) {
            vector01[i] = (int) (Math.random() * 100);
            vector02[i] = (int) (Math.random() * 100);

            sum[i] = vector01[i] + vector02[i];
        }

        System.out.println("A soma dos vetores " + Arrays.toString(vector01)
        + " e " + Arrays.toString(vector02) + " é = " + Arrays.toString(sum));
    }
}
