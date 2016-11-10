import java.util.*;
import java.io.*;

public class SummingDigits_11332 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			int n = new Integer(br.readLine());
			if(n == 0)
				break;
			while((n+"").length() != 1){
				int sum = 0;
				while(n != 0){
					sum += n % 10;
					n /= 10;
				}
				n = sum;
			}
			System.out.println(n);
		}
		
	}

}
