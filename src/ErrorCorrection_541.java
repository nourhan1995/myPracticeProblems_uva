import java.util.*;
import java.io.*;

public class ErrorCorrection_541 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			int n = new Integer(br.readLine());
			if(n == 0)
				break;
			int [][] parity = new int [n][n];
			int rows [] = new int [n];
			int columns [] = new int [n];
			for (int i = 0; i < parity.length; i++) {
				StringTokenizer s = new StringTokenizer(br.readLine());
				for (int j = 0; j < parity[i].length; j++) {
					parity[i][j] = new Integer(s.nextToken());
					rows[i] += parity[i][j];
					columns[j] += parity[i][j];
				}
			}
			int cc = 0;
			int x = -1;
			int y = -1;
			for (int i = 0; i < columns.length; i++) {
				if(columns[i] % 2 != 0){
					cc++;
					if(cc == 1)
						y = i;
				}
			}
			if(cc > 1)
				System.out.println("Corrupt");
			else{
				int cr = 0;
				for (int i = 0; i < rows.length; i++) {
					if(rows[i] % 2 != 0){
						cr++;
						if(cr == 1)
							x = i;
					}
				}
				if(cr > 1 || (cr == 1 && cc == 0) || (cr == 0 && cc == 1))
					System.out.println("Corrupt");
				else{
					if(cr == 1 && cc == 1)
						System.out.println("Change bit (" + (x+1) + "," + (y+1) + ")");
					else
						if(cr == 0 && cc == 0)
							System.out.println("OK");
				}
			}
		}
		
	}

}
