import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Luggage_10664 {
	
	static ArrayList<Integer> suitcases;
	static int sum;
	static int [][] memo;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = new Integer(br.readLine());
		while(t-- > 0){
			suitcases = new ArrayList<>();
			StringTokenizer s = new StringTokenizer(br.readLine());
			sum = 0;
			while(s.hasMoreTokens()){
				int cur = new Integer(s.nextToken());
				suitcases.add(cur);
				sum += cur;
			}
			if(sum % 2 != 0)
				System.out.println("NO");
			else{
				sum = sum / 2;
				memo = new int [suitcases.size()][sum + 1];
				for (int i = 0; i < memo.length; i++) {
					Arrays.fill(memo[i], -1);
				}
				if(dp(0, sum) != 0)
					System.out.println("YES");
				else
					System.out.println("NO");
			}
		}
		
	}
	
	public static int dp(int curItem, int remWeight){
		if(curItem == suitcases.size() && remWeight == 0)
			return 1;
		if(curItem == suitcases.size() && remWeight != 0)
			return 0;
		if(memo[curItem][remWeight] != -1)
			return memo[curItem][remWeight];
		if(suitcases.get(curItem) > remWeight)
			return memo[curItem][remWeight] = dp(curItem + 1, remWeight);
		return memo[curItem][remWeight] = Math.max(dp(curItem + 1, remWeight - suitcases.get(curItem)), dp(curItem + 1, remWeight));
	}

}
