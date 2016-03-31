import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SuperSale_10130 {
	
	static int [] prices, weights;
	static int M, W, G, n;
	static int [][] memo;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = new Integer(br.readLine());
		while(t-- > 0){
			int sum = 0;
			n = new Integer(br.readLine());
			prices = new int [n];
			weights = new int [n];
			for (int i = 0; i < n; i++) {
				StringTokenizer s = new StringTokenizer(br.readLine());
				prices[i] = new Integer(s.nextToken());
				weights[i] = new Integer(s.nextToken());
			}
			G = new Integer(br.readLine());
			for (int i = 0; i < G; i++) {
				W = new Integer(br.readLine());
				memo = new int[n][W+1];
				for (int j = 0; j < memo.length; j++) {
					Arrays.fill(memo[j], -1);
				}
				sum += dp(0, W);
			}
			System.out.println(sum);
		}
		
	}
	
	public static int dp(int curItem, int remW){
		if(curItem == n || remW == 0)
			return 0;
		if(memo[curItem][remW] != -1)
			return memo[curItem][remW];
		if(weights[curItem] > remW)
			return memo[curItem][remW] = dp(curItem + 1, remW);
		int take = prices[curItem] + dp(curItem+1, remW - weights[curItem]);
		int leave = dp(curItem+1, remW);		
		return memo[curItem][remW] = Math.max(take, leave);
	}

}
