import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class RelationalOperator_11172 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = new Integer(br.readLine());
		while(t > 0){
			StringTokenizer s = new StringTokenizer(br.readLine());
			int a = new Integer(s.nextToken());
			int b = new Integer(s.nextToken());
			if(a > b)
				System.out.println(">");
			else{
				if(a < b)
					System.out.println("<");
				else
					System.out.println("=");
			}
			t--;
		}
		
	}

}
