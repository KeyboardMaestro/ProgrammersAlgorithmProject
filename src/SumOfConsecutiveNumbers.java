public class SumOfConsecutiveNumbers {
    public static void main(String[] args) {
solution(3,12);
    }
    public static int[] solution(int num, int total) {
        int[] answer = new int[num];
        int data = 0;
        int right = num;
        int left = 1;
        for (int i = left ; i <= num; i++){
            data += i;
        }
        while (data != total){
            if (data > total){
                data = data - right;
                right--;
                left--;
                data = data + left;
            }
            else if (data < total){
                data = data - left;
                left++;
                right++;
                data = data + right;
            }
        }
        for (int i = right; i >= left; i--){
            answer[num-1-(right-i)] = i;
        }
        return answer;
    }
}
//Resource : https://school.programmers.co.kr/learn/courses/30/lessons/120923