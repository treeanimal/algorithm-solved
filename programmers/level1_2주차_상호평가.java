package programmers;

public class level1_2주차_상호평가 {
	public String solution(int[][] scores) {
        String answer = "";
        
        for(int i = 0; i < scores.length; i++){
            int selfScore = scores[i][i];
            boolean uniqueScore = true;
            int sum = 0;
            double avg;
            int min = scores[0][i];
            int max = scores[0][i];
            int count = 0;
            for(int j = 0; j < scores.length; j++){
                
                if(i != j && selfScore == scores[j][i]){
                    uniqueScore = false;
                }
                
                min = Math.min(scores[j][i], min);
                max = Math.max(scores[j][i], max);
                
                sum += scores[j][i];
                count ++;
            }
            
            if(uniqueScore && (max == selfScore || min == selfScore)){
                sum -= selfScore;
                count --;
            }
            
            avg = (double) sum / (double)count;
            answer += getRank(avg);
        }
        
        return answer;
    }
    public static String getRank(double score){
        if(score >= 90){
            return "A";
        }else if(score >= 80){
            return "B";
        }else if(score >= 70){
            return "C";
        }else if(score >= 50){
            return "D";
        }
        return "F";
    }    
}