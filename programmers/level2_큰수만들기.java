package programmers;

public class level2_큰수만들기 {
	
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        int max = 0;

        for(int i=0; i<number.length() - k; i++) {
        	System.out.println("i::" + i);
            max = 0;
            for(int j = index; j <= k+i; j++) {

                if(max < number.charAt(j)-'0') {
                    max = number.charAt(j)-'0';
                    index = j+1;
                }
            }
            sb.append(max);
        }
        return sb.toString();
    }
    
	public static void main(String[] args) {
		
		level2_큰수만들기 a = new level2_큰수만들기();
		System.out.println(a.solution("4177252841", 4));
		
	}

}
