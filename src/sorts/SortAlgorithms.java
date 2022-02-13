package sorts;

import java.util.Arrays;

public class SortAlgorithms {
    public static void main(String[] args) {
        int[] arr = new int[]{9, 7, 2, 10, 8, 6};
//        System.out.println("Bubble sort: " + Arrays.toString(sortArrayByBubbleSort(arr)));
//        System.out.println("Insertion sort: " + Arrays.toString(sortArrayByInsertionSort(arr)));
        System.out.println("Selection sort: " + Arrays.toString(sortArrayBySelectionSort2(arr)));
    }

    public static int[] sortArrayByBubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }


    public static int[] sortArrayByInsertionSort(int[] arr) {
        for (int step = 1; step < arr.length; step++) {
            int key = arr[step];
            int j = step - 1;

            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                --j;
            }

            arr[j + 1] = key;
        }
        return arr;
    }

    public static int[] sortArrayBySelectionSort(int[] arr) {
        for (int step = 0; step < arr.length - 1; step++) {
            int min_index = step;
            for (int i = step + 1; i < arr.length; i++) {
                if (arr[i] < arr[min_index]) {
                    min_index = i;
                }
            }
            int temp = arr[step];
            arr[step] = arr[min_index];
            arr[min_index] = temp;
        }
        return arr;
    }

    public static int[] sortArrayBySelectionSort2(int[] arr) {
        for (int step = 0; step < arr.length - 1; step++) {
            int min_index = step;
            for (int i = step + 1; i < arr.length; i++) {
                if(arr[i] < arr[min_index]){
                    min_index = i;
                }
            }
            int temp = arr[step];
            arr[step] = arr[min_index];
            arr[min_index] = temp;
        }
        return arr;
    }
}
