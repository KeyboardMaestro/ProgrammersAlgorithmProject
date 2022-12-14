public class Fibonacci {
    public int solution(int n) {
        int answer = 0;
        int fibo = 1;
        int temp = 0;
        for (int i = 1; i < n; i++){
            answer = (fibo + temp) % 1234567;
            temp = fibo;
            fibo = answer;
        }
        return answer;
    }
}

//Resource : https://school.programmers.co.kr/learn/courses/30/lessons/12945#