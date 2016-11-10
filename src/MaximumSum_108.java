import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaximumSum_108 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = new Integer(br.readLine());
		int[][] a = new int[n][n];
		StringTokenizer s = new StringTokenizer(br.readLine());
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				while(!s.hasMoreTokens())
					s = new StringTokenizer(br.readLine());
				a[i][j] = new Integer(s.nextToken());
				if(i > 0)
					a[i][j] += a[i-1][j];
				if(j > 0)
					a[i][j] += a[i][j-1];
				if(i > 0 && j > 0)
					a[i][j] -= a[i-1][j-1];
			}
		}
		int max = (int) -1e9;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				for (int k = i; k < a.length; k++) {
					for (int l = j; l < a.length; l++) {
						int subrect = a[k][l];
						if(i > 0)
							subrect -= a[i-1][l];
						if(j > 0)
							subrect -= a[k][j-1];
						if(i > 0 && j > 0)
							subrect += a[i-1][j-1];
						max = Math.max(max, subrect);
					}
				}
			}
		}
		System.out.println(max);
		
	}

}
