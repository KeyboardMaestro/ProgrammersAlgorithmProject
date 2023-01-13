package programmers.algorithm.lv0;

public class SumOfConsecutives2 {
        public static void main(String[] args) {
            solution(3,12);
        }
    public static int[] solution(int num, int total) {
        int[] answer = new int[num];
        total += ((num)*(num-1)/2);
        for(int i = 0;i < num ;i++){
            answer[i] = (total/num)-(num-i);
        }
        return answer;
    }
}
//Resource : https://school.programmers.co.kr/learn/courses/30/lessons/120923
