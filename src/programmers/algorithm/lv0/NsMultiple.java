package programmers.algorithm.lv0;

import java.util.LinkedList;
import java.util.Queue;

public class NsMultiple {
    public int[] solution(int n, int[] numlist) {
        Queue<Integer> data = new LinkedList<>();
        for(int a : numlist)
            if(a % n == 0){
                data.add(a);
            }
        int i = 0;
        int[] answer = new int[data.size()];
        while (!data.isEmpty()){
            answer[i] = data.poll();
            i++;
        }
        return answer;
    }
} // Resource : https://school.programmers.co.kr/learn/courses/30/lessons/120905?language=java
