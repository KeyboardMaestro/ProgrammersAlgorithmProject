import java.util.Arrays;

public class MissedNumbers {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        System.out.println(Arrays.toString(numbers));
    }
    public int solution(int[] numbers) {
        int answer = 0;
        for (int i = 0; i < 10 ; i++){
            if (!Arrays.toString(numbers).contains(String.valueOf(i)))
                answer += i;
        }
        return answer;
    }
}

//Resource : https://school.programmers.co.kr/learn/courses/30/lessons/86051