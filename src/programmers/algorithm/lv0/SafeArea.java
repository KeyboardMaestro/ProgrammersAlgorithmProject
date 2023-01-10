package programmers.algorithm.lv0;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SafeArea {
    static List<List<Integer>> gameBoard;
    private static void boardBuilder(int[][] board){
        gameBoard = new LinkedList<>();
        for (int i = 0; i < board.length; i++){
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < board[0].length; j++){
                temp.add(board[i][j]);
            }
            gameBoard.add(temp);
            System.out.println(gameBoard.get(i));
        }
    }
    private static void mineSearch(){
        for (int i = 0; i < gameBoard.size(); i++){
            for (int j = 0; j < gameBoard.get(0).size(); j++){
                if (gameBoard.get(i).get(j) == 1) {
                    if (j >= 1)
                        if (gameBoard.get(i).get(j - 1) != 1) gameBoard.get(i).set(j - 1, 2);
                    if (j < gameBoard.get(i).size()-1)
                        if (gameBoard.get(i).get(j+1) != 1) gameBoard.get(i).set(j + 1, 2);
                    if (i >= 1){
                        if (gameBoard.get(i-1).get(j) != 1) gameBoard.get(i - 1).set(j, 2);
                        if (j>=1) if (gameBoard.get(i-1).get(j - 1) != 1) gameBoard.get(i - 1).set(j - 1, 2);
                        if (j < gameBoard.get(i).size()-1) if (gameBoard.get(i-1).get(j + 1) != 1) gameBoard.get(i - 1).set(j + 1, 2);
                    }
                    if (i < gameBoard.size()-1){
                        if (gameBoard.get(i+1).get(j) != 1) gameBoard.get(i + 1).set(j, 2);
                        if (j >= 1)if (gameBoard.get(i+1).get(j - 1) != 1) gameBoard.get(i + 1).set(j - 1, 2);
                        if (j < gameBoard.get(i).size()-1)if (gameBoard.get(i+1).get(j + 1) != 1) gameBoard.get(i + 1).set(j + 1, 2);
                    }
                }
            }
        }
    }
    private static int safeZone(){
        int count = 0;
        for (int i = 0; i < gameBoard.size(); i++){
            for (int j = 0; j < gameBoard.get(0).size(); j++){
                System.out.print(gameBoard.get(i).get(j) + " ");
                if (gameBoard.get(i).get(j) == 0){
                    count++;
                }
            }
            System.out.println();
        }
        return count;
    }

    public static int solution(int[][] board) {
        int answer;
        boardBuilder(board);
        mineSearch();
        answer = safeZone();
        return answer;
    }

    public static void main(String[] args){
        int[][] testData = {{1, 0, 0, 0, 1}, {1, 0, 0, 0, 1}, {1, 0, 0, 0, 1}, {1, 0, 1, 1, 0}, {1, 0, 0, 1, 1}};
        System.out.println(solution(testData));
    }
}
// Resource : https://school.programmers.co.kr/learn/courses/30/lessons/120866