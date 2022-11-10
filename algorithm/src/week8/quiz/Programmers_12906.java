package week8.quiz;

import java.util.ArrayList;

public class Programmers_12906 {
    public int[] solution(int []arr) {
        int len = arr.length;
        ArrayList<Integer> arrList = new ArrayList<>();

        arrList.add(arr[0]);
        for(int i=1 ; i<len ; i++) {
            if(arr[i] != arr[i-1])
                arrList.add(arr[i]);
        }

        int[] answer = new int[arrList.size()];

        for(int j=0 ; j<arrList.size(); j++)
            answer[j] = arrList.get(j);

        return answer;
    }
}
