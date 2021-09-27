
public class level1_��������õ�ϱ� {
	
	static class Solution {
	    public String solution(String[] table, String[] languages, int[] preference) {
	        String answer = "";
	        int max = 0;
	        String maxJob = "";
	        // �ʿ��� ����
	        // 1. ���ü (SI, CONTENT ��)�� �ɷ��� �Ѵ�.
	        // for���� ���鼭 �ϳ��� ���ڿ��� �迭�� ���ü�� �� �ɷ��� �Ѵ�.
	        // ��ü������ ��ȣ ������ �����ϱ� score�� �˾� ���� �Ѵ�.for���� ���� table�� ���鼭 
	        // �ι�° for���� ���鼭 languages�� ���ϸ� �´� ���� �ִٸ� preference * score�� �Ѵ�.
	        // ������ �ִ��� ������ �˻��Ѵ�.
	        
	        for(int i = 0; i < table.length; i++) {
	        	String[] table_array = table[i].split(" ");
	        	String job = "";
	        	int sum = 0;
	        	
	        	// split���� �ɰ� �迭�� �ٽ� array�� �ݺ������� ������.
	        	for(int j = 0; j < table_array.length; j++) {
	        		int score = table_array.length - j;
	        		
	        		if(j == 0) {
	        			job = table_array[j];
	        			continue;
	        		}
	        		
	        		// �� �ݺ������� ���� 
	        		for(int k = 0; k < languages.length; k++) {
	        			if(languages[k].equals(table_array[j])) {
	        				sum += preference[k] * score;
	        			}
	        		}
	        	}
	        	
	        	// 
	        	if(max <= sum) {
	        		
	        		if(max == sum) {
	        			if(maxJob.compareTo(job) < 0) {
	        				continue;
	        			}
	        		}
	        	}
	        	
	        	max = sum;
	        	maxJob = job;

	        }
	        
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		
	}
}
