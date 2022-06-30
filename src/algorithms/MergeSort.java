package algorithms;

import java.util.Arrays;

public class MergeSort {
    public static int[] merge(int[] array1, int[] array2) {
        int[] combined = new int[array1.length + array2.length];
        int index = 0;
        int i = 0;
        int j = 0;
        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                combined[index] = array1[i];
                index++;
                i++;
            } else {
                combined[index] = array2[j];
                index++;
                j++;
            }
        }

        while (i < array1.length) {
            combined[index] = array1[i];
            index++;
            i++;
        }

        while (j < array2.length) {
            combined[index] = array2[j];
            index++;
            j++;
        }

        return combined;
    }

    public static int[] mergeSort(int[] array) {
        if (array.length == 1) return array;

        int middle = array.length / 2;

        int[] leftArray = Arrays.copyOfRange(array, 0, middle);
        int[] rightArray = Arrays.copyOfRange(array, middle, array.length);

        return merge(mergeSort(leftArray), mergeSort(rightArray));

    }

    public static void main(String[] args) {
        int[] sortedArray = mergeSort(new int[]{3, 1, 4, 2});
        System.out.println(Arrays.toString(sortedArray));
    }
}
