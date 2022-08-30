package Lesson_3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 2, 3, 4, 5, 6, 2, 2, 2, 2, 10, 5, 2};
        int number = new Scanner(System.in).nextInt();

        removeNumberFromArray(array, number);


    }

    public static void removeNumberFromArray(int array[], int number) {
        Arrays.sort(array);
        if (Arrays.binarySearch(array, number) < 0) {
            System.out.println("Данного числа в массиве нет");
        } else {
            System.out.println(Arrays.toString(Arrays.stream(array).filter(value -> value != number).toArray()));


        }
    }
}

