package Algorithm;

public class Eratosthenes_sieve {

	static boolean[] array;
	
	public static void main(String[] args) {
		int N = 120;
		
		make_prime(N);
		
		for(int i = 2; i < array.length; i++) {
			if(array[i] == false) {
				System.out.println(i);
			}
		}
	}
	
	public static void make_prime(int N) {
		
		array = new boolean[N + 1];
		
		if(N < 2) {
			return;
		}
		
		array[0] = array[1] = true;
		
		for(int i = 2; i < Math.sqrt(N); i ++) {
			
			if(array[i] == true) {
				continue;
			}
			
			for(int j = i*i; j < array.length; j = j+i) {
				array[j] = true;
			}
		}
	}
}
