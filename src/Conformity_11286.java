import java.io.*;
import java.util.*;

public class Conformity_11286 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			int n = new Integer(br.readLine());
			if (n == 0)
				break;
			Hashtable<String, Integer> data = new Hashtable<>();
			int max = 0;
			String pop = "";
			for (int i = 0; i < n; i++) {
				StringTokenizer s = new StringTokenizer(br.readLine());
				String[] a = new String[5];
				for (int j = 0; j < a.length; j++) {
					a[j] = s.nextToken();
				}
				Arrays.sort(a);
				String comb = a[0] + a[1] + a[2] + a[3] + a[4];
				if (!data.containsKey(comb)) {
					data.put(comb, 1);
				} else {
					data.put(comb, data.remove(comb) + 1);
				}
				if (data.get(comb) > max) {
					max = data.get(comb);
					pop = comb;
				} else if (data.get(comb) == max && comb.equals(pop))
					max += data.get(comb);
			}
			int ans = 0;
			Enumeration<String> keys = data.keys();
			while (keys.hasMoreElements()) {
				String cur = keys.nextElement();
				if (data.get(cur) == max)
					ans += data.get(cur);
			}
			System.out.println(ans);
		}

	}

}
