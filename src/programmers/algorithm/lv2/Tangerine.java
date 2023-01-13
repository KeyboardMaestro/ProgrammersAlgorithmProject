package programmers.algorithm.lv2;

import java.util.*;

public class Tangerine {
    public int solution(int k, int[] tangerines) {
        int answer = 0;
        Map<Integer, Integer> categorization = new HashMap<>();
        for (int tangerine : tangerines){
            if (categorization.containsKey(tangerine)) {
                int temp = categorization.get(tangerine);
                temp++;
                categorization.put(tangerine, temp);
            }
            else
                categorization.put(tangerine,1);
        } // 귤 크기 별로 분류
        Integer[] count = categorization.values().toArray(new Integer[0]);
        Arrays.sort(count);
        int amount = 0;
        for (int i = count.length-1; i >= 0 ; i--){
            if (amount >= k)
                return answer;
            else {
                amount += count[i];
                answer = count.length - i;
            }
        }
        return answer;
    }
}

// Resource : https://school.programmers.co.kr/learn/courses/30/lessons/138476
