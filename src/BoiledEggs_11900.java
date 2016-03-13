import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class BoiledEggs_11900 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = new Integer(br.readLine());
		int j = 1;
		while(t-- > 0){
			int c = 0;
			StringTokenizer s1 = new StringTokenizer(br.readLine());
			int n = new Integer(s1.nextToken());
			int p = new Integer(s1.nextToken());
			int q = new Integer(s1.nextToken());
			int sum = 0;
			StringTokenizer s = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; i++) {
				int cur = new Integer(s.nextToken());
				if(p-- > 0 && sum + cur <= q){
					sum += cur;
					c++;
				}else
					break;
			}
			System.out.println("Case " + j++ + ": " + c);
		}
		
	}

}
