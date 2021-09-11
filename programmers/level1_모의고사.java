package programmers;

import java.util.ArrayList;

public class level1_모의고사 {

    public int[] solution(int[] answers) {
        
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] arr3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int answer1 = 0, answer2 = 0, answer3 = 0;
        
        for(int i = 0; i < answers.length; i++){
            if(arr1[i % arr1.length] == answers[i]) answer1++;
            if(arr2[i % arr2.length] == answers[i]) answer2++;
            if(arr3[i % arr3.length] == answers[i]) answer3++;
        }
        
        int max = Math.max(Math.max(answer1, answer2), answer3);
        
        ArrayList<Integer> array = new ArrayList<Integer>();
        if(max == answer1) array.add(1);
        if(max == answer2) array.add(2);
        if(max == answer3) array.add(3);
        
        int[] answer = {};
        
        answer = new int[array.size()];
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = array.get(i);
        }
        
        return answer;
    }
}
