package programmers.algorithm.lv0;

public class Parallel {
    public static void main(String[] args) {
        int[][] input = {};
        solution(input);
    }
    public static int solution(int[][] dots) {
        int answer = 0;
        double[] gradient = new double[6];
        int index = 0;
        for (int i = 0; i < 4; i++){
            for (int j = i+1; j < 4; j++){
                gradient[index] = (double) (dots[i][0] - dots[j][0]) / (double) (dots[i][1] - dots[j][1]);
                index++;
            }
        }
        for (int i = 0; i< index; i++){
            for (int j = i+1; j < index; j++){
                if (gradient[i] == gradient[j])
                    answer = 1;
            }
        }
        return answer;
    }
}

//Resource : https://school.programmers.co.kr/learn/courses/30/lessons/120875