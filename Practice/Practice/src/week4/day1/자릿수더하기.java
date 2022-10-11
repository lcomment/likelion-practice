package week4.day1;

public class 자릿수더하기 {
    public int solution(int n) {
        String s = Integer.toString(n);
        int answer = 0;

        for(int i=0 ; i<s.length() ; i++)
            answer += s.charAt(i) - '0';

        return answer;
    }
}
