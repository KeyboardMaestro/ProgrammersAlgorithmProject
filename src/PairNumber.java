import java.util.ArrayList;

public class PairNumber {
    public static void main(String[] args) {
        System.out.println(solution("100","203045"));
    }
    public static String solution(String x, String y) {
        StringBuilder answer = new StringBuilder();
        ArrayList<Integer> data = new ArrayList<>();
        int[][] count = new int[2][10];
        for (int i = 0 ; i < x.length(); i++){
            count[0][Integer.parseInt(String.valueOf(x.charAt(i)))]++;
        }
        for (int i = 0 ; i < y.length(); i++){
            count[1][Integer.parseInt(String.valueOf(y.charAt(i)))]++;
        }
        for (int i = 0 ; i < count[0].length; i++){
            while (count[0][i] > 0 && count[1][i] > 0){
                data.add(i);
                count[0][i]--;
                count[1][i]--;
            }
        }
        data.sort(Integer::compareTo);
        for (int i = 0; i < data.size(); i++){
            answer.append(data.get(i));
        }
        if (answer.length()==0)
            return "-1";
        if (answer.reverse().indexOf("0") == 0)
            return "0";
        return answer.toString();
    }
}

//Resource : https://school.programmers.co.kr/learn/courses/30/lessons/131128#qna