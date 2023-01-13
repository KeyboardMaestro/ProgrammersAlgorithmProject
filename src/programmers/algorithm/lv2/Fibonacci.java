package programmers.algorithm.lv2;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    private List<Integer> fibo;
    public int solution(int n) {
        fibo = new ArrayList<>();
        fibo.add(1);
        return fibonacci(n);
    }
    private int fibonacci(int num){
        if (num == 1)
            return 1;
        if (fibo.size()-1 >= num)
            return fibo.get(num);
        int answer = fibonacci(num - 1) + fibonacci(num - 2);
        return answer % 1234567;
    }
}

//Resource : https://school.programmers.co.kr/learn/courses/30/lessons/12945#