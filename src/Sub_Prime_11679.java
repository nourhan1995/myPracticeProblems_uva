import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Sub_Prime_11679 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = "";
		while(!(s = br.readLine()).equals("0 0")){
			StringTokenizer st = new StringTokenizer(s);
			int B = new Integer(st.nextToken());
			int N = new Integer(st.nextToken());
			int [] banks = new int [B];
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			for (int i = 0; i < banks.length; i++) {
				banks[i] = new Integer(st1.nextToken());
			}
			for (int i = 0; i < N; i++) {
				StringTokenizer s2 = new StringTokenizer(br.readLine());
				int D = new Integer(s2.nextToken());
				int C = new Integer(s2.nextToken());
				int V = new Integer(s2.nextToken());
				banks[D-1] -= V;
				banks[C-1] += V;
			}
			Boolean flag =  true;
			for (int i = 0; i < banks.length; i++) {
				if(banks[i] < 0){
					flag = false;
					break;
				}
			}
			if(flag )
				System.out.println("S");
			else
				System.out.println("N");
		}
		
	}

}
