package programmers.algorithm;
import java.util.Arrays;
public class ArrayAverage{
    public static void main(String[] args) {

    }
    public double solution(int[] numbers) {
        double answer = 0;
        answer = Arrays.stream(numbers).average().getAsDouble();
        return answer;
    }
}

//Resource : https://school.programmers.co.kr/learn/courses/30/lessons/120817