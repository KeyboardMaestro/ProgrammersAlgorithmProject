package programmers.algorithm.lv2;

import java.util.ArrayList;
import java.util.List;

public class WordGame {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        int[] turn = new int[n];
        List<String> collection = new ArrayList<>();
        for (int i = 0; i < words.length; i++){
            turn[i%n]++;
            if (i >= 1 && words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)){
                answer[0] = i%n +1 ;
                answer[1] = turn[i%n];
                return answer;
            }

            if (collection.contains(words[i])){
                answer[0] = i%n +1 ;
                answer[1] = turn[i%n];
                return answer;
            }
            else
                collection.add(words[i]);
        }
        return answer;
    }
}

//Resource : https://school.programmers.co.kr/learn/courses/30/lessons/12981
