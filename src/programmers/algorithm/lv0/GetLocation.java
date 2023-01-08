package programmers.algorithm.lv0;

public class GetLocation {
    public int solution(int[] dot) {
        int answer;
        answer = dot[0] > 0 ? 4 : 2;
        answer += dot[1] > 0 ? -1 : 0 ;
        return answer;
    }
}
// Resource : https://school.programmers.co.kr/learn/courses/30/lessons/120841