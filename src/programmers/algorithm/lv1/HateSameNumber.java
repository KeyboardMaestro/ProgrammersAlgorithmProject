package programmers.algorithm.lv1;
import java.util.Stack;
public class HateSameNumber {
    public int[] solution(int []arr) {
        int[] answer = {};
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < arr.length; i++){
            if (stack.lastElement() != arr[i])
                stack.add(arr[i]);
        }
        return answer;
    }
}