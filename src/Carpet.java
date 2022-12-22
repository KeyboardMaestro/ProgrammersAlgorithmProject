public class Carpet {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int carpet_size = brown + yellow;
        double horizon = carpet_size, vertical;
        for (vertical = 3 ; vertical < carpet_size/2 + 1 ; vertical++){
            horizon = Math.floor(carpet_size/vertical);
            if (((vertical * 2)+(horizon*2) - 4) == brown && vertical*horizon == carpet_size){
                answer[0] = (int)horizon;
                answer[1] = (int)vertical;
                break;
            }

        }
        return answer;
    }
}

//Resource : https://school.programmers.co.kr/learn/courses/30/lessons/42842