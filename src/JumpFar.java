public class JumpFar {
    public long solution(int n) {
        long answer = 0;
        long temp1 = 0;
        long temp2 = 1;
        for (int i = 0; i < n;i++){
            answer = (temp1 + temp2) % 1234567;
            temp1 = temp2;
            temp2 = answer;
        }
        return answer;
    }
}

//Resource : https://school.programmers.co.kr/learn/courses/30/lessons/12914