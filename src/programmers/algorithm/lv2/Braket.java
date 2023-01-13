package programmers.algorithm.lv2;

public class Braket {
    boolean solution(String s) {
        boolean answer = true;
        int stack = 0;
        for (int i = 0; i < s.length(); i++){
            if (stack < 0){
                return false;
            }
            else
                if (s.charAt(i) == '(')
                    stack++;
                else
                    stack--;
        }
        if (stack != 0)
            return false;
        return answer;
    }
}

//Resource : https://school.programmers.co.kr/learn/courses/30/lessons/12909