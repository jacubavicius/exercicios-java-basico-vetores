package br.com.vector.easy;

import java.util.Arrays;
import java.util.Scanner;

public class exercise10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];
        int element;
        boolean exists = false;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 15);
        }

        System.out.print("Escolha um número de 1 a 15: ");
        element = input.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == element) {
                exists = true;
                System.out.printf("\nO número %d está na posição: %d ", element, i);
                break;
            }
        }

        if(!exists) {
            System.out.print("\nO número selecionado não existe no vetor!");
        }
    }
}
