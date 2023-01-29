package programmers.algorithm.lv0;

public class FindNumber {
    public int solution(int num, int k) {
        int answer = -1;
        String string = String.valueOf(num);
        for (int i = 0; i < string.length(); i++){
            if (string.charAt(i) == String.valueOf(k).charAt(0)){
                answer = i+1;
                break;
            }
        }
        return answer;
    }
} // Resource : https://school.programmers.co.kr/learn/courses/30/lessons/120904#