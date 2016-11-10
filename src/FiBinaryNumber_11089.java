import java.io.*;
import java.util.*;

public class FiBinaryNumber_11089 {

	static int[] fib;
	static long[] rep;

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		fib = new int[45];
		rep = new long[45];
		rep[0] = 1;
		rep[1] = 1;
		for (int i = 2; i < rep.length; i++) {
			rep[i] = rep[i-1] << 1;
		}
		calculateFib(44);
//		System.out.println(calculateFib(44));
//		System.out.println(Arrays.toString(fib));
//		System.out.println(Arrays.toString(rep));
		int t = new Integer(br.readLine());
		while (t-- > 0) {
			int n = new Integer(br.readLine());
			long ans = 0;
			while (n > 0) {
				int index = Arrays.binarySearch(fib, 1, fib.length - 1, n);
				if (index < 0) {
					index++;
					index *= -1;
					index--;
				}
				ans |= rep[index];
//				System.out.println(fib[index]);
				n -= fib[index];
			}
			System.out.println(Long.toBinaryString(ans));
		}

	}

	public static int calculateFib(int no) {
		if (no == 0 || no == 1) {
			return fib[no] = 1;
		}
		if (fib[no] != 0)
			return fib[no];
		return fib[no] = calculateFib(no - 1) + calculateFib(no - 2);

	}

}
