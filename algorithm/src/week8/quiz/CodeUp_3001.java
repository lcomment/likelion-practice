package week8.quiz;

import java.util.Arrays;
import java.util.Scanner;

public class CodeUp_3001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int want = sc.nextInt();

        int answer = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == want) answer = i+1;

        }
        System.out.println(answer);
    }

}