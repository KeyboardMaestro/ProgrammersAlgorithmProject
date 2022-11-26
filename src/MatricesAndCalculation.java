import java.util.Arrays;

public class MatricesAndCalculation {
    public static void main(String[] args) {
        int[][] data = {{1,0},{0,1}};
        System.out.println(Arrays.deepToString(rotate(data)));
    }
    public int[][] solution(int[][] rc, String[] operations) {
        int[][] answer = {};
        for (String oper : operations){
            if (oper.charAt(0) == 'R')
                rotate(rc);
            else
                shiftRow(rc);
        }
        answer = rc;
        return answer;
    }
    public static int[][] shiftRow(int[][] rc){
       int[] tempRow = new int[rc.length]; // 행의 갯수만큼 임시 변수 할당
        tempRow = rc[tempRow.length-1]; // 마지막행을 임시 변수에 저장
        for (int i = rc.length-1; i >= 1 ; i--){
            rc[i] = rc[i-1];
        } // O(n)
        rc[0] = tempRow;
        return rc;
    }

    public static int[][] rotate(int[][] rc) {
        int[] temp; // 0 : 첫행 마지막 열, 1 : 마지막행 첫번째 열
        temp = new int[2];
        int rowLength = rc[0].length; // 열의 개수
        int columnLength = rc.length; // 행의 개수
        temp[0] = rc[0][rowLength - 1];
        temp[1] = rc[columnLength - 1][0];
        for (int i = rc[0].length - 1; i >= 1; i--) {
            rc[0][i] = rc[0][i - 1]; // 첫행 우측으로
            rc[rc.length-1][rowLength-1-i] = rc[rc.length-1][rowLength-1-(i-1)]; // 마지막행 좌측으로
        }
        for (int i = rc.length-1; i >= 2; i--){
            rc[i][rowLength-1] = rc[i-1][rowLength-1]; // 마지막열 아래로 내리기
            rc[i-2][0] = rc[i-1][0]; // 첫열 위로 올리기
        }
        rc[1][rowLength-1] = temp[0]; // 회전하면서 소거된 값 입력
        rc[columnLength-2][0] = temp[1]; // 회전하며 소거된 값 입력
        return rc;
    }
}


//Resource : https://school.programmers.co.kr/learn/courses/30/lessons/118670