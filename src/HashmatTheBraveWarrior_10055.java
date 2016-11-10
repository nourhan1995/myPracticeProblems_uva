import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HashmatTheBraveWarrior_10055 {
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String line = " ";
		while(br.ready()){
			StringTokenizer s = new StringTokenizer(br.readLine());
			long a = new Long(s.nextToken());
			long b = new Long(s.nextToken());
			System.out.println(Math.abs(b - a));
		}
		
	}

}
