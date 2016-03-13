import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class AllInAll_10340 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(br.ready()){
			StringTokenizer s = new StringTokenizer(br.readLine());
			String sub = s.nextToken();
			String sequence = s.nextToken();
			int i = 0;
			for (int k = 0; k < sequence.length(); k++) {
				if(i < sub.length() && sub.charAt(i) == sequence.charAt(k))
					i++;
			}
			if(i == sub.length())
				System.out.println("Yes");
			else
				System.out.println("No");
		}
		
	}

}
