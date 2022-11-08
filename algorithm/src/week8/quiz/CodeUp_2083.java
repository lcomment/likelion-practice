package week8.quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CodeUp_2083 {
    static int n, s;
    static int[] input;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());
        input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int idx = Arrays.binarySearch(input, s);

        if(idx >= 0)
            System.out.println(idx + 1);
        else
            System.out.println(-1);
    }
}
