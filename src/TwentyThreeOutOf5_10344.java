import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class TwentyThreeOutOf5_10344 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char [] c = {'+', '-', '*'};
		while(true){
			int [] a = new int [5];
			String input = br.readLine();
			if(input.equals("0 0 0 0 0"))
				break;
			StringTokenizer s = new StringTokenizer(input);
			for (int i = 0; i < a.length; i++) {
				a[i] = new Integer(s.nextToken());
			}
			Arrays.sort(a);
			boolean flag = false;
			do {
				for (int i = 0; i < c.length; i++) {
					for (int j = 0; j < c.length; j++) {
						for (int j2 = 0; j2 < c.length; j2++) {
							for (int k = 0; k < c.length; k++) {
								long res1 = calculate(c[i], a[0], a[1]);
								long res2 = calculate(c[j], res1, a[2]);
								long res3 = calculate(c[j2], res2, a[3]);
								long res = calculate(c[k], res3, a[4]);
//								long res = calculate(c[k], calculate(c[j2], calculate(c[j], calculate(c[i], a[0], a[1]), a[2]), a[3]), a[4]);
//								System.out.println(res);
								if(res == 23){
									flag = true;
									System.out.println("Possible");
									break;
								}
							}
							if(flag)
								break;
						}
						if(flag)
							break;
					}
					if(flag)
						break;
				}
				if(flag)
					break;
			} while (nextPerm(a));
			if(!flag)
				System.out.println("Impossible");
		}
		
	}
	
	public static long calculate(char c, long x, long y){
		switch(c){
		case '+': return x + y;
		case '-': return x - y;
		case '*': return x * y;
		}
		return -1;
	}
	
	public static boolean nextPerm(int[] arr){
		int length = arr.length;
		int i = length - 2;
		for (; i >= 0; i--) {
			if (arr[i] < arr[i+1]){
				break;
			}
		}

		if (i == -1)
			return false;

		for (int j = length - 1; j > i; j--) {
			if (arr[j] > arr[i]){
				int tmp = arr[j];
				arr[j] = arr[i];
				arr[i] = tmp;
				break;
			}
		}

		int s = i+1;
		int e = length -1;

		while (s < e){
			int tmp = arr[s];
			arr[s] = arr[e];
			arr[e] = tmp;
			s++;
			e--;
		}

		return true;
	}
	
}
