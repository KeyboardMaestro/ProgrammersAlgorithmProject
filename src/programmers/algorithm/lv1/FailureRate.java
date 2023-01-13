package programmers.algorithm.lv1;

import java.util.Arrays;
public class FailureRate {
    public static void main(String[] args) {
        int[] input = {4,4,4,4,4};
        int N = 4;
        solution(N,input);
    }
    public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] count = new int[N];
        for (int a : stages){
            if (a <= N)
                count[a-1]++;
        } // 라운드별 멈춰있는 사람
        double[] failure = new double[N];
        int sum = 0;
        for (int i = 0 ; i < count.length; i++){
            if (count[i] == 0)
                failure[i] = 0;
            else{
                failure[i] = (double) count[i] / (stages.length - sum);
            }
            sum += count[i];
        } // 라운드별 실패율 계산
        int index;
        for (index = 0; index < failure.length; index++){
            double max = Arrays.stream(failure).max().getAsDouble();
            for (int i = 0 ; i < failure.length;i++){
                if (max == failure[i]){
                    answer[index] = i+1;
                    failure[i] = - 1;
                    break;
                }
            }
        }
        return answer;
    }
}

//Resource : https://school.programmers.co.kr/learn/courses/30/lessons/42889