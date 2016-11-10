import java.io.*;
import java.util.*;

public class Lotto_441 {
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int c = 1;
		while(true){
			StringTokenizer s = new StringTokenizer(br.readLine());
			int k = new Integer(s.nextToken());
			if(k == 0)
				break;
			else{
				if(c != 1)
					System.out.println();
			}
			int [] a = new int [k];
			for (int i = 0; i < a.length; i++) {
				a[i] = new Integer(s.nextToken());
			}
			for (int i = 0; i < k-5; i++) {
				for (int j = i+1; j < k-4; j++) {
					for (int j2 = j+1; j2 < k-3; j2++) {
						for (int l = j2+1; l < k-2; l++) {
							for (int l2 = l+1; l2 < k-1; l2++) {
								for (int m = l2+1; m < k; m++) {
									System.out.println(a[i]+" " + a[j] + " " + a[j2] + " " + a[l] + " " + a[l2] + " " + a[m]);
								}
							}
						}
					}
				}
			}
			c++;
		}
		
	}

}
