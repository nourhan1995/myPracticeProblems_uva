import java.io.*;
import java.util.*;

public class FractionsAgain_10976 {

	static class Pair {

		long x, y;

		Pair(long x, long y) {
			this.x = x;
			this.y = y;
		}

	}

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			long k = new Integer(br.readLine());
			long x = k;
			long y = -1;
			ArrayList<Pair> res = new ArrayList<>();
			while (x != y) {
				x++;
				y = (k * x) / (x - k);
//				System.out.println(y);
				long tmp = x*y;
				if ( (k*x)%(x-k) == 0 && ( tmp / (x + y)) == k){
//					System.out.println(x);
					res.add(new Pair(x, y));
				}
				// System.out.println(x + " " + y);
			}
			System.out.println(res.size());
			for (int i = 0; i < res.size(); i++) {
				Pair cur = res.get(i);
				System.out.println("1/" + k + " = 1/" + cur.y + " + 1/" + cur.x);
			}
			if (!br.ready())
				break;
		}

	}

}
