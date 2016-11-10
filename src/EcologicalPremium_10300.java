import java.util.*;
import java.io.*;

public class EcologicalPremium_10300 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = new Integer(br.readLine());
		while(t-- > 0){
			int n = new Integer(br.readLine());
			int sum = 0;
			for (int i = 0; i < n; i++) {
				StringTokenizer s = new StringTokenizer(br.readLine());
				int area = new Integer(s.nextToken());
				s.nextToken();
				int env = new Integer(s.nextToken());
				sum += area * env;
			}
			System.out.println(sum);
		}
		
	}

}
