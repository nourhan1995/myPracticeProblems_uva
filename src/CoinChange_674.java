import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CoinChange_674 {
	
	static int M;
	static int [] money = {50, 25, 10, 5, 1};
	static int [][] memo;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		memo = new int[money.length][7490];
		for (int i = 0; i < memo.length; i++) {
			Arrays.fill(memo[i], -1);
		}
		while(br.ready()){
			M = new Integer(br.readLine());
			System.out.println(dp(0, M));
		}
		
	}
	
	public static int dp(int curItem, int remMoney){
		if(remMoney == 0 && curItem != money.length)
			return 1;
		if(curItem == money.length)
			return 0;
		if(memo[curItem][remMoney] != -1)
			return memo[curItem][remMoney];
		if(money[curItem] > remMoney)
			return memo[curItem][remMoney] = dp(curItem + 1, remMoney);
		int take = dp(curItem, remMoney - money[curItem]);
		int leave = dp(curItem + 1, remMoney);
		return memo[curItem][remMoney] = take + leave;
	}

}
