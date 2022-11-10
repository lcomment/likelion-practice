package week8.quiz;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Programmers_42586 {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<Integer>();

        for(int i=0 ; i<progresses.length ; i++){
            if((100 - progresses[i])%speeds[i]==0)
                q.offer((100 - progresses[i])/speeds[i]);
            else
                q.offer((100 - progresses[i])/speeds[i]+1);
        }

        ArrayList<Integer> arrList = new ArrayList<Integer>();
        while(!q.isEmpty()){
            int f = q.poll();
            int ea = 1;
            for(int m : q){
                if(f>=m) ea++;
                else break;
            }
            for(int i=0 ; i<ea-1 ; i++)
                q.poll();

            arrList.add(ea);
        }
        int[] answer = new int[arrList.size()];
        for(int i=0 ; i<arrList.size() ; i++)
            answer[i] = arrList.get(i);

        return answer;
    }
}
