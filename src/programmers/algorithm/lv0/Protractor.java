package programmers.algorithm.lv0;

public class Protractor {
    public int solution(int angle) {
        int answer = 0;
        if (angle == 180){
            answer = 4;
        } else if (angle == 90) {
            answer = 2;
        } else if (angle < 90){
            answer = 1;
        }else
            answer = 3;
        return answer;
    }
}
// Resource : https://school.programmers.co.kr/learn/courses/30/lessons/120829