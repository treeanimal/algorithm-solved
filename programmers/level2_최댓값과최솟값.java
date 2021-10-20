package programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class level2_ÃÖ´ñ°ª°úÃÖ¼Ú°ª {
    public String solution(String s) {
        String answer = "";
        
        String[] array = s.split(" ");
        List<Integer> arr = new ArrayList<Integer>();
        
        for(String x : array) {
        	arr.add(Integer.parseInt(x));
        }
        
        Collections.sort(arr);
        
        int min = arr.get(0);
        int max = arr.get(arr.size() - 1);
        
        answer += min + " " + max;
        
        return answer;
    }
}
