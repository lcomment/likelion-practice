package week8.quiz;

public class Programmers_17681 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] map1 = new String[n];
        String[] map2 = new String[n];

        for(int i=0 ; i<n ; i++){
            // StringBuilder binaryNum1 = new StringBuilder(Integer.toBinaryString(arr1[i]));
            // StringBuilder binaryNum2 = new StringBuilder(Integer.toBinaryString(arr2[i]));
            StringBuilder binaryNum1 = new StringBuilder(toBinary(arr1[i]));
            StringBuilder binaryNum2 = new StringBuilder(toBinary(arr2[i]));

            // n X n 맵으로 만들기
            while(binaryNum1.length() < n){
                binaryNum1.insert(0, 0);
            }

            // n X n 맵으로 만들기
            while(binaryNum2.length() < n){
                binaryNum2.insert(0, 0);
            }

            map1[i] = binaryNum1.toString();
            map2[i] = binaryNum2.toString();
        } // for_i

        String[] answer = new String[n];

        for(int i=0 ; i<n ; i++){
            StringBuilder sb = new StringBuilder();

            for(int j=0 ; j<n ; j++){
                if(map1[i].charAt(j) == '1' || map2[i].charAt(j) == '1'){
                    sb.append("#");
                } else {
                    sb.append(" ");
                }
            } // for_j
            answer[i] = sb.toString();
        } // for_i
        return answer;
    }

    // 10진수를 2진수로 만드는 메서드 
    String toBinary(int num){
        StringBuilder result = new StringBuilder();
        while(num != 0){
            int div = num % 2;
            num /= 2;
            result.append(div);
        }

        return result.reverse().toString();
    }
}
