import java.io.*;
import java.util.*;

public class DecodeTheTape_10878 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder res = new StringBuilder();
		while (true) {
			int ans = 0;
			String line = br.readLine();
			if (line.charAt(0) != '_') {
				for (int i = 0; i < line.length(); i++) {
					if (line.charAt(i) == ' ' || line.charAt(i) == 'o') {
						ans <<= 1;
						ans |= (line.charAt(i) == 'o') ? 1: 0;
					}
				}
				res.append("" + ((char) ans));
			}
			if (!br.ready())
				break;
		}
		System.out.print(res.toString());

	}

}
