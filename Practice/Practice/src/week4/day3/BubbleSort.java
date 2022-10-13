package week4.day3;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];

        for (int i = 0; i < N; i++)
            arr[i] = sc.nextInt();


        bubbleSort_ASCE(arr);
        for(int j=0 ; j<N ; j++)
            System.out.print(arr[j] + " ");


        System.out.println();

        bubbleSort_DESC(arr);
        for (int j = 0; j < N; j++)
            System.out.print(arr[j] + " ");
    }
    public static int[] bubbleSort_ASCE(int[] arr) {
        int idx = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                int save = arr[idx];
                if (save > arr[j]) {
                    arr[idx] = arr[j];
                    arr[j] = save;
                }
                idx++;
            }
            idx = 0;
        }
        return arr;
    }

    public static int[] bubbleSort_DESC(int[] arr) {
        int idx = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                int save = arr[idx];
                if (save < arr[j]) {
                    arr[idx] = arr[j];
                    arr[j] = save;
                }
                idx++;
            }
            idx = 0;
        }
        return arr;
    }
}
