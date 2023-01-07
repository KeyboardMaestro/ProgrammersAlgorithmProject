package programmers.algorithm.lv0;

import java.util.*;

public class AbnormalSorting {
    public static void main(String[] args) {
        int[] input = {1,2,3,4,5,6};
        solution(input, 4);
    }
    public static int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        Map<Integer,Integer> data = new HashMap<>();
        Arrays.sort(numlist);
        for (int i = 0; i < numlist.length; i++){
            data.put(i,Math.abs( numlist[i] - n));
        } // Map <값 , 키> 로 값에 "차의 절댓값", 키로 "주어진 수"

        List<Integer> keySet = new ArrayList<>(data.keySet());
        keySet.sort((o1, o2) -> data.get(o2).compareTo(data.get(o1)));
        Collections.reverse(keySet);

        for (int i = 0; i < answer.length; i++){
            answer[i] = numlist[keySet.get(i)];
            System.out.println(answer[i]);
        }
        return answer;
    }
}
