package week3.day4;

import week3.day3.RandomNumberGenerator;

import java.util.HashSet;
import java.util.Set;

public class RandomAlphabet {
    public static void main(String[] args) {
        RandomNumberGenerator numberGenerator = new RandomNumberGenerator();

        Set<Integer> set = new HashSet<>();

        for(int i=0 ; i<10 ; i++){
            set.add(numberGenerator.generate(26) + 97);
        }

        for(int c : set){
            System.out.println((char)c);
        }
    }
}
