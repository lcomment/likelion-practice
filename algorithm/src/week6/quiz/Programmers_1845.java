package week6.quiz;

import java.util.HashSet;
import java.util.Set;

public class Programmers_1845 {
    public int solution(int[] nums) {
        Set<Integer> kindOfPocketmon = new HashSet<>();
        for (int num : nums) kindOfPocketmon.add(num);
        return Math.min(kindOfPocketmon.size(), nums.length / 2);
    }
}
