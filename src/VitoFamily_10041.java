import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class VitoFamily_10041 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = new Integer(br.readLine());
		while(t > 0){
			StringTokenizer s = new StringTokenizer(br.readLine());
			int n = new Integer(s.nextToken());
			int [] values = new int [n];
			for (int i = 0; i < values.length; i++) {
				values[i] = new Integer(s.nextToken());
			}
			Arrays.sort(values);
			int sum = 0;
			int median_index = values.length / 2;
			for (int i = 0; i < values.length; i++) {
				if(i != median_index){
					sum += Math.abs(values[i] - values[median_index]);
				}
			}
			System.out.println(sum);
			t--;
		}
		
	}

}
