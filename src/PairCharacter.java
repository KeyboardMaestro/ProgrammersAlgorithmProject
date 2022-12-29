import java.util.Stack;

public class PairCharacter {
    public static void main(String[] args) {
        solution("bcaacbaa");
    }
    public static int solution(String s)
    {
        int answer = 0;
        Stack<String> data = new Stack<>();
        String[] temp = new String[s.length()];
        for (int i = 0; i < s.length(); i++){
            if (data.isEmpty())
                data.add(s.substring(i,i+1));
            else if (s.substring(i,i+1).equals(data.lastElement())){
                data.pop();
            }
            else
                data.add(s.substring(i,i+1));
        }
        if (data.isEmpty())
            return 1;
        else
            return 0;
    }
}
//Resource : https://school.programmers.co.kr/learn/courses/30/lessons/12973
