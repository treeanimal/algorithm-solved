package programmers;

import java.util.Arrays;
import java.util.Collections;

public class level2_최솟값만들기 {
    public int solution(int []A, int []B)
    {
        int answer = 0;
        
        Integer[] C = new Integer[B.length];
        
        for(int i = 0; i < B.length; i++) {
        	C[i] = B[i];
        }
        
        Arrays.sort(C, Collections.reverseOrder());
        
        Arrays.sort(A);
        
        for(int i = 0; i < A.length; i++) {
        	answer += A[i] * C[i];
        }

        return answer;
    }
}
