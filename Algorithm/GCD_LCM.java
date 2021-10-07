package Algorithm;

public class GCD_LCM {

	// �ִ� �����
	public int GCD(int N, int M) {
		
		if(M == 0) {
			return N;
		}else return GCD(M, N % M);
	}
	
	public int LCM(int N, int M) {
		
		return N * M / GCD(N, M);
	}
}
