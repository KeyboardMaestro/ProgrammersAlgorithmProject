import java.util.Stack;

public class Crane {
    public static void main(String[] args) {
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
        solution(board,moves);
    }
    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        int crane; // 집게가 집고있는 임시 변수
        int depth = 0;
        Stack<Integer> dolls = new Stack<>();
        dolls.add(0); // 초기화
        for (int move : moves) {
            while (board[depth][move - 1] == 0 && depth < board.length - 1) {
                depth++;
            } // 해당 Column 의 맨위 원소 접근
            if (board[depth][move - 1] == 0)
                continue;
            crane = board[depth][move - 1]; // 크레인으로 이동
            System.out.println(crane);
            board[depth][move - 1] = 0; // 뽑았으니 인형 없음
            depth = 0; // 크레인 높이 원위치
            if (dolls.lastElement() == crane) {
                dolls.pop();
                answer += 2;
            } else {
                dolls.add(crane); // 뽑기리스트에 크레인에 있는것 추가
            }
        }
        return answer;
    }
}

//Resource : https://school.programmers.co.kr/learn/courses/30/lessons/64061