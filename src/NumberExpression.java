public class NumberExpression {
    public int solution(int n) {
        int answer = 0;
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum = 0;
            for (int j = i; j <= n ;j++){
                sum += j;
                if (sum == n) {
                    answer++;
                    break;
                }
                else if (sum > n)
                    break;
            }
        }
        return answer;
    }
}

//Resource : https://school.programmers.co.kr/learn/courses/30/lessons/12924