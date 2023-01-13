package programmers.algorithm.lv2;

public class JumpAndTeleportation {
    public static void main(String[] args) {
        solution(5000);
    }
    public static int solution(int n) {
        int ans = 0;
        while(n != 0){
            if (n % 2 == 0)
                n /= 2;
            else {
                n--;
                ans++;
            }
        }
        return ans;
    }
}
//Resource : https://school.programmers.co.kr/learn/courses/30/lessons/12980#qna