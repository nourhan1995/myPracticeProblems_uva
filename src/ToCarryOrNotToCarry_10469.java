import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ToCarryOrNotToCarry_10469 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(br.ready()){
			StringTokenizer s = new StringTokenizer(br.readLine());
			int a = new Integer(s.nextToken());
			int b = new Integer(s.nextToken());
			int c = a ^ b;
			System.out.println(c);
		}
		
	}

}
