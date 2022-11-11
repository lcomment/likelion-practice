package week8.quiz;

public class Programmers_70129 {
    public int[] solution(String s) {
        int[] answer = new int[2];

        int count = 0;
        int rmZero = 0;

        while(!s.equals("1")){
            int len = s.length();
            s = removeZero(s.toCharArray());

            int cnt = len - s.length();
            rmZero += cnt;

            s = Integer.toBinaryString(s.length());
            count++;
        }

        answer[0] = count;
        answer[1] = rmZero;

        return answer;
    }

    String removeZero(char[] arr) {
        StringBuilder sb = new StringBuilder();

        for(char c : arr){
            if(c == '1')
                sb.append(c);
        }
        return sb.toString();
    }
}
