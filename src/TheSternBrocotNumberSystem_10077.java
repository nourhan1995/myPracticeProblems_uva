import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class TheSternBrocotNumberSystem_10077 {

	static class Pair{
		int m, n;
		public Pair(int m, int n){
			this.m = m;
			this.n = n;
		}
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter p = new PrintWriter(new OutputStreamWriter(System.out));
		int i = 1;
		while(true){
			StringBuilder res = new StringBuilder();
			StringTokenizer s1 = new StringTokenizer(br.readLine());
			Pair target = new Pair(new Integer(s1.nextToken()), new Integer(s1.nextToken()));
			if(target.m == 1 && target.n == 1)
				break;
			Pair middle = new Pair(1, 1);
			Pair start = new Pair(0, 1);
			Pair end = new Pair(1, 0);
			double value = (double) target.m / target.n;
			double s = (double) start.m / start.n;
			double e = (double) end.m / end.n;
			double mid = (double) middle.m / middle.n;
			while(s <= e){
				if(middle.m == target.m && middle.n == target.n)
					break;
				else{
					if(value <= mid && value >= s){
						res.append("L");
						end.m = middle.m;
						end.n = middle.n;
						middle.m = end.m + start.m;
						middle.n = end.n + start.n;
						e = (double) end.m / end.n;
						mid = (double) middle.m / middle.n;
					}
					if(value > mid && value <= e){
						res.append("R");
						start.m = middle.m;
						start.n = middle.n;
						middle.m = end.m + start.m;
						middle.n = end.n + start.n;
						s = (double) start.m / start.n;
						mid = (double) middle.m / middle.n;
					}
					
				}
			}
//			System.out.println("case " + i++);
			p.printf(res + "\n");
		}
		p.flush();
		p.close();

	}

}
