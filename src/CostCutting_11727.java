import java.util.*;
import java.io.*;

public class CostCutting_11727 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = new Integer(br.readLine());
		int c = 1;
		while(t-- > 0){
			int max = 0;
			int min = (int) 1e9;
			StringTokenizer s = new StringTokenizer(br.readLine());
			int a [] = new int [3];
			for (int i = 0; i < 3; i++) {
				a[i] = new Integer(s.nextToken());
				if(max < a[i])
					max = a[i];
				if(min > a[i])
					min = a[i];
			}
			int val = -1;
			for (int i = 0; i < a.length; i++) {
				if(a[i] != max && a[i] != min){
					val = a[i];
					break;
				}
			}
			if(val != -1)
				System.out.println("Case " + c + ": " + val);
			c++;
		}
		
	}

}
