package br.com.vector.medio;

import java.util.Arrays;
import java.util.Scanner;

public class exercise11 {
    public static void main(String[] args) {

        int[] numbers = new int[10];
        boolean duplicated = false;

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random() * 20);
        }

        for(int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length - 1; j++) {
                if(numbers[i] == numbers[j]) {
                    duplicated = true;
                    break;
                }
            }

            if(duplicated) {
                break;
            }
        }

        if(!duplicated) {
            System.out.println("Não há números duplicados: " + Arrays.toString(numbers));
        } else {
            System.out.println("Há números duplicados: " + Arrays.toString(numbers));
        }
    }
}
