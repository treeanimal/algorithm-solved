package programmers;

public class level2_����׵θ�ȸ���ϱ� {

	static int[] dx = { 1, 0, -1, 0 };
	static int[] dy = { 0, 1, 0, -1 };

	public int[] solution(int rows, int columns, int[][] queries) {
		int[] answer = new int[queries.length];

		int[][] array = new int[rows + 1][columns + 1];

		// �迭 �ʱ�ȭ
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

	
		// queries�� ���� �� ��ŭ �ݺ�
		for (int i = 0; i < queries.length; i++) {

			// ȸ���ϴ� �迭�� �ּҰ��� �˱� ����
			int min = Integer.MAX_VALUE;
			
			// ���۰��� ������ �˾ƾ� ������ ���� �ȿ��� ȸ�� ��ų �� �ִ�
			int start_x = queries[i][0];
			int start_y = queries[i][1];
			int end_x = queries[i][2];
			int end_y = queries[i][3];

			// ������ x, y��ǥ�� �˾ƾ� �Ѵ�
			int x = start_x;
			int y = start_y;

			// ���� ���� ����, ���߿� �� ��ġ�� �־��ش�
			int start = array[start_x][start_y];
			
			// ȸ�� ���� -> 4�������� ������ ������ idx�� while���� �̿��Ѵ�.
			// while�� �̿��ϴ� ���� -> �ѹ��� ������ ���� �ƴ�, ������ ���� �� ���� ���� �������� ��� �̵� ��Ű�� ������
			int idx = 0;
			while (idx < 4) {

				// �̵� �� ��ǥ���� ���Ѵ�
				int nx = x + dx[idx];
				int ny = y + dy[idx];

				// �̵� �� ��ǥ�� ���� �ȿ� �ִ��� Ȯ���Ѵ�
				if (nx >= start_x && ny >= start_y && nx <= end_x && ny <= end_y) {
//					System.out.println("array[nx][ny] ::: " + array[nx][ny]);
//					System.out.println("array[x][y] ::: " + array[x][y]);
					
					// �迭�� �� ĭ�� �̵���Ų��
					array[x][y] = array[nx][ny];
					
					// �̵� ��Ų �� ���� �̵� �� x, y��ǥ�� �ʱ�ȭ�Ѵ�
					x = nx;
					y = ny;
					
					// �̵��ϸ鼭 �ּڰ��� �ϳ��� ���ϸ� ���Ѵ�
					min = Math.min(min, array[nx][ny]);

//					for (int k = 1; k <= rows; k++) {
//						for (int j = 1; j <= columns; j++) {
//							System.out.print(array[k][j] + " ");
//						}
//						System.out.println();
//					}
//					System.out.println("-------------------------------------");

				// �ش� x, y�� ������ ���� ������ ������ �ٲپ� �����Ѵ�
				} else {
					idx++;
				}
			}
			
			// �迭�� �� �̵���Ű�� ���� ó�� ���� �ش� ��ġ�� �־��ش�
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
		level2_����׵θ�ȸ���ϱ� a = new level2_����׵θ�ȸ���ϱ�();
//		System.out.println(a.solution(6, 6, new int[][] { { 2, 2, 5, 4, }, { 3, 3, 6, 6 }, { 5, 1, 6, 3 } }));
		System.out.println(a.solution(100, 97, new int[][] { {1, 1, 100, 97 }}));
	}
}
