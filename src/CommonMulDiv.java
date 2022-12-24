import java.util.ArrayList;

public class CommonMulDiv {
    public static void main(String[] args) {
        solution(2,5);
    }
    public static int[] solution(int n, int m) {
        int[] answer = new int[2];
        int sum = 1;
        int divisor = 2;
        ArrayList<Integer> data = new ArrayList<>(); // 공통인수 저장
        while (divisor <= Math.min(n,m)) {
            if (m%divisor == 0 && n%divisor ==0) {
                data.add(divisor);
                m = m/divisor;
                n = n/divisor;
            }
            else
                divisor++;
        }
        for(int i = 0; i < data.size(); i++){
            sum *= data.get(i);
        }
        answer[0] = sum;
        answer[1] = sum * n * m;
        return answer;
    }
}
//Resource : https://school.programmers.co.kr/learn/courses/30/lessons/12940