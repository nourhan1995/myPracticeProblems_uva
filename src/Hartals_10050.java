import java.util.*;
import java.io.*;

public class Hartals_10050 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = new Integer(br.readLine());
		while (T-- > 0) {
			int N = new Integer(br.readLine());
			int P = new Integer(br.readLine());
			boolean[] days = new boolean[N + 1];
			int h[] = new int[P];
			for (int i = 0; i < h.length; i++) {
				h[i] = new Integer(br.readLine());
			}
//			System.err.println(Arrays.toString(h));
			for (int i = 1; i < days.length; i++) {
				boolean flag = false;
				for (int j = 0; j < h.length; j++) {
					if (i % h[j] == 0) {
						flag = true;
						break;
					}
				}
				if (flag)
					days[i] = true;
			}
//			System.err.println(Arrays.toString(days));
			int count = 0;
			for (int i = 1; i < days.length; i++) {
				if (days[i]) {
					if(i%7 != 0 && (i+1)%7 != 0){
//						System.err.println(i);
						count++;
					}
				}
			}
			System.out.println(count);
		}

	}

}
