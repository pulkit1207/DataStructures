package algorithms;

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] myArray = {4, 2, 6, 5, 1, 3};
        bubbleSort(myArray);
        System.out.println(Arrays.toString(myArray));
    }

}
