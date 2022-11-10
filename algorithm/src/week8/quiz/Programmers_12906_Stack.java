package week8.quiz;

import java.util.Stack;

public class Programmers_12906_Stack {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int start = arr.length-1;

        stack.push(arr[start]);
        for(int i=start-1 ; i>=0 ; i--){
            if(stack.peek() != arr[i]){
                stack.push(arr[i]);
            }
        }

        int[] answer = new int[stack.size()];
        System.out.println(stack.size());
        for(int i=0 ; i<answer.length ; i++){
            answer[i] = stack.pop();
        }

        return answer;
    }
}
