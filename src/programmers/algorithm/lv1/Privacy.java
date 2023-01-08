package programmers.algorithm.lv1;

import java.util.*;

public class Privacy {
    public static void main(String[] args) {
        String today = "2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
        solution(today, terms, privacies);
    }
    public static int[] solution(String today, String[] terms, String[] privacies) { //
        ArrayList<Integer> answer = new ArrayList();
        String date = today.replaceAll("\\.", ""); // 0 : Year, 1 : Month, 2: Day
        Map<String, Integer> termMap = new HashMap<>();
        System.out.println(date);
        for (String term : terms){
            String[] temp = term.split(" ");
            termMap.put(temp[0], Integer.valueOf(temp[1]));
        } // Dictionary 로 사용하기 위해 Map 처리.
        int index = 1;
        for (String data : privacies){ // Privacies 에 들어있는 원소비교.
            String[] temp = data.split("\\.");
            int year = Integer.parseInt(temp[0]);
            int month = Integer.parseInt(temp[1]);
            int day = Integer.parseInt(temp[2].substring(0,2)) - 1;
            String info = temp[2].substring(3);
            month += termMap.get(info);
            if (day == 0) {
                day = 28;
                month--;
            }
            while (month > 12){
                month -= 12;
                year++;
            } // 날짜 세팅.
            String yearS =  String.valueOf(year);
            String monthS;
            if (month < 10)
                monthS = "0"+ month;
            else
                monthS =String.valueOf(month);
            String dayS;
            if (day < 10)
                dayS = "0"+ day;
            else
                dayS = String.valueOf(day);
            String expiry = yearS+monthS+dayS;
            if (Integer.parseInt(date) > Integer.parseInt(expiry)) {
                answer.add(index);
            }
            index++;
        }
        int[] returnData = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++){
            returnData[i] = answer.get(i);
        }
        return returnData;
    }
}
// Resource : https://school.programmers.co.kr/learn/courses/30/lessons/150370