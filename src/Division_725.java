import java.util.*;
import java.io.*;

public class Division_725 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int c = -1;
		while (true) {
			int count = 0;
			int N = new Integer(br.readLine());
			if (N == 0)
				break;
			else {
				c++;
				if(c != 0)
					System.out.println();
				for (int fghij = 1234; fghij <= 98765; fghij++) {
					int abcde = fghij * N;
					if ((abcde + "").length() > 5)
						break;
					int used = 0;
					if (fghij < 10000)
						used = 1;
					int tmp = abcde;
					while (tmp != 0) {
						used |= 1 << (tmp % 10);
						tmp /= 10;
					}
					tmp = fghij;
					while (tmp != 0) {
						used |= 1 << (tmp % 10);
						tmp /= 10;
					}
					if (used == (1 << 10) - 1) {
						System.out.printf("%05d / %05d = %d\n", abcde, fghij, N);
						count++;
					}
				}
				if (count == 0)
					System.out.print("There are no solutions for " + N + ".\n");
			}
		}

	}

}
