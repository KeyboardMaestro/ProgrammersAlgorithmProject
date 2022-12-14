import java.util.Arrays;

public class MakeMinimum {
    public int solution(int []A, int []B)
    {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        for (int i = 0; i <= A.length-1; i++){
            answer += A[i] * B[A.length-i-1];
        }
        return answer;
    }
}

//Resource : https://school.programmers.co.kr/learn/courses/30/lessons/12941