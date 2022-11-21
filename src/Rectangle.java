import java.math.*;

public class Rectangle {
    public static void main(String[] args) {

    }
    public int solution(int[][] dots) {
        int min_x = dots[0][0], min_y = dots[0][1], max_x = dots[0][0], max_y = dots[0][1];
        for (int i = 0; i < dots.length ; i++){
            min_x = Math.min(min_x, dots[i][0]);
            min_y = Math.min(min_y, dots[i][1]);
            max_x = Math.max(max_x, dots[i][0]);
            max_y = Math.max(max_y, dots[i][1]);
        }
        int answer = (max_x-min_x) * (max_y-min_y);
        return answer;
    }
}

//Resource : https://school.programmers.co.kr/learn/courses/30/lessons/120860