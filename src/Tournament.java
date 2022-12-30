public class Tournament {
    public static void main(String[] args) {
        System.out.println((solution(8,4,5)));
    }
    public static int solution(int n, int a, int b)
    {
        int answer = 1;
        while ((n/2) != 0) {
            n = n / 2;
            if (((a/2) + (a%2)) == ((b/2) + (b%2)))
                break;
            else{
                a = (a/2) + (a%2); // 다음회차 번호 부여
                b = (b/2) + (b%2); // 다음회차 번호 부여
                answer++;
            }
        }
        return answer;
    }
}
// Resource : https://school.programmers.co.kr/learn/courses/30/lessons/12985#qna