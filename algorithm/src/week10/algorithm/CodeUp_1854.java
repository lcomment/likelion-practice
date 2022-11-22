package week10.algorithm;

import java.util.Scanner;

public class CodeUp_1854 {
    static int result = 0;
    static void recursive(String num, int length, int idx){
        if(idx == length){
            return;
        }
        result += Character.getNumericValue(num.charAt(idx++));
        recursive(num, length, idx);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();

        recursive(N, N.length(), 0);
        System.out.println(result);
    }
}
