package programmers.algorithm.lv1;

public class Coke {
    public static void main(String[] args) {

    }
    public int solution(int a, int b, int n) {
        int answer = 0;
        while (n >= a) {
            answer += (n / a) * b;
            n = (n % a) + (n / a) * b;
        }
        return answer;
    }
}

//Resource : https://school.programmers.co.kr/learn/courses/30/lessons/132267