package programmers.algorithm.lv1;

public class StringSplice {
    public static void main(String[] args) {
        int answer = 0;
        answer = solution("abracadabra");
        System.out.println(answer);
    }
    public static int solution(String s) {
        StringBuilder process = new StringBuilder();
        int answer = 0;
        int key = 0;
        int[] count = new int[2];
        process.append(s);
        for (int i = 0; i < process.toString().length(); i++){
            if (process.charAt(key) == process.charAt(i)) {
                count[0]++;
            }
            else{
                count[1]++;
            }
            if (count[0] == count[1]){
                key = i+1;
                answer++;
                count[0] = 0;
                count[1] = 0;
            }
        }
        if (count[0] != 0)
            answer++;
        return answer;
    }
}
// Resource : https://school.programmers.co.kr/learn/courses/30/lessons/140108