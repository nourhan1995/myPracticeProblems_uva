import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TheJackpot_10684 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			while(!st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			int n = new Integer(st.nextToken());
//			System.out.println("n: " + n);
			if (n == 0)
				break;
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
//				int i = 0;
				StringTokenizer s = new StringTokenizer(br.readLine());
//				System.out.println(s);
				while (s.hasMoreTokens()) {
					String cur = s.nextToken();
//					System.out.println("i: " + i + ", cur_val: "+cur);
					a[i] = new Integer(cur);
//					System.out.println(a[i]);
					i++;
					if (i < n && !s.hasMoreTokens())
						s = new StringTokenizer(br.readLine());
//					System.out.println(a[i]);
				}
			}
			int sum = 0, res = 0;
			for (int j = 0; j < a.length; j++) {
				sum += a[j];
				res = Math.max(sum, res);
				if (sum < 0)
					sum = 0;
			}
			if (sum == 0)
				System.out.println("Losing streak.");
			else
				System.out.println("The maximum winning streak is " + res + ".");
		}

	}

}
