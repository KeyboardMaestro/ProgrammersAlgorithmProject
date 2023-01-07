package programmers.algorithm.lv0;

import java.util.Stack;

public class ControlZ {
    public static void main(String[] args) {
        solution("1 2 Z 3");
    }
    public  static int solution(String s) {
        int answer = 0;
        Stack<Integer> numbers = new Stack<>();
        for (String string : s.split(" ")){
            if (string.equals("Z"))
                numbers.pop();
            else
                numbers.add(Integer.parseInt(string));
        }
        while (!numbers.isEmpty()){
            answer += numbers.pop();
        }
        return answer;
    }
}
// Resource : https://school.programmers.co.kr/learn/courses/30/lessons/120853