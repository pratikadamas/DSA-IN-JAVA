package SearchAndSorting;

import java.util.Arrays;

public class Quicksort {

    public static void quicksort(int arr[], int low, int high) {
        if (low < high) {
            int pivotindex = pivot(arr, low, high);
            quicksort(arr, low, pivotindex - 1);
            quicksort(arr, pivotindex + 1, high);
        }
    }

    public static int pivot(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low + 1;
        int j = high;

        while (i <= j) {
            while (i <= high && arr[i] < pivot) {
                i++;
            }
            while (j >= low + 1 && arr[j] >=pivot) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // put pivot at correct place
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 7, -8, 9, 5, 0, 10};
        quicksort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
