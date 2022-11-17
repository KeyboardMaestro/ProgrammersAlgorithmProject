import java.util.Scanner;

public class SevenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {};
        int index = 0;
        while (scanner.hasNext()){
            array[index] = scanner.nextInt();
            index++;
        }
        System.out.println(solution(array));
    }
    public static int solution(int[] array) {
        int answer = 0;
        String string = "";
        for (int i = 0; i < array.length; i++) {
            string += String.valueOf(array[i]);
        }
        for (int i = 0; i < string.length(); i++){
            if (string.charAt(i) == '7')
                answer++;
        }
        return answer;
    }
}
