import java.util.*;
import java.io.*;

public class AutomaticAnswer_11547 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = new Integer(br.readLine());
		while(t-- > 0){
			int n = new Integer(br.readLine());
			n *= 567;
			n /= 9;
			n += 7492;
			n *= 235;
			n /= 47;
			n -= 498;
			n /= 10;
			System.out.println(Math.abs(n % 10));
		}
		
	}

}
