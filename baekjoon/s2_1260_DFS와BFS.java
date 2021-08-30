package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class s2_1260_DFS와BFS {

	static int[][] arr;
	static boolean[] visited;
	static StringBuilder sb = new StringBuilder();
	static int N;
	static int M;
	static int V;
	
    //dfs 메소드
    public static void dfs(int start){
        // 경로 출력
        sb.append(start + " ");
        // 현재 노드 방문 처리
        visited[start] = true;

        for(int i = 1; i < visited.length; i++)
            // 현재 노드와 다른 노드 중 && 미방문 && 간선이 존재
            if(i != start && visited[i] == false && arr[start][i] == 1)
                dfs(i);

    }
    
    public static void bfs(int start){
        // check배열 초기화
        initCheck();
        Queue<Integer> queue = new LinkedList<>();

        // 처음 시작노드 추가
        queue.add(start);
        // 처음 시작노드 방문처리
        visited[start] = true;

        while(!queue.isEmpty()){
            int num = queue.poll();
            sb.append(num + " ");

            for(int i = 1; i < visited.length; i++){
                // 현재 노드와 다른 노드 중 && 미방문 && 간선이 존재
                if(i != num && visited[i] == false && arr[num][i] == 1) {
                    // 노드 추가
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
        sb.append("\n");
    }
    
    // check배열 false로 초기화
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
