import java.util.*;
import java.io.*;

public class JollyJumpers_10038 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (br.ready()) {
			StringTokenizer s = new StringTokenizer(br.readLine());
			int n = new Integer(s.nextToken());
			boolean [] diff = new boolean[n];
			int [] val = new int [n];
			for (int i = 0; i < val.length; i++) {
				val[i] = new Integer(s.nextToken());
				if(i != 0){
					if(Math.abs(val[i] - val[i-1]) >= 1 && Math.abs(val[i] - val[i-1]) < n)
						diff[Math.abs(val[i] - val[i-1])] = true;
				}
			}
			boolean flag = true;
			for (int i = 1; i < diff.length; i++) {
				if(!diff[i]){
					flag = false;
					break;
				}
			}
			if(flag)
				System.out.println("Jolly");
			else
				System.out.println("Not jolly");
		}

	}

}
