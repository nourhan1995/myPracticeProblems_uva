import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// to be corrected
public class TheMonkeyAndTheOiledBamboo_12032 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = new Integer(br.readLine());
		int c = 1;
		while(t-- > 0){
			int n = new Integer(br.readLine());
			int max = 0;
			StringTokenizer s = new StringTokenizer(br.readLine());
			int pre = new Integer(s.nextToken());
			for (int i = 0; i < n-1; i++) {
				int cur = new Integer(s.nextToken());
				max = Math.max(max, cur - pre);
				pre = cur;
			}
			System.out.println("Case " + c + ": " + max);
		}
		
	}

}
