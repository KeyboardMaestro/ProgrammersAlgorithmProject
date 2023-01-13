package programmers.algorithm.lv1;

public class StringSort {
    public static void main(String[] args) {
        String[] strings = {"abcf","bbcd"};
        solution(strings, 2);
    }
    public static String[] solution(String[] strings, int n) {
        String temp = "";
        int index = 0;
        for (int i = 0; i < strings.length; i++){
            for (int j = i+1; j < strings.length;j++){
                if(strings[i].charAt(n) > strings[j].charAt(n)){
                    temp = strings[j];
                    strings[j] = strings[i];
                    strings[i] = temp;
                }else if(strings[i].charAt(n) == strings[j].charAt(n)){
                    for (int k = 0; k < Math.min(strings[i].length(), strings[j].length()); k++){
                        if(strings[i].charAt(k) > strings[j].charAt(k)){
                            temp = strings[j];
                            strings[j] = strings[i];
                            strings[i] = temp;
                            break;
                        } else if (strings[i].charAt(k) < strings[j].charAt(k)){
                            break;
                        }
                    }
                }
            }
        }
        for (String a : strings)
            System.out.println(a);
        return strings;
    }
}
//Resource : https://school.programmers.co.kr/learn/courses/30/lessons/12915