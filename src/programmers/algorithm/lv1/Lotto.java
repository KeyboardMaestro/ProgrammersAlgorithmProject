package programmers.algorithm.lv1;

public class Lotto {
    public static void main(String[] args) {

    }
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {1,6};
        int[] count = {0,0}; // 0번 일치하는번호수, 1번 lottos의 0의 개수

        for (int num : lottos){
            if (num == 0)
                count[1]++;
            else
                for (int win : win_nums){
                    if (num == win)
                        count[0]++;
                }
        } //일치한번호의수
        // 제일못나올경우
        switch (count[0]) {
            case 2 -> answer[1] = 5;
            case 3 -> answer[1] = 4;
            case 4 -> answer[1] = 3;
            case 5 -> answer[1] = 2;
            case 6 -> answer[1] = 1;
        }
        // 제일 잘나올경우
        switch (count[1]) {
            case 0:
                answer[0] = answer[1];
                break;
            case 1:
                if (count[0] == 0)
                    answer[0] = 6;
                else
                    answer[0] = answer[1] - 1;
                break;
            case 2:
                if (count[0] == 0)
                    answer[0] = 5;
                else
                    answer[0] = answer[1] - 2;
                break;
            case 3:
                if (count[0] == 0)
                    answer[0] = 4;
                else
                    answer[0] = answer[1] - 3;
                break;
            case 4:
                if (count[0] == 0)
                    answer[0] = 3;
                else
                    answer[0] = answer[1] - 4;
                break;
            case 5:
                if (count[0] == 0)
                    answer[0] = 2;
                else
                    answer[0] = answer[1] - 5;
                break;
            case 6:
                answer[0] = 1;
                answer[1] = 6;
                break;
        }
        if (count[1] == 0 && count[0] == 0){
            answer[0] = 6;
            answer[1] = 6;
        }
        return answer;
    }
}

//Resource : https://school.programmers.co.kr/learn/courses/30/lessons/77484