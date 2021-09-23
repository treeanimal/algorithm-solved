package baekjoon;

import java.io.*;

class b1_2748피보나치수2{
    
    static int N;
    static int result;
    
    static void dp(int one, int two, int sum, int depth){
        if(depth == N){
            System.out.println(sum);
            return;
        }
        one = two;
        two = sum;
        sum = one + two;
        
        dp(one, two, sum, depth + 1);
    }
    
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        
        int one = 0;
        int two = 1;
        
        dp(one, two, one + two, 2);
        
    }
}