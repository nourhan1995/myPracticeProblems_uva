import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BoxOfTricks_591 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int k = 1;
		while(true){
			int n = new Integer(br.readLine());
			if(n == 0){
//				System.out.println();
//				System.out.println();
				break;
			}
			int a [] = new int [n];
			int bricks = 0;
			StringTokenizer s = new StringTokenizer(br.readLine());
			for (int i = 0; i < a.length; i++) {
				a[i] = new Integer(s.nextToken());
				bricks += a[i];
			}
			int size = bricks / n;
			int count = 0;
			for (int i = 0; i < a.length; i++) {
				if(a[i] > size)
					count += a[i] - size;
			}
			System.out.println("Set #" + k);
			k++;
			System.out.println("The minimum number of moves is " + count + ".");
			System.out.println();
		}
		
	}

}
