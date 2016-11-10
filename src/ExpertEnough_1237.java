import java.util.*;
import java.io.*;

public class ExpertEnough_1237 {

	static class Car {

		String name;
		int L, H;

		public Car(String name, int L, int H) {
			this.name = name;
			this.L = L;
			this.H = H;
		}

	}

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = new Integer(br.readLine());
		while (T-- > 0) {
			int n = new Integer(br.readLine());
			Car[] c = new Car[n];
			for (int i = 0; i < c.length; i++) {
				StringTokenizer s = new StringTokenizer(br.readLine());
				c[i] = new Car(s.nextToken(), new Integer(s.nextToken()), new Integer(s.nextToken()));
				// System.out.println(c[i].name + " " + c[i].L + " " + c[i].H);
			}
			int q = new Integer(br.readLine());
			for (int i = 0; i < q; i++) {
				int cur = new Integer(br.readLine());
				int index = -1;
				int count = 0;
				for (int j = 0; j < c.length; j++) {
					if (cur >= c[j].L && cur <= c[j].H) {
						// System.out.println("true " + c[j].name);
						count++;
						index = j;
						if (count > 1) {
							break;
						}
					}
				}
				if (count == 1)
					System.out.println(c[index].name);
				else
					System.out.println("UNDETERMINED");
			}
			if (T != 0)
				System.out.println();
			else
				break;
		}

	}

}
