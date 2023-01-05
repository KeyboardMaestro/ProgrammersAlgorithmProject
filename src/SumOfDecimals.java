public class SumOfDecimals {
    public int solution(int n) {
        int answer = 0;
        String temp = String.valueOf(n);
        for (int i = 0; i < temp.length(); i++){
            answer += Integer.valueOf(temp.substring(i,i+1));
        }
        return answer;
    }
}
// Resource : https://school.programmers.co.kr/learn/courses/30/lessons/12931