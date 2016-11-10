import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// runtime error received
public class AverageSpeed_10281 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String t = "00:00:00";
		int speed = 0;
		while(true){
			String input [] = br.readLine().split(" ");
//			System.out.println(Arrays.toString(input));
			if(input.length == 1){
				String [] time = t.split(":");
//				System.out.println(t);
				int h = new Integer(time[0])*3600 + (new Integer(time[1])) * 60 + (new Integer(time[2]));
				String cur [] = input[0].split(":");
				int c = (new Integer(cur[0]))*3600 + (new Integer(cur[1])) * 60 + (new Integer(cur[2]));
				double res = (double) ((double) (c - h)/3600) * speed ;
//				System.out.printf("%.2f", res);
				System.out.printf(input[0] + " %.2f km\n" ,res);
			}else{
				t = input[0];
				speed = new Integer(input[1]);
			}
		}
		
	}

}
