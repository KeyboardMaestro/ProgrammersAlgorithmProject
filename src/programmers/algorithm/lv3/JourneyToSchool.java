package programmers.algorithm.lv3;
public class JourneyToSchool {
    private static int[][] map;
    private static void puddleBuilder(int[][] puddles){
        for (int[] puddle : puddles){
            map[puddle[1]][puddle[0]] = -1;
            if (puddle[1] == 1)
                for (int i = puddle[0]; i < map[0].length; i++)
                    map[1][i] = -1;
            if (puddle[0] == 1)
                for (int i = puddle[1]; i < map.length; i++)
                    map[i][1] = -1;
        }
    } // 웅덩이를 포함한 지도 생성.
    private static int pathFinder(int m, int n){ // map n+1 x m+1;
        if (map[n][m] == -1)
            return 0;// 웅덩이 처리
        if (m == 1 || n == 1)
            map[n][m] = 1; // 변두리 처리
        if (map[n][m] != 0)
            return map[n][m];
        map[n][m] = pathFinder(m-1, n) + pathFinder(m, n-1);
        return map[n][m]  %= 1000000007;
    } // 전체 경로 탐색

    public static int solution(int m, int n, int[][] puddles) {
        map = new int[n+1][m+1];
        puddleBuilder(puddles);
        int answer = pathFinder(m,n);
        return answer;
    }

    public static void main(String[] args) {
        int[][] data = {{2,1}};
        System.out.println(solution(4,3, data));
        for (int i = 0; i < map.length; i++){
            for (int j = 0; j < map[0].length; j++)
                System.out.print(map[i][j] + "      ");
            System.out.println();
        }
    } // Test Method.
}
// Resource : https://school.programmers.co.kr/learn/courses/30/lessons/42898