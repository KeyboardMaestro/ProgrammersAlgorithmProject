package programmers.algorithm.lv0;

public class NumberOfDice {
    public int solution(int[] box, int n) {
        int answer = (box[0]/n) * (box[1]/n) * (box[2]/3);
        return answer;
    }
} // Resource : https://school.programmers.co.kr/learn/courses/30/lessons/120845