public class JumpFar {
    private static long[] cache;
    public static long solution(int n) {
        cache = new long[n+1];
        long answer = fibo(n)%1234567;
        return answer;
    }
    public static long fibo(int n){
        if (n <= 1){
            return 1;
        }
        if (cache[n] != 0)
            return cache[n];
        long answer = fibo(n-1) + fibo(n-2);
        cache[n] = answer%1234567;
        return answer;
    }
}

//Resource : https://school.programmers.co.kr/learn/courses/30/lessons/12914