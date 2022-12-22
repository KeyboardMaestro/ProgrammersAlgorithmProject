public class FractionCal {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = new int[2];
        int num = 0;
        int com = 0;
        int temp = 0;
        if(num1 == num2){
            num = denum1 + denum2;
            com = num1;
        }
        else{
            denum2 *= num1;
            denum1 *= num2;
            com = num1 * num2;
            num = denum1 + denum2;
        }

        temp = Math.max(num, com);
        int index = 2;
        while (index <= temp/2 +1){
            if(num%index == 0 && com%index ==0){
                com = com/index;
                num = num/index;
            }
            else
                index++;
        }
        answer[0] = num;
        answer[1] = com;
        return answer;
    }
}

//Resource : https://school.programmers.co.kr/learn/courses/30/lessons/120808#