package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class s4_13305_¡÷¿Øº“ {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		long[] highway = new long[N-1];
		for(int i = 0; i < N - 1; i++) {
			highway[i] = Integer.parseInt(st1.nextToken());
		}
		
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		long[] city = new long[N];
		for(int i = 0; i < N; i++) {
			city[i] = Integer.parseInt(st2.nextToken());
		}
		
		long sum = 0;
		long cheapest = city[0];
		for(int i = 1; i < N; i++) {
			if(city[i] < cheapest) {
				cheapest = city[i];
			}
			
			sum += cheapest * highway[i-1];
		}
		
		System.out.println(sum);
		
	}
}
