import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Parking_11364 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = new Integer(br.readLine());
		while(t > 0){
			int n = new Integer(br.readLine());
			int [] pos = new int[n];
			StringTokenizer s = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; i++) {
				pos[i] = new Integer(s.nextToken());
			}
			Arrays.sort(pos);
			System.out.println((pos[pos.length - 1] - pos[0])*2);
			t--;
		}
		
	}

}
