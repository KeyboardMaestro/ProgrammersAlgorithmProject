package programmers.algorithm.lv2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class OpenChatting {
    public static void main(String[] args) {
        String[] testdata = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        solution(testdata);
    }
    public static String[] solution(String[] records) {
        int index = 0;
        Map<String, String> nicknames = new HashMap<>();
        Queue<String> logs = new LinkedList<>();
        for (String record : records){
            String[] temp = record.split(" ");
            if (temp[0].equals("Enter")){
                nicknames.put(temp[1], temp[2]); // 아이디(K)랑 닉네임(Value 저장
                logs.add("들어왔습니다."+" "+temp[1]); // log에 고유값 id와 출입 기록 저장.
            }
            else if (temp[0].equals("Leave")) { // Leave 면 닉네임 안주어짐
                logs.add("나갔습니다."+" "+temp[1]); // log 출입로그저장
            } else { // Change 의 경우
                nicknames.put(temp[1], temp[2]); // Nicknames에 저장된 이름변경.
            }
        }
        String[] answer = new String[logs.size()];
        while (!logs.isEmpty()){ //출입기록이 남아있으면 반복실행
            String[] temp = logs.poll().split(" ");
            answer[index] = "\"" +nicknames.get(temp[1])+"님이 "+temp[0] + "\"";
            index++;
        }
        return answer;
    }
}
// Resource : https://school.programmers.co.kr/learn/courses/30/lessons/42888