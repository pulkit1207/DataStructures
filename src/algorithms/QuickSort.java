package algorithms;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {

    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void quickSort(int[] array, int lowIndex, int highIndex) {

        if (lowIndex >= highIndex) return;

        int pivot = array[highIndex];

        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer < rightPointer) {
            while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }

            while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }

            swap(array, leftPointer, rightPointer);
        }

        swap(array, leftPointer, highIndex);

        quickSort(array, lowIndex, leftPointer - 1);
        quickSort(array, leftPointer + 1, highIndex);

    }

    public static void main(String[] args) {
        int[] myArray = new int[]{1, 7, 3, 10, 2, 5, 4};
        quickSort(myArray, 0, myArray.length - 1);
        System.out.println(Arrays.toString(myArray));
    }

}
