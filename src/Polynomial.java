public class Polynomial {
    public String solution(String polynomial) {
        StringBuilder answer = new StringBuilder();
        int coefficient = 0, constant = 0;
        String[] loop = polynomial.split(" ");

        for (String s : loop){
            if (s.endsWith("x")){
                if (s.length() == 1)
                    coefficient += 1;
                else
                    coefficient += Integer.parseInt(s.substring(0,s.length()-1));
            }
            else if(!s.equals("+"))
                constant += Integer.parseInt(s);
        }
        if (coefficient > 1){
            answer.append(coefficient+"x");
        }
        else if (coefficient == 1)
            answer.append("x");

        if (coefficient == 0)
                answer.append(constant);
        else if(constant != 0)
                answer.append(" + "+constant);
        return answer.toString();
    }
}

//Resource : https://school.programmers.co.kr/learn/courses/30/lessons/120863#