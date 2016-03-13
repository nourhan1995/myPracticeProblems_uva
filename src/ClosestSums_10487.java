import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;


public class ClosestSums_10487 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter p = new PrintWriter(new OutputStreamWriter(System.out));
		int n = 22;
		int c = 1;
		while(true){
			n = new Integer(br.readLine());
			if(n == 0)
				break;
			else{
				int arr [] = new int[n];
				for (int i = 0; i < arr.length; i++) {
					arr[i] = new Integer(br.readLine());
				}
				//Arrays.sort(arr);
				p.println("Case " + c+ ":");
				int m = new Integer(br.readLine());
				for (int i = 0; i < m; i++) {
					//int min = (int) Math.pow(2, 31);
					int min = min = (int)1e9;
					//int min = 1<<31;
					int k = new Integer(br.readLine());
					int sum = 0;
					for (int j = 0; j < arr.length - 1; j++) {
						for (int j2 = j+1; j2 < arr.length; j2++) {
							sum = arr[j] + arr[j2];
							if(Math.abs(sum - k) < Math.abs(min - k)){
								min = sum;
								//System.out.println(arr[j] + "    " + arr[j2]);
							}
						}
					}
					//p.println("Closest sum to " + k + " is " + min + ".");
					p.printf("Closest sum to %d is %d.\n", k, min);
				}
				c++;
			}
		}
		p.flush();
		p.close();

	}

}
