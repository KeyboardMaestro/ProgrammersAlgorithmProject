import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DevelopingFunction {
    public static void main(String[] args) {
        int[] pro = {93,30,55};
        int[] spd = {1,30,5};
        solution(pro, spd);
    }
    public static int[] solution(int[] progresses, int[] speeds) {
        int length = progresses.length;
        Queue<Integer> result = new LinkedList();
        Stack<Integer> data = new Stack<>();
        int key = 0;
        while(key != length){
            for (int i = key; i < length; i++){
                progresses[i] += speeds[i];
            }
            for (int i = key; i < length; i++){
                if (progresses[i] >= 100){
                    data.add(progresses[i]);
                }
                else
                    break;
            }
            if (data.size() != 0){
                result.add(data.size());
                key += data.size();
                data.removeAllElements();
            }
        }
        int[] answer = new int[result.size()];
            for (int i = 0; i < answer.length ; i++){
                answer[i] = result.peek();
                result.remove();
        }
        return answer;
    }
}

// Resource : https://school.programmers.co.kr/learn/courses/30/lessons/42586