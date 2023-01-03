package programmers.algorithm.lv2;
import java.util.Arrays;
import java.util.Collections;
public class H_Index {
    public static int solution(int[] citations) {
        Integer[] data = Arrays.stream(citations).boxed().toArray(Integer[]::new);
        Arrays.sort(data, Collections.reverseOrder());// sorting data, Descending.
        int hPosition = 0; // Key value for computing h-index
        if (Arrays.stream(citations).min().getAsInt() <= data.length)
            for (int i = 0 ; i + 1 < data[i]; i++){
                hPosition = i+1;
            }
        else {
            for (int i = 0 ; i < data.length; i++){
                hPosition = i+1;
            }
        }
        return hPosition;
    }
}
//Resource : https://school.programmers.co.kr/learn/courses/30/lessons/42747