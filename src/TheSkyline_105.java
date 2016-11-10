import java.util.*;
import java.io.*;

public class TheSkyline_105 {
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int [] buildings = new int [20010];
		int start = (int) 1e6;
		while(br.ready()){
			String line = br.readLine();
			if(line.isEmpty())
				break;
			StringTokenizer s = new StringTokenizer(line/*br.readLine()*/);
			int left = new Integer(s.nextToken());
			int height = new Integer(s.nextToken());
			int right = new Integer(s.nextToken());
			if(start == (int) 1e6)
				start = left;
			for (int i = left; i < right; i++) {
				if(buildings[i+10000] < height)
					buildings[i+10000] = height;
			}
		}
//		System.out.println(Arrays.toString(buildings));
		int curHeight = 0;
		int n = 0;
		for (int i = start + 10000; i < buildings.length; i++) {
			if(curHeight != buildings[i]){
				curHeight = buildings[i];
				if(n != 0)
					System.out.print(" ");
				System.out.print((i - 10000) + " " + buildings[i]);
				n++;
			}
		}
		System.out.println();
		
	}

}
