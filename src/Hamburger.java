import java.util.Stack;

public class Hamburger {
    public static int solution(int[] ingredient) {
        int answer = 0;
        Stack data = new Stack();
        for (int i : ingredient){
            if (i == 1 && data.size()>= 3 && data.lastIndexOf(3) == data.size()-1 && data.lastIndexOf(2) == data.size()-2 && data.lastIndexOf(1) == data.size()-3){
                answer++;
                data.pop();
                data.pop();
                data.pop();
            }else
                data.add(i);
            System.out.println(data);
        }
        return answer;
    }
}

//Resource : https://school.programmers.co.kr/learn/courses/30/lessons/133502#qna