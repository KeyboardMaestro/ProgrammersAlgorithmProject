import java.util.Scanner;

public class HashardNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println(solution(input));
    }
    public static boolean solution(int x) {
        boolean answer = true;
        int isDivisor;
        isDivisor = (x/10000) + (x/1000)%10 + (x/100)%10 + (x/10)%10 + x%10;
        if (x % isDivisor == 0)
        return answer;
        else
            return false;
    }
}
