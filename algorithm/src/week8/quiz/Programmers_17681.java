package week8.quiz;

public class Programmers_17681 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] map1 = new String[n];
        String[] map2 = new String[n];

        for(int i=0 ; i<n ; i++){
            String binaryNum1 = Integer.toBinaryString(arr1[i]);
            String binaryNum2 = Integer.toBinaryString(arr2[i]);

            // n X n 맵으로 만들기
            if(binaryNum1.length() < n){
                while(true){
                    binaryNum1 = "0" + binaryNum1;
                    if(binaryNum1.length() == n)
                        break;
                }
            } // if_binaryNum1

            // n X n 맵으로 만들기
            if(binaryNum2.length() < n){
                while(true){
                    binaryNum2 = "0" + binaryNum2;
                    if(binaryNum2.length() == n)
                        break;
                }
            } // if_binaryNum2

            map1[i] = binaryNum1;
            map2[i] = binaryNum2;
        } // for_i

        String[] answer = new String[n];

        for(int i=0 ; i<n ; i++){
            answer[i] = "";
            for(int j=0 ; j<n ; j++){
                if(map1[i].charAt(j) == '1' || map2[i].charAt(j) == '1')
                    answer[i] += "#";
                else
                    answer[i] += " ";
            } // for_j
        } // for_i
        return answer;
    }
}
