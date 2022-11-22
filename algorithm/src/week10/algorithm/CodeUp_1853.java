package week10.algorithm;

import java.util.Scanner;

public class CodeUp_1853 {
    static int result = 0;
    static void recursive(int limit, int count){
        if(count > limit){
            return;
        }
        result += count++;
        recursive(limit, count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        recursive(N, 1);
        System.out.println(result);
    }
}
