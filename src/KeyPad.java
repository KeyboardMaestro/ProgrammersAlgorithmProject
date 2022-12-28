public class KeyPad {
    public static String solution(int[] numbers, String hand) {
        int[][] distance = {{0,4,3,4,3,2,3,2,1,2,1,1},{4,0,1,2,1,2,3,2,3,4},{3,1,0,1,2,1,2,3,2,3,4,4},{4,2,1,0,3,2,1,4,3,2},{3,1,2,3,0,1,2,1,2,3},{2,2,1,2,1,0,1,2,1,2,3,3},{3,3,2,1,2,1,0,3,2,1},{2,2,3,4,1,2,3,0,1,2},{1,3,2,3,2,1,2,1,0,1,2,2},{2,4,3,2,3,2,1,2,1,0}};
        StringBuilder answer = new StringBuilder();
        int[] lastMove = {10,11};
        for (int number : numbers) {
            switch (number) {
                case 1, 4, 7 -> {
                    answer.append("L");
                    lastMove[0] = number;
                }
                case 3, 6, 9 -> {
                    answer.append("R");
                    lastMove[1] = number;
                }
                default -> {
                    if (distance[number][lastMove[0]] == distance[number][lastMove[1]]) {
                        switch (hand.charAt(0)) {
                            case 'r' -> {
                                answer.append("R");
                                lastMove[1] = number;
                            }
                            case 'l' -> {
                                answer.append("L");
                                lastMove[0] = number;
                            }
                        }
                    } else if (distance[number][lastMove[0]] > distance[number][lastMove[1]]) {
                        answer.append("R");
                        lastMove[1] = number;
                    } else if (distance[number][lastMove[0]] < distance[number][lastMove[1]]) {
                        answer.append("L");
                        lastMove[0] = number;
                    }
                }
            }
        }
        return answer.toString();
    }
}
// Resource : https://school.programmers.co.kr/learn/courses/30/lessons/67256