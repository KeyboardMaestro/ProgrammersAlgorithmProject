public class MatrixMultiple {
    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length]; // arr1 의 열 갯수 == arr2의 행갯수 arr1행 갯수 x arr2 열 갯수 의 행렬 생성 ㅁ
        for (int i = 0; i < arr1.length; i++){ // 행
            for (int k = 0; k < arr2[0].length; k++){ // 행의 열
                for (int j = 0; j < arr1[0].length; j++){
                    answer[i][k] += (arr1[i][j] * arr2[j][k]);
                }
                System.out.print(answer[i][k]+" ");
            }
            System.out.println(" ");
        }
        return answer;
    }
}
//Resource : https://school.programmers.co.kr/learn/courses/30/lessons/12949