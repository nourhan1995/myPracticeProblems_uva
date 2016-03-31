import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boxes_11003 {
	
	static int n;
	static int [] weight, load;
	static int [][] memo;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			n = new Integer(br.readLine());
			if(n == 0)
				break;
			weight = new int [n];
			load = new int [n];
			for (int i = 0; i < n; i++) {
				StringTokenizer s = new StringTokenizer(br.readLine());
				weight[i] = new Integer(s.nextToken());
				load[i] = new Integer(s.nextToken());
			}
//			Arrays.sort(boxes);
			memo = new int[n][30001];
			for (int i = 0; i < memo.length; i++) {
				Arrays.fill(memo[i], -1);
			}
			System.out.println(dp(0, 30000));
		}
		
	}
	
	public static int dp(int curItem, int weightLeft){
		if(curItem == n || weightLeft == 0)
			return 0;
		if(memo[curItem][weightLeft] != -1)
			return memo[curItem][weightLeft];
		if(weight[curItem] > weightLeft)
			return memo[curItem][weightLeft] = dp(curItem+1, weightLeft);
		return memo[curItem][weightLeft] = Math.max(dp(curItem + 1, Math.min(load[curItem], weightLeft - weight[curItem])) + 1, dp(curItem+1, weightLeft));
	}

}
