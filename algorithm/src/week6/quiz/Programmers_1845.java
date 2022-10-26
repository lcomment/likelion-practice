package week6.quiz;

import java.util.HashSet;

public class Programmers_1845 {
    public int solution(int[] nums) {
        HashSet<Integer> kindOfPocketmon = new HashSet<>();

        for (int num : nums) kindOfPocketmon.add(num);

        return Math.min(kindOfPocketmon.size(), nums.length / 2);
    }
}
