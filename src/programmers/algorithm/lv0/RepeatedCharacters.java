package programmers.algorithm.lv0;

import java.util.Arrays;

public class RepeatedCharacters {
    public static void main(String[] args) {
        System.out.println(solution("We are the world"));
    }
    public static String solution(String my_string) {
        String answer = "";
        int[] count = new int[53];
        for (int i = 0; i < my_string.length(); i++){
            if (my_string.charAt(i) >= 'a' && my_string.charAt(i) <= 'z'){
                if (count[(int)my_string.charAt(i)-(int)'a'] == 0){
                    answer += my_string.charAt(i);
                    count[(int)my_string.charAt(i)-(int)'a']++;
                }
            }else if (my_string.charAt(i) == ' '){
                if (count[52] == 0){
                    answer += ' ';
                    count[52]++;
                }
            }
            else
                if (count[(int)my_string.charAt(i)-(int)'A' + 26] == 0){
                    answer += my_string.charAt(i);
                    count[(int)my_string.charAt(i)-(int)'A' + 26]++;
                }
        }
        return answer;
    }
}

//Resource : https://school.programmers.co.kr/learn/courses/30/lessons/120888