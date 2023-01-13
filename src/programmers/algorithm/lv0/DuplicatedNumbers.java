package programmers.algorithm.lv0;

public class DuplicatedNumbers {
    public int solution(int[] array, int n) {
        int answer = 0;
        for (int a : array){
            if (a == n)
                answer++;
        }
        return answer;
    }
}
//Resource : https://school.programmers.co.kr/learn/courses/30/lessons/120583