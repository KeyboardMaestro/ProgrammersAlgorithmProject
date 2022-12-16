public class BinaryTransition {
    public int[] solution(String s) {
        int[] answer = new int[2];
        StringBuilder process = new StringBuilder();
        process.append(s);
        while(!process.toString().equals("1")){
            process = binaryTransit(process.toString(), answer);
            process = binary(process.toString());
        }
        return answer;
    }

    static private StringBuilder binaryTransit(String s, int[] data){
        StringBuilder process = new StringBuilder();
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '0'){
                data[1]++;
            }
            else
                process.append(s.charAt(i));
        }
        data[0]++;
        return process;
    }

    static private StringBuilder binary (String s){
        int length = s.length();
        StringBuilder process = new StringBuilder();
        while (length != 0){
            process.append(length%2);
            length /= 2;
        }
        return process.reverse();
    }
}

//Resource : https://school.programmers.co.kr/learn/courses/30/lessons/70129