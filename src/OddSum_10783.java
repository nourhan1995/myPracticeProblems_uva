import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class OddSum_10783 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = new Integer(br.readLine());
		int c = 1;
		while(t > 0){
			int first = new Integer(br.readLine());
			int second = new Integer(br.readLine());
			int sum = 0;
			for (int i = first; i <= second; i++) {
				if(i % 2 == 1)
					sum += i;
			}
			System.out.println("Case " + c + ": " + sum);
			c++;
			t--;
		}
		
	}

}
