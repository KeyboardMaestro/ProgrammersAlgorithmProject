import java.util.Arrays;
import java.util.Stack;

public class Hamburger {
    public static void main(String[] args) {
        int[] data = {2, 1, 1, 2, 3, 1, 2, 3, 1};
        int answer = 0;
        answer = solution(data);
        System.out.println(answer);
    }

    public static int solution(int[] ingredient) {
        int answer = 0;
        Stack data = new Stack();
        for (int i : ingredient){
            if(i == 1 && data.size() >= 4){
                if (data.lastIndexOf(3) == data.size()-1)
                    if (data.lastIndexOf(2) == data.size()-2)
                        if (data.lastIndexOf(1) == data.size()-3){
                            data.pop();
                            data.pop();
                            data.pop();
                            answer++;
                            checkBug(data, answer);
                        }
                        else {data.add(i);}
                    else data.add(i);
                else data.add(i);
            }
            else {data.add(i);}
        }
        return answer;
    }
    private static void checkBug (Stack data ,int answer){
        if(data.size() >= 4){
            if (data.lastElement().equals(1))
            if (data.lastIndexOf(3) == data.size()-2)
                if (data.lastIndexOf(2) == data.size()-3)
                    if (data.lastIndexOf(1) == data.size()-4){
                        data.pop();
                        data.pop();
                        data.pop();
                        data.pop();
                        answer++;
                    }
        }
    }
}
    /*    public static int solution(int[] ingredient) {
        int answer = 0;
        String temp = "";
        String string = "";
        for (int i = 0; i < ingredient.length; i++) {
            string += ingredient[i];
            if (ingredient[i] == 1) {
                while (!string.replaceAll("1231", "").equals(string)) {
                    temp = string;
                    string = string.replaceAll("1231", "");
                    answer += (temp.length() - string.length()) / 4;
                }
            }
        }
        return answer;
    }*/