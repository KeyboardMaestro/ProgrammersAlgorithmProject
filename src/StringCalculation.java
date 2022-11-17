import java.util.Scanner;

public class StringCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(solution(input));
    }
    public static int solution(String my_string) {
        int answer = 0;
        String[] splits = my_string.split(" ");
        answer = Integer.parseInt(splits[0]);
        for (int i = 1; i < splits.length; i++){
            if(splits[i].equals("+"))
                answer += Integer.parseInt(splits[i+1]);
            else if (splits[i].equals("-"))
                answer -= Integer.parseInt(splits[i+1]);
        }
        return answer;
    }
}
