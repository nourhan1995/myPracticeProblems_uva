import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class JillRidesAgain_507 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int t = new Integer(br.readLine());
		int c = 1;
		while(t-- > 0){
			int r = new Integer(new StringTokenizer(br.readLine()).nextToken());
			if(r < 0){
				System.out.println("Route " + c + " has no nice parts");
				c++;
				continue;
			}
			int [] a = new int[r];
			for (int i = 1; i < a.length ; i++) {
				a[i] = new Integer(new StringTokenizer(br.readLine()).nextToken());
			}
			int sum = 0, res = 0, max_i = 0, max_j = 0;
			int cur_start = 0, j = 0;
			for (j = 0; j < a.length; j++) {
				sum += a[j];
				if(sum > res || (sum == res && j - cur_start > max_j - max_i)){
					res = sum;
					max_i = cur_start;
					max_j = j;					
				}
				if(sum < 0){
					sum = 0;
					cur_start = j;
				}
			}
			if(res > 0 && r > 0)
				out.println("The nicest part of route " + c + " is between stops " + (max_i + 1) + " and " + (max_j + 1));
			else
				out.println("Route " + c + " has no nice parts");
//			if(t != 0)
//				System.out.println();
			c++;
		}
		out.flush();
		out.close();
		
	}

}
