package algorithms;

import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minimumIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minimumIndex] > array[j]) {
                    minimumIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minimumIndex];
            array[minimumIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] myArray = {4, 2, 6, 5, 1, 3};
        selectionSort(myArray);
        System.out.println(Arrays.toString(myArray));
    }
}
