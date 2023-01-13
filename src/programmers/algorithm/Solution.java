package programmers.algorithm;

class Solution {
    public int solution(int angle) {
        int answer = 0;
        switch(angle){
            case 70:
                return 1;
            case 90:
                return 2;
            case 91:
                return 3;
            case 180:
                return 4;
        }
        return answer;
    }
}