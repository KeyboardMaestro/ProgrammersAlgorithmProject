public class NextBigNumbber {
    public int solution(int n) {
        int answer;
        for (answer=n+1; ;answer++){
            if (counter(Integer.toBinaryString(n)) == counter(Integer.toBinaryString(answer)))
                return answer;
        }
    }
    static private int counter (String s){
        int result = 0;
        for (int i = 0 ; i < s.length(); i++){
            if (s.charAt(i) == '1'){
                result++;
            }
        }
        return result;
    }
}

//Resource : https://school.programmers.co.kr/learn/courses/30/lessons/12911