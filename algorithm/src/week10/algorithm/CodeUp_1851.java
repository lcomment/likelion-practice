package week10.algorithm;

import java.util.Scanner;

public class CodeUp_1851 {
    static void recursive(int limit, int count){
        if(count == limit){
            return;
        }
        System.out.print("*");
        recursive(limit, ++count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        recursive(N, 0);
    }
}
