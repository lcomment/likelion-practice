package week3.day4;

import week3.day3.RandomNumberGenerator;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetExercise {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        RandomNumberGenerator numberGenerator = new RandomNumberGenerator();

        for(int i=0 ; i<50 ; i++)
            set.add(numberGenerator.generate(100));

        for(int n : set)
            System.out.println(n);
        System.out.println(set.size());
    }
}
