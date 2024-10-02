package br.com.vector.medio;

import java.util.Arrays;
import java.util.Scanner;

public class exercise20 {
    public static void main(String[] args) {

        int[] vector01 = new int[5];
        int[] vector02 = new int[vector01.length];
        int[] join = new int[vector01.length * 2];

        int count = 0;

        for(int i = 0; i < vector01.length; i++) {
            vector01[i] = (int)(Math.random() * 50);
            vector02[i] = (int)(Math.random() * 50);
        }

        for (int i = 0; i < join.length; i++) {
            join[i] = vector01[count];
            join[(i+=1)] = vector02[count];
            count++;
        }

        System.out.println("Vetor 1: " + Arrays.toString(vector01));
        System.out.println("Vetor 2: " + Arrays.toString(vector02));
        System.out.println("\nVetores intercalados: " + Arrays.toString(join));

    }
}
