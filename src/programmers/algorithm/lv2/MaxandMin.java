package programmers.algorithm.lv2;

import java.util.Arrays;

public class MaxandMin {
    public static void main(String[] args) {

    }
    public String solution(String s) {
        String answer = "";
        String[] data;
        data = s.split(" ");
        int[] integers = new int[data.length];
        for (int i = 0; i < integers.length; i++){
            integers[i] = Integer.parseInt(data[i]);
        }
        answer+= Arrays.stream(integers).min().getAsInt();
        answer+= " ";
        answer+= Arrays.stream(integers).max().getAsInt();
        return answer;
    }
}

//Resource : https://school.programmers.co.kr/learn/courses/30/lessons/12939
