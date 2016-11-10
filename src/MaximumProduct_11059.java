import java.io.*;
import java.util.*;

public class MaximumProduct_11059 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int c = 1;
		while (true) {
			int N = new Integer(br.readLine());
			StringTokenizer s = new StringTokenizer(br.readLine());
			int val[] = new int[N];
			for (int i = 0; i < val.length; i++) {
				val[i] = new Integer(s.nextToken());
			}
			br.readLine();
			// if (val[val.length - 1] <= 0)
			// System.out.println("Case #" + c + ": The maximum product is 0.");
			// else {
			// int max = 1;
			// for (int i = 0; i < val.length; i++) {
			// max = Math.max(max, max * val[i]);
			// }
			// System.out.println("Case #" + c + ": The maximum product is " +
			// max + ".");
			// }
			long maxSoFar = 0;
			for (int i = 1; i <= N; i++) {
				long max = 0;
				for (int j = i-1; j < val.length; j++) {
					long soFar = 1;
					for (int j2 = j, k = i; k > 0; j2--, k--) {
						soFar *= val[j2];
					}
					max = Math.max(max, soFar);
				}
				maxSoFar = Math.max(max, maxSoFar);
			}
			System.out.println("Case #" + c + ": The maximum product is " + maxSoFar + ".\n");
			c++;
			if(!br.ready())
				break;
		}

	}

}
