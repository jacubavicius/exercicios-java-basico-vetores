package br.com.vector.medio;

import java.util.Arrays;
import java.util.Scanner;

public class exercise14 {
    public static void main(String[] args) {

        int[] vector01 = new int[15];
        int[] vector02 = new int[15];
        int[] vector03 = new int[vector01.length + vector02.length ];

        for (int i = 0; i < vector01.length; i++) {
            vector01[i] = (int) (Math.random() * 50);
            vector02[i] = (int) (Math.random() * 50);
        }

        for (int i = 0; i < vector01.length; i++) {
            vector03[i] = vector01[i];
            vector03[i + vector01.length] = vector02[i];
        }

        System.out.println("\nPrimeiro array: " + Arrays.toString(vector01));
        System.out.println("Segundo array: " + Arrays.toString(vector02));

        System.out.println("\nArray concatenado: " + Arrays.toString(vector03));

    }
}
