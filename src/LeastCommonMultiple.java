import java.util.Arrays;
import java.util.Stack;

public class LeastCommonMultiple {
    public static void main(String[] args) {
        long[] input = {12, 32, 45, 67, 72};
        solution(input);
    }
    public static long solution(long[] arr) {
        long gcd = 2;
        long temp1 = 1;
        long temp2 = 0;
        long temp3 = 0;
        long lcm = 0;
        long index = 2;
        for (int i = 0; i < arr.length; i++){
            if (Math.max(temp1, arr[i])%Math.min(temp1, arr[i]) == 0){
                gcd = Math.min(temp1, arr[i]);
            }
            else {
                index = Math.max(temp1, arr[i]) % Math.min(temp1, arr[i]); // 12 32 gcd = 8
                temp2 = Math.min(temp1, arr[i]); // 32
                while (temp2 % index != 0) {
                    temp3 = temp2; // 32 32
                    temp2 = index; // 8 8
                    index = temp3 % index; // 0
                }
                gcd = index;
            }
            System.out.println(gcd);
            lcm = (temp1 * arr[i])/gcd;
            System.out.println(lcm);
            temp1 = lcm;
        }
        return lcm;
    }
}
// Resource : https://school.programmers.co.kr/learn/courses/30/lessons/12953#