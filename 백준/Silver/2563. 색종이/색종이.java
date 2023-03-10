import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		int[][] arr = new int[100][100];

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(bf.readLine());
		int cnt = 0;
		for (int tc = 0; tc < T; tc++) {

			StringTokenizer st = new StringTokenizer(bf.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			for (int r = a; r < a + 10; r++) {
				for (int c = b; c < b + 10; c++) {
					arr[r][c] = 1;
				}
			}

		}
		for (int r = 0; r < 100; r++) {
			for (int c = 0; c < 100; c++) {
				if (arr[r][c] == 1) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);

	}
}