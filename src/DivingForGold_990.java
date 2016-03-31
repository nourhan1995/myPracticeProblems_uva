import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class DivingForGold_990 {

	static int t, w, n, count;
	static int[] depths, value;
	static int[][] memo;
	static boolean taken[];

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		PrintWriter p = new PrintWriter(new OutputStreamWriter(System.out));
		while (br.ready()) {
			StringTokenizer s = new StringTokenizer(br.readLine());
			t = new Integer(s.nextToken());
			w = new Integer(s.nextToken());
			n = new Integer(br.readLine());
			depths = new int[n];
			value = new int[n];
			memo = new int[n][t+1];
			taken = new boolean [n];
			count = 0;
			for (int i = 0; i < memo.length; i++) {
				Arrays.fill(memo[i], -1);
			}
			for (int i = 0; i < n; i++) {
				StringTokenizer s1 = new StringTokenizer(br.readLine());
				depths[i] = new Integer(s1.nextToken());
				value[i] = new Integer(s1.nextToken());
			}
			System.out.println(dp(0, t));
			print(0, t);
			for (int i = 0; i < taken.length; i++) {
				if(taken[i])
					count++;
			}
			System.out.println(count);
			for (int i = 0; i < taken.length; i++) {
				if(taken[i])
					System.out.println(depths[i] + " " + value[i]);
			}
			br.readLine();
			if(!br.ready())
				break;
			System.out.println();
		}

	}
	
	public static int dp(int curItem, int remTime){
		
		if(curItem == n || remTime == 0)
			return 0;
		if(memo[curItem][remTime] != -1)
			return memo[curItem][remTime];
		int totalTime = w * depths[curItem] + 2*w*depths[curItem];
		if(totalTime > remTime)
			return memo[curItem][remTime] = dp(curItem + 1,remTime);
		int take = dp(curItem + 1, remTime - totalTime) + value[curItem];
		int leave = dp(curItem+1, remTime);
		return memo[curItem][remTime] = Math.max(take, leave);
		
	}
	
	public static void print(int curItem, int remTime){
		if(curItem == n || remTime == 0)
			return;
		int optimal = dp(curItem, remTime);
		int time = w * depths[curItem] + 2*w*depths[curItem];
		if(time <= remTime && optimal == dp(curItem + 1, remTime - time) + value[curItem]){
			taken[curItem] = true;
			print(curItem + 1, remTime - time);
		}else{
			taken[curItem] = false;
			print(curItem + 1, remTime);
		}
	}

}
