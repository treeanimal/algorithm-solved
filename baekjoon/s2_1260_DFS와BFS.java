package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class s2_1260_DFS��BFS {

	static int[][] arr;
	static boolean[] visited;
	static StringBuilder sb = new StringBuilder();
	static int N;
	static int M;
	static int V;
	
    //dfs �޼ҵ�
    public static void dfs(int start){
        // ��� ���
        sb.append(start + " ");
        // ���� ��� �湮 ó��
        visited[start] = true;

        for(int i = 1; i < visited.length; i++)
            // ���� ���� �ٸ� ��� �� && �̹湮 && ������ ����
            if(i != start && visited[i] == false && arr[start][i] == 1)
                dfs(i);

    }
    
    public static void bfs(int start){
        // check�迭 �ʱ�ȭ
        initCheck();
        Queue<Integer> queue = new LinkedList<>();

        // ó�� ���۳�� �߰�
        queue.add(start);
        // ó�� ���۳�� �湮ó��
        visited[start] = true;

        while(!queue.isEmpty()){
            int num = queue.poll();
            sb.append(num + " ");

            for(int i = 1; i < visited.length; i++){
                // ���� ���� �ٸ� ��� �� && �̹湮 && ������ ����
                if(i != num && visited[i] == false && arr[num][i] == 1) {
                    // ��� �߰�
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
        sb.append("\n");
    }
    
    // check�迭 false�� �ʱ�ȭ
    public static void initCheck(){
        for(int i = 0 ; i < visited.length; i++) visited[i] = false;
    }
    
	public static void main(String[] args) throws Exception{
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		V = Integer.parseInt(st.nextToken());
		
		
		arr = new int[N + 1][N + 1];
		visited = new boolean[N + 1];
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			
			arr[s][e] = 1;
			arr[e][s] = 1;
		}
		
		dfs(V);
		
        sb.append("\n");
        bfs(V);

        System.out.println(sb);
	}
}
