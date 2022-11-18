package week9.algorithm;

public class Programmers_12916 {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();

        for(int i=0 ; i<s.length() ; i++) {
            if(s.charAt(i) == ' ') {
                answer.append(' ');
            }
            else if(s.charAt(i) >= 97) {
                int c = s.charAt(i);
                for(int j=0 ; j<n ; j++) {
                    if(c == 122)
                        c = 97;
                    else
                        c++;
                }
                answer.append((char)c);
            } // 소문자
            else {
                int c = s.charAt(i);
                for(int j=0 ; j<n ; j++) {
                    if(c == 90)
                        c = 65;
                    else
                        c++;
                }
                answer.append((char)c);
            } // 대문자
        }
        return answer.toString();
    }
}
