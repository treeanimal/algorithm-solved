package programmers;

public class Level2_JadenCse���ڿ������ {

//	���� - �ٽ� - �ٽ�
    public String solution(String s) {
        String answer = "";
        
        s = s.toLowerCase();
        String[] array = s.split("");
        boolean flag = true;
        
        for(String ss : array) {
        	answer += flag ? ss.toUpperCase() : ss;
        	flag = ss.equals(" ") ? true : false;
        }
        
        return answer;
    }
}
