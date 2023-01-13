package programmers.algorithm.lv1;

import java.util.Scanner;

public class Knight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int limit = scanner.nextInt();
        int power = scanner.nextInt();
        System.out.println(solution(number, limit, power));
    }
    public static int solution(int number, int limit, int power) {
        int answer = 1;
        for (int i = 2; i <= number; i++){
            int count = 2;
            for (int j = 2; j <= (i/2); j++){
                if(i % j == 0)
                    count++;
            }
            if (count > limit)
                answer += power;
            else
                answer += count;
        } // 약수를 구하며, limit 값과 비교
        return answer;
    }

}

//Resource : https://school.programmers.co.kr/learn/courses/30/lessons/136798