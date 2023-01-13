package programmers.algorithm.lv1;

import java.util.*;

public class Report {
    public static int[] solution(String[] id_list, String[] report, int k) {
        Map<String, Integer> data = new HashMap<>();
        HashSet<String> list = new HashSet<>();
        Collections.addAll(list, report);
        int[] answer = new int[id_list.length];
        int[] reported_count = new int[id_list.length];
        for (int i = 0; i < id_list.length; i++) {
            data.put(id_list[i], i);
        }
        for (String a : list){
            reported_count[data.get(a.substring(a.indexOf(" ")+1))] += 1; // count the number of being reported by others
        }
        for (int i = 0 ; i < reported_count.length; i++){
            if (reported_count[i] >= k)
                reported_count[i] -= k-1;
            else
                reported_count[i] = 0;
        }
        for (String b : list){
            if (reported_count[data.get(b.substring(b.indexOf(" ")+1))] != 0)
            answer[data.get(b.substring(0, b.indexOf(" ")))] += 1;
        }
        return answer;
    }
}

//Resource : https://school.programmers.co.kr/learn/courses/30/lessons/92334