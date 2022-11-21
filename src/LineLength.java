import java.util.Arrays;

public class LineLength {
    public static void main(String[] args) {
        int[][] lines = {{0, 5}, {3, 9}, {1, 10}};
        System.out.println(solution(lines));
    }
    public static int solution(int[][] lines) {
        int answer = 0;
        int repeated = 0;
        for (int i = -100; i <101; i++){
            if (i <= lines[0][1] && i <= lines[1][1] && i <= lines[2][1] && i > lines[0][0] && i > lines[1][0] && i > lines[2][0])
                repeated++;
        }
        for (int i = 0; i < lines.length; i++){
            for (int j = i+1;j<lines.length; j++){
                if (lines[i][1] >= lines[j][1] && lines[i][0] <= lines[j][0]) { // 선분j 가 선분 i에 포함될경우.
                    answer += lines[j][1] - lines[j][0];
                }
                else if (lines[j][1] >= lines[i][1] && lines[j][0] <= lines[i][0]) {
                    answer += lines[i][1] - lines[i][0];
                }
                else if (lines[i][0] <= lines[j][1] && lines[j][1] <= lines[i][1] && lines[j][0] <= lines[i][0]){
                    answer += lines[j][1] - lines[i][0];
                }
                else if (lines[i][1] >= lines[j][0] && lines[i][0] <= lines[j][0]) {//선분 i의 +방향으로 선분 j 와 곂칠경우
                    answer += lines[i][1] - lines[j][0];
                }
            }
        }
        return answer - repeated*2;
    }
}

//Resource : https://school.programmers.co.kr/learn/courses/30/lessons/120876