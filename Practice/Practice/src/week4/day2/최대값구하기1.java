package week4.day2;

import java.util.Scanner;

public class 최대값구하기1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idx = -1;
        int max = -1;

        for(int i=0 ; i<9 ; i++){
            int num = sc.nextInt();
            if(num > max) {
                max = num;
                idx = i+1;
            }
        }
        System.out.println(max);
        System.out.println(idx);
    }
}
