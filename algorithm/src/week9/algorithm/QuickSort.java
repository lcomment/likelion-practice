package week9.algorithm;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = { 80, 70, 60, 50, 40, 30, 20 };
        quicksort(array, 0, array.length - 1);

        for (int v : array) {
            System.out.println(v);
        }
    }

    public static int partition(int[] arr, int left, int right) {
        int mid = (left + right) / 2;
        swap(arr, left, mid);

        int pivot = arr[left];
        int i = left, j = right;

        while (i < j) {
            while (pivot < arr[j]) {
                j--;
            }

            while (i < j && pivot >= arr[i]) {
                i++;
            }
            swap(arr, i, j);
        }
        arr[left] = arr[i];
        arr[i] = pivot;
        return i;
    }

    public static void swap(int[] array, int a, int b) {
        int temp = array[b];
        array[b] = array[a];
        array[a] = temp;
    }

    public static void quicksort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }

        int pi = partition(array, left, right);

        quicksort(array, left, pi - 1);
        quicksort(array, pi + 1, right);
    }

}
