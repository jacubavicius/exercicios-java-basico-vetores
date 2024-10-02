package br.com.vector.easy;

import java.util.Arrays;
import java.util.Scanner;

public class exercise08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
        int[] newNumbers = new int[numbers.length - 1];
        int element;
        int position = 0;
        boolean exists = false;
        System.out.print("Dado o vetor " + Arrays.toString(numbers) + " selecione o número que deseja remover: ");

        do {
            element = input.nextInt();

            for(int number : numbers) {
                if (number == element) {
                    exists = true;
                    break;
                }
            }

            if(!exists) {
                System.out.print("\nDigite um número válido " + Arrays.toString(numbers) + ": ");
            }

        } while(!exists);


        for(int i = 0; i < numbers.length; i++) {
            if(element != numbers[i]) {
                newNumbers[i] = numbers[i];
            } else {
                position = i;
                break;
            }
        }

        for(int i = position; i <= newNumbers.length - 1; i++) {
            newNumbers[i] = numbers[i + 1];
        }

        System.out.print("\nNovo vetor: " + Arrays.toString(newNumbers));
    }
}
