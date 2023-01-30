package programmers.algorithm.lv0;

public class Game369 {
    public int solution(int order) {
        int answer = 0;
        String data = String.valueOf(order);
        for (int i = 0; i < data.length(); i++){
            switch (data.charAt(i)){
                case '3', '6', '9' -> answer++;
            }
        }
        return answer;
    }
} // Resource : https://school.programmers.co.kr/learn/courses/30/lessons/120891