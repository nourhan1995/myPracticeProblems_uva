import java.io.*;
import java.util.*;

public class SpanningSubTree_11597 {
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int k = 1;
		while(true){
			int n = new Integer(br.readLine());
			if(n == 0 )
				break;
			System.out.println("Case " + k + ": " + (n/2));
			k++;
		}
		
	}

}
