package programmers;

public class level2_행렬테두리회전하기 {

	static int[] dx = { 1, 0, -1, 0 };
	static int[] dy = { 0, 1, 0, -1 };

	public int[] solution(int rows, int columns, int[][] queries) {
		int[] answer = new int[queries.length];

		int[][] array = new int[rows + 1][columns + 1];

		// 배열 초기화
		int a = 0;
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= columns; j++) {
				array[i][j] = ++a;
			}
		}

//		for (int i = 1; i <= rows; i++) {
//			for (int j = 1; j <= columns; j++) {
//				System.out.print(array[i][j] + " ");
//			}
//			System.out.println();
//		}

	
		// queries의 행의 수 만큼 반복
		for (int i = 0; i < queries.length; i++) {

			// 회전하는 배열의 최소값을 알기 위해
			int min = Integer.MAX_VALUE;
			
			// 시작값과 끝값을 알아야 정해진 범위 안에서 회전 시킬 수 있다
			int start_x = queries[i][0];
			int start_y = queries[i][1];
			int end_x = queries[i][2];
			int end_y = queries[i][3];

			// 현재의 x, y좌표를 알아야 한다
			int x = start_x;
			int y = start_y;

			// 시작 값을 빼고, 나중에 들어갈 위치에 넣어준다
			int start = array[start_x][start_y];
			
			// 회전 시작 -> 4방향으로 돌리기 때문에 idx와 while문을 이용한다.
			// while을 이용하는 이유 -> 한번만 돌리는 것이 아닌, 범위에 맞을 때 까지 같은 방향으로 계속 이동 시키기 때문에
			int idx = 0;
			while (idx < 4) {

				// 이동 될 좌표값을 구한다
				int nx = x + dx[idx];
				int ny = y + dy[idx];

				// 이동 될 좌표가 범위 안에 있는지 확인한다
				if (nx >= start_x && ny >= start_y && nx <= end_x && ny <= end_y) {
//					System.out.println("array[nx][ny] ::: " + array[nx][ny]);
//					System.out.println("array[x][y] ::: " + array[x][y]);
					
					// 배열을 한 칸씩 이동시킨다
					array[x][y] = array[nx][ny];
					
					// 이동 시킨 후 다음 이동 될 x, y좌표를 초기화한다
					x = nx;
					y = ny;
					
					// 이동하면서 최솟값을 하나씩 비교하며 구한다
					min = Math.min(min, array[nx][ny]);

//					for (int k = 1; k <= rows; k++) {
//						for (int j = 1; j <= columns; j++) {
//							System.out.print(array[k][j] + " ");
//						}
//						System.out.println();
//					}
//					System.out.println("-------------------------------------");

				// 해당 x, y가 범위에 맞지 않으면 방향을 바꾸어 진행한다
				} else {
					idx++;
				}
			}
			
			// 배열을 다 이동시키고 제일 처음 값을 해당 위치에 넣어준다
			array[start_x][start_y + 1] = start;
			
			min = Math.min(start, min);
			answer[i] = min;

		}
		
//		for(int i =0 ; i < 3; i++) {
//			System.out.println(answer[i]);
//		}

		
		return answer;
	}

	public static void main(String[] args) {
		level2_행렬테두리회전하기 a = new level2_행렬테두리회전하기();
//		System.out.println(a.solution(6, 6, new int[][] { { 2, 2, 5, 4, }, { 3, 3, 6, 6 }, { 5, 1, 6, 3 } }));
		System.out.println(a.solution(100, 97, new int[][] { {1, 1, 100, 97 }}));
	}
}
