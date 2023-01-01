import java.util.Arrays;

public class IntegerTriangle {
    public static int solution(int[][] triangle) {
        int step = 0;
        int[] temp = new int[(triangle.length*(triangle.length+1))/2]; // 각 케이스의 합을 저장.
        temp[0] = triangle[0][0]; // 꼭짓점은 하나
        int current = 1;
        for (int i = 1; i < triangle.length; i++){
            step += (i-1);
            for (int j = 0; j < triangle[i].length; j++){
                if (j == 0){
                    temp[current] = temp[step] + triangle[i][j]; // 좌측 정보
                    current++;
                } else if (j == triangle[i].length-1){
                    temp[current] = temp[current-triangle[i].length] + triangle[i][j];
                    current++;
                }else{
                    temp[current] = Math.max(temp[current-triangle[i].length],temp[current-triangle[i].length+1]) + triangle[i][j];
                    current++;
                }
            }
        }
        return Arrays.stream(temp).max().getAsInt();
    }
}
// Resource : https://school.programmers.co.kr/learn/courses/30/lessons/43105