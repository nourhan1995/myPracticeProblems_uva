import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class TheBusDriverProblem_11389 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			StringTokenizer s = new StringTokenizer(br.readLine());
			int n = new Integer(s.nextToken());
			int d = new Integer(s.nextToken());
			int r = new Integer(s.nextToken());
			if (n == 0 && d == 0 && r == 0)
				break;
			int sum = 0;
			int[] morning = new int[n];
			Integer [] evening = new Integer[n];
			StringTokenizer s1 = new StringTokenizer(br.readLine());
			StringTokenizer s2 = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; i++) {
				morning[i] = new Integer(s1.nextToken());
				evening[i] = new Integer(s2.nextToken());
			}
			Arrays.sort(morning);
			Arrays.sort(evening, Collections.reverseOrder());
			for (int i = 0; i < n; i++) {
				int hrs = morning[i] + evening[i];
				if (hrs > d)
						sum += (hrs - d)*r;
			}
			System.out.println(sum);
		}

	}

}
