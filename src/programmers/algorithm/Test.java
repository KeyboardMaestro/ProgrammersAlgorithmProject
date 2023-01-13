package programmers.algorithm;

import java.util.*;

class Test {
    public static void main(String[] args) {
        int[] input = {600, 400, 300, 200, 700, 800, 100, 900};
        solution("1 2 Z 3");
    }
    public static int solution(String s) {
        int answer = 0;
        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("Z")) {
                answer -= Integer.parseInt(arr[i - 1]);
            } else {
                answer += Integer.parseInt(arr[i]);
            }
        }
        return answer;
    }
}