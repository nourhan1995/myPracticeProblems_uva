import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class BackToHighSchoolPhysics_10071 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(br.ready()){
			StringTokenizer s = new StringTokenizer(br.readLine());
			int v = new Integer(s.nextToken());
			int t = new Integer(s.nextToken());
			System.out.println(v*2*t);
		}
		
	}

}
