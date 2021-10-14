import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		for(int i = 0; i < T; i ++) {
			String temp = str.substring(0, 7).replace('#', '1').replace('*', '0');
			char change = (char)Integer.parseInt(temp, 2);
			
			System.out.print(change);
			
			str = str.substring(7);
			
		}
	}

}
