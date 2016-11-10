import java.io.*;
import java.util.*;

public class StationBalance_410 {

	static class Pair {
		int x, y;

		Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 1;
		while (br.ready()) {
			String line = br.readLine();
			if (line.length() == 0 || line == null)
				break;
//			if (count != 1)
//				System.out.println();
			StringTokenizer st = new StringTokenizer(line);
			int c = new Integer(st.nextToken());
			int s = new Integer(st.nextToken());
			Pair[] p = new Pair[c];
			int size = s;
			if (s != 2 * c)
				size = 2 * c;
			int[] specis = new int[size];
			StringTokenizer s1 = new StringTokenizer(br.readLine());
			int sum = 0;
			for (int i = 0; i < s; i++) {
				specis[i] = new Integer(s1.nextToken());
				sum += specis[i];
			}
			double AM = (double) sum / c;
			double im = 0;
			Arrays.sort(specis);
			// for (int i = s / 2, k = 0, j = i - 1; i < specis.length; i++,
			// k++, j--) {
			// int x = specis[i];
			// int cm = x;
			// int y = -1;
			// if (j >= 0) {
			// y = specis[j];
			// cm += y;
			// }
			// im += Math.abs(cm - AM);
			// p[k] = new Pair(x, y);
			// }
			for (int i = 0, k = 0, j = specis.length - 1; i < specis.length / 2; i++, k++, j--) {
				int x = specis[i];
				int y = specis[j];
				im += Math.abs(x + y - AM);
				p[k] = new Pair(x, y);
			}
			System.out.println("Set #" + count);
			for (int i = 0; i < c; i++) {
				System.out.print(" " + i + ":");
				if (p[i] != null) {
//					boolean flag = false;
					if (p[i].x != 0) {
						System.out.print(" " + p[i].x);
//						flag = true;
					}
					if (p[i].y != 0) {
//						if (flag)
//							System.out.print(" ");
						System.out.print(" " + p[i].y);
					}
				} else
					im += AM;
				System.out.println();
			}
			System.out.printf("IMBALANCE = %.5f\n", im);
			System.out.println();
			count++;
//			if (!br.ready())
//				break;
		}

	}

}
