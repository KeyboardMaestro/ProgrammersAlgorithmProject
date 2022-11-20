import java.util.Scanner;

public class Babbling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = {};
        int index = 0;
        while (scanner.hasNext()){
            input[index] = scanner.nextLine();
            index++;
        }
        System.out.println(solution(input));
    }
    public static int solution(String[] babbling) {
        int answer = 0;
        String[] babblings = { "aya", "ye", "woo", "ma"};
        String[] alphabets = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "w", "x", "y", "z"};
        boolean isIt = true;
        for (String a : babbling) {
            isIt = true;
            for (String b : babblings){
                a = a.replaceAll(b , "1");
            }
            for (String check : alphabets)
                if (a.contains(check)){
                    isIt = false;
                    break;
                }
            if (isIt)
                answer++;

        }
        return answer;
    }
}

//Resource : https://school.programmers.co.kr/learn/courses/30/lessons/120956