public class AddCiphers {
    public int solution(int n) {
        int answer = 0;
        String data = String.valueOf(n);
        for (int i = 0 ; i < data.length(); i++){
            answer += Integer.parseInt(String.valueOf(data.charAt(i)));
        }
        return answer;
    }
}

//Resource : https://school.programmers.co.kr/learn/courses/30/lessons/120906