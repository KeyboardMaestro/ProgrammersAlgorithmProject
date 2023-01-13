package programmers.algorithm.lv2;

import java.util.Arrays;
public class LifeBoat {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int heavy = people.length - 1;
        int light = 0;
        int boat;
        while (heavy >= light) {
            boat = people[heavy--];
            if (boat + people[light] <= limit) {
                light++;
            }
            answer++;
        }
        return answer;
    }
}

// Resource : https://school.programmers.co.kr/learn/courses/30/lessons/42885#qna