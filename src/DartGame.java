public class DartGame {
    public static void main(String[] args) {
        System.out.println(solution("1D2S#10S"));
    }
    public static int solution(String dartResult) {
        int answer = 0;
        int temp1 = 0;
        int temp2 = 0;
        String[] data = new String[3];
        String[] split = {"S*", "S#", "S", "D*", "D#", "D", "T*", "T#", "T"};
        for (int i = 0; i < split.length; i++){
                dartResult = dartResult.replace(split[i], split[i].toLowerCase()+"/");
        }
        data = dartResult.split("/");
        for (String d : data){
            for (int i = 0; i < d.length() ; i++){
                switch (d.charAt(i)){
                    case '0','1','2','3','4','5','6','7','8','9' -> {
                        if (d.charAt(i + 1) != '0') {
                            temp1 = Integer.parseInt(String.valueOf(d.charAt(i)));
                        }
                        else{
                            temp1 = 10;
                            i++;
                        }
                    }
                    case 'd' -> temp1 *= temp1;
                    case 't' -> temp1 *= temp1 * temp1;
                    case '*' -> {temp1 *= 2; answer += temp2;}
                    case '#' -> temp1 *= (-1);
                }
            }
            System.out.println(temp1);
            answer += temp1;
            temp2 = temp1;
        }
        return answer;
    }
}

//Resource : https://school.programmers.co.kr/learn/courses/30/lessons/17682