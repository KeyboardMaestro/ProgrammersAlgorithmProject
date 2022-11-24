import java.util.*;

public class HallOfFame {
    public static void main(String[] args) {

    }
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] rankings = new int[k];
        Arrays.fill(rankings, 2000);
        for (int i = 0; i < score.length; i++){
            rankings = Arrays.stream(rankings).sorted().toArray();
            if ( i < k){
                rankings[i] = score[i];
            }
            else if (Arrays.stream(rankings).min().getAsInt() <= score[i])
                rankings[0] = score[i];
            answer[i] = Arrays.stream(rankings).min().getAsInt();
        }
        return answer;
    }
}


//Resource : https://school.programmers.co.kr/learn/courses/30/lessons/138477