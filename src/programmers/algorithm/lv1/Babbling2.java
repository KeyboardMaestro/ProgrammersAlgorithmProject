package programmers.algorithm.lv1;

public class Babbling2 {
    public static void main(String[] args) {

    }
    public static int solution(String[] babbling) {
        int answer = 0;
        String[] babblings = { "aya", "ye", "woo", "ma"};
        String[] alphabets = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "w", "x", "y", "z"};
        boolean isIt = true;
        for (String a : babbling) {
            isIt = true;
            for (String b : babblings){
                switch (b){
                    case  "aya" -> a = a.replaceAll(b , "1");
                    case  "ye" -> a = a.replaceAll(b , "2");
                    case  "woo" -> a = a.replaceAll(b , "3");
                    case  "ma" -> a = a.replaceAll(b , "4");
                }
            }
            for (String check : alphabets)
                if (a.contains(check)){
                    isIt = false;
                    break;
                }
            for (int i = 0; i < a.length()-1; i++){
                if (a.charAt(i) == a.charAt(i+1)){
                    isIt = false;
                    break;
                }
            }
            if (isIt)
                answer++;

        }
        return answer;
    }
}


//Resource : https://school.programmers.co.kr/learn/courses/30/lessons/133499