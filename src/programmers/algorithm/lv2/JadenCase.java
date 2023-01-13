package programmers.algorithm.lv2;

public class JadenCase {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] data;
        data = s.toLowerCase().split(" ");
        for (String a : data){
            if(a.length() == 1){
                answer.append(a.toUpperCase()).append(" ");
            } else if (a.length() > 1) {
                answer.append(a.substring(0,1).toUpperCase()).append(a.substring(1)).append(" ");
            }else {
                answer.append(" ");
            }
        }
        if (s.endsWith(" "))
            return answer.toString();
        else
            return answer.toString().trim();
    }
}

//Resource : https://school.programmers.co.kr/learn/courses/30/lessons/12951#