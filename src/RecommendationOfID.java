public class RecommendationOfID {
    public static void main(String[] args) {
        String test_id = "=.=";
        System.out.println(step4(step2(test_id)));
    }
    public static String solution(String new_id) {
        new_id = step1(new_id);
        new_id = step2(new_id);
        new_id = step3(new_id);
        new_id = step4(new_id);
        new_id = step5(new_id);
        new_id = step6(new_id);
        new_id = step7(new_id);
        return new_id;
    }
    public static String step1(String id){
        return id.toLowerCase();
    }
    public static String step2(String id){
        String[] legaldata = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","w","x","v","y","z","0","1","2","3","4","5","6","7","8","9","-","_","."};
        StringBuilder result = new StringBuilder();
        boolean tester;
        for (int i = 0; i < id.length(); i++){
            tester = false;
            for (String data : legaldata){
                if(id.charAt(i) == data.charAt(0))
                    tester = true;
            }
            if (tester)
                result.append(id.charAt(i));
        }
        return result.toString();
    }
    public static String step3(String id){
        while (id.contains("..")){
            id = id.replace("..",".");
        }
        return id;
    }
    public static String step4(String id){
        if (id.equals("."))
            return "";
        if (id.charAt(0) == '.'){
            id = id.substring(1);
        }
        if (id.charAt(id.length()-1) == '.'){
            id = id.substring(0,id.length()-1);
        }
        return id;
    }
    public static String step5(String id){
        if (id.equals(""))
            id += 'a';
        return id;
    }
    public static String step6(String id){
        if (id.length() > 15)
            id = id.substring(0,15);
        id = step4(id);
        return id;
    }
    public static String step7(String id){
        StringBuilder process = new StringBuilder();
        process.append(id);
        while (process.length() < 3){
            process.append(id.charAt(id.length()-1));
        }
        return process.toString();
    }
}


//Resource : https://school.programmers.co.kr/learn/courses/30/lessons/72410#qna