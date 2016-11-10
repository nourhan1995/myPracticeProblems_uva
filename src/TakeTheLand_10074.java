import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class TakeTheLand_10074 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			StringTokenizer s = new StringTokenizer(br.readLine());
			int m = new Integer(s.nextToken());
			int n = new Integer(s.nextToken());
			if (m == 0 && n == 0)
				break;
			long[][] sum = new long[m][n];
			for (int i = 0; i < sum.length; i++) {
				s = new StringTokenizer(br.readLine());
				for (int j = 0; j < sum[i].length; j++) {
					int cur = new Integer(s.nextToken());
					if (cur == 0)
						sum[i][j] = 1;
					else
						sum[i][j] = (long) -1e6;
					if (i > 0)
						sum[i][j] += sum[i - 1][j];
					if (j > 0)
						sum[i][j] += sum[i][j - 1];
					if (i > 0 && j > 0)
						sum[i][j] -= sum[i - 1][j - 1];
				}
			}

			// for (int i = 0; i < sum.length; i++) {
			// System.out.println(Arrays.toString(sum[i]));
			// }

			long max = (long) -1e10;
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					for (int k = i; k < m; k++) {
						for (int l = j; l < n; l++) {
							// System.out.println("k: " + k + ", l: " + l);
							long subrect = sum[k][l];
							if (i > 0)
								subrect -= sum[i - 1][l];
							if (j > 0)
								subrect -= sum[k][j - 1];
							if (i > 0 && j > 0)
								subrect += sum[i - 1][j - 1];
							max = Math.max(max, subrect);
						}
					}
				}
			}
			if (max < 0)
				System.out.println(0);
			else
				System.out.println(max);
		}

	}

}
