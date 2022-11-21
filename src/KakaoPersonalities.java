public class KakaoPersonalities {
    public static void main(String[] args) {

    }
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        int[] scores = new int[4];
        int index = 0;
        for (int i = 0; i < survey.length; i++){
            switch (survey[i]) {
                case "RT" -> scores[0] += choices[i] - 4;
                case "TR" -> scores[0] -= choices[i] - 4;
                case "CF" -> scores[1] += choices[i] - 4;
                case "FC" -> scores[1] -= choices[i] - 4;
                case "JM" -> scores[2] += choices[i] - 4;
                case "MJ" -> scores[2] -= choices[i] - 4;
                case "AN" -> scores[3] += choices[i] - 4;
                case "NA" -> scores[3] -= choices[i] - 4;
            }
        }
        for (int i : scores){
            if( i <= 0){
                switch (index) {
                    case 0 -> answer += 'R';
                    case 1 -> answer += 'C';
                    case 2 -> answer += 'J';
                    case 3 -> answer += 'A';
                }
                index++;
            }
            else {
                switch (index) {
                    case 0 -> answer += 'T';
                    case 1 -> answer += 'F';
                    case 2 -> answer += 'M';
                    case 3 -> answer += 'N';
                }
                index++;
            }
        }
        return answer;
    }
}


//Resource : https://school.programmers.co.kr/learn/courses/30/lessons/118666