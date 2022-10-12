package week4.day2;

import java.util.Arrays;
import java.util.Scanner;

public class 최대값구하기2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // value, row, column
        int[] maxArray = new int[3];

        for(int i=0 ; i<9 ; i++){
            int[] row = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            for(int j=0; j<row.length ; j++) {
                if(row[j] > maxArray[0]){
                    maxArray[0] = row[j];
                    maxArray[1] = i + 1;
                    maxArray[2] = j + 1;
                }
            }
        }
        System.out.println(maxArray[0]);
        System.out.println(maxArray[1] + " " + maxArray[2]);
    }
}
