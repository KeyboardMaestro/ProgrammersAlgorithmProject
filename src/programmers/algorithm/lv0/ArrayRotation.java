package programmers.algorithm.lv0;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class ArrayRotation {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        Deque<Integer> deque = new LinkedList<>();
        for (int number : numbers){
            deque.add(number);
        }
        switch (direction.charAt(0)){
            case 'r' -> {deque.addLast(deque.getLast());
            deque.removeLast();}
            case 'l' -> deque.addLast(deque.poll());
        }
        int i = 0;
        while (!deque.isEmpty()){
            answer[i] = deque.poll();
            i++;
        }
        return answer;
    }
} // Resource : https://school.programmers.co.kr/learn/courses/30/lessons/120844