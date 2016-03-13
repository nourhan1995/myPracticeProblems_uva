import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Scarecrow_12405 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = new Integer(br.readLine());
		int t = 1;
		while(T-- > 0){
			int c = 0;
			int n = new Integer(br.readLine());
			String s = br.readLine();
			char [] a = new char[n];
			for (int i = 0; i < s.length(); i++) {
				a[i] = s.charAt(i);
			}
			for (int i = 0; i < a.length; i++) {
				if(a[i] == '.'){
					c++;
					i = i+2;
				}else
					continue;
			}
			System.out.println("Case " + t++ + ": " + c);
		}
		
	}
	
	static class Interval {
		
		int begin, end;
		
		public Interval(int begin, int end){
			this.begin = begin;
			this.end = end;
		}
		
	}

}
