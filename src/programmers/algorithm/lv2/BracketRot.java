package programmers.algorithm.lv2;

import javax.xml.transform.SourceLocator;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class BracketRot {
    public static void main(String[] args) {
        String input ="}]()[{";
        System.out.println(solution(input));;
    }
    public static int solution(String s) {
        int answer = 0;
        for (int i = 0; i < s.length(); i++){
            s = s.charAt(s.length()-1) + s.substring(0,s.length()-1);
            if(isCorrect(s))
                answer++;
        }
        return answer;
    }
    public static boolean isCorrect(String a){
        boolean data = false;
        Stack<Character> temp= new Stack<>();
        for (int i = 0; i < a.length(); i++){
            char cal = a.charAt(i);
            if (temp.isEmpty())
                temp.add(cal);
            else{
                if (cal == ')'){
                if (temp.lastElement() == '(')
                    temp.pop();
                else
                    temp.add(cal);
            }else if(cal == '}' || cal == ']'){
                if (temp.lastElement() ==  (char) (cal - 2)){
                    temp.pop();
                }
                else
                    temp.add(cal);
                }
                else
                    temp.add(cal);
            }
        }
        if (temp.isEmpty()){
            data = true;
        } else if (temp.size() == 2){
            if (temp.toString().equals("{}") || temp.toString().equals("[]") || temp.toString().equals("()"))
                data = true;
        }
        return data;
    }
}
// Resource : https://school.programmers.co.kr/learn/courses/30/lessons/76502