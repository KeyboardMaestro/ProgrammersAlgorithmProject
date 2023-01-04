package programmers.algorithm.lv4;
import java.util.ArrayDeque;
import java.util.LinkedList;

public class MatricesAndCalculation {
    int row, columns;
    ArrayDeque<Integer> column1, column2;
    LinkedList<ArrayDeque<Integer>> rows;
    private void getMatrix(int[][] rc){
        row = rc.length;
        columns = rc[0].length;

        column1 = new ArrayDeque<>();
        column2 = new ArrayDeque<>();
        for (int i = 0; i < row; i++){
            column1.add(rc[i][0]);
            column2.add(rc[i][columns-1]);
        }
        rows = new LinkedList<>();
        for (int i = 0; i < row; i++){
            ArrayDeque<Integer> temp = new ArrayDeque<>();
            for (int j = 1; j < columns-1; j++) {
                temp.add(rc[i][j]);
            }
            rows.add(temp);
        }
    } // 주어진 rc 를 통해 행렬 생성.
    private int[][] buildMatrix(){
        int[][] answer = new int[row][columns];
        for (int i = 0; i < row; i++){
            answer[i][0] = column1.pollFirst();
            answer[i][columns-1] = column2.pollFirst();
        }
        int index = 0;
        for (ArrayDeque<Integer> r : rows){
            for (int j = 1; j < columns-1; j++){
                answer[index][j] = r.pollFirst();
            }
            index++;
        }
        return answer;
    }
    private void shiftRow(){
        rows.addFirst(rows.pollLast());
        column1.addFirst(column1.pollLast());
        column2.addFirst(column2.pollLast());
    }

    private void rotate() {
        if (columns == 2){
            column2.addFirst(column1.pollFirst());
            column1.addLast(column2.pollLast());
            return;
        }
        rows.peekFirst().addFirst(column1.pollFirst());
        column2.addFirst(rows.peekFirst().pollLast());
        rows.peekLast().addLast(column2.pollLast());
        column1.addLast(rows.peekLast().pollFirst());
    }
    public int[][] solution(int[][] rc, String[] operations) {
        getMatrix(rc);
        for (String operation : operations) {
            if (operation.charAt(0) == 'R')
                rotate();
            else
                shiftRow();
        }
        return buildMatrix();
    }
}


//Resource : https://school.programmers.co.kr/learn/courses/30/lessons/118670