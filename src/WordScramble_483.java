import java.util.*;
import java.io.*;

public class WordScramble_483 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (br.ready()) {
			StringTokenizer s = new StringTokenizer(br.readLine());
			while (s.hasMoreTokens()) {
				String cur = s.nextToken();
				for (int i = cur.length() - 1; i >= 0; i--) {
					System.out.print(cur.charAt(i));
				}
				if (s.hasMoreTokens())
					System.out.print(" ");
				else
					System.out.println();
			}
		}

	}

}
