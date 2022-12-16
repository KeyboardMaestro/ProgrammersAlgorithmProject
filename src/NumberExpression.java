public class NumberExpression {
    public int solution(int n) {
        int answer = 1;
        int sum;
        for (int i = 1; i <= n/2; i++){
            sum = 0;
            for (int j = i; j <= (n/2)+1 ;j++){
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