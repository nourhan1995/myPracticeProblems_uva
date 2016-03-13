import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// to be completed
public class DartAMania_735 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int [] a = new int [3];
		while(true){
			int c = 0, p = 0;
			int n = new Integer(br.readLine());
			if(n <= 0)
				break;
			for (int i = 0; i <= 60; i++) {
				for (int j = 0; j <= 60; j++) {
					for (int j2 = 0; j2 <= 60; j2++) {
						if(n-i-j-j2 == 0){
							c++;
							a[0] = i;
							a[1] = j;
							a[2] = j2;
							Arrays.sort(a);
							while(nextPerm(a))
								p++;
						}
					}
				}
			}
			if(c == 0)
				System.out.println("THE SCORE OF " + n + " CANNOT BE MADE WITH THREE DARTS.");
			else{
				System.out.println("NUMBER OF COMBINATIONS THAT SCORES " + n + " IS " + c + ".");
				System.out.println("NUMBER OF PERMUTATIONS THAT SCORES " + n + " IS " + p + ".");
			}
			StringBuilder res = new StringBuilder();
			for (int i = 0; i < 69; i++) {
				res.append("*");
			}
			System.out.println(res);
		}
		System.out.println("END OF OUTPUT");
		
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
