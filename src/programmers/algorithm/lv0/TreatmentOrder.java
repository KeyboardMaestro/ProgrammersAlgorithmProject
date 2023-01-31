package programmers.algorithm.lv0;
import java.util.HashMap;
import java.util.LinkedList;
public class TreatmentOrder {
    public int[] solution(int[] emergency) {
        HashMap<Integer, Integer> data = new HashMap<>();
        for (int i = 0; i < emergency.length; i++){
            data.put(i+1, emergency[i]);
        } // Numbering for the patients
        LinkedList<Integer> order = new LinkedList<>(data.keySet());
        order.sort((o1, o2) -> data.get(o2).compareTo(data.get(o1)));
        int[] answer = new int[emergency.length];
        for (int i = 0; i < emergency.length; i++){
            System.out.println(data.get(order.get(i)));
            answer[order.get(i)-1] = i;
        }
        return answer;
    }
} // Resource : https://school.programmers.co.kr/learn/courses/30/lessons/120835