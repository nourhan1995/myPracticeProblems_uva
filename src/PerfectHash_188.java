import java.io.*;
import java.util.*;

public class PerfectHash_188 {
	
	public static void main(String[] args)throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(br.ready()){
			String input = br.readLine();
//			System.out.println(input);
			StringTokenizer s = new StringTokenizer(input);
			ArrayList<Integer> W = new ArrayList<>();
			int c = (int) 1e9;
			while(s.hasMoreTokens()){
				String cur = s.nextToken();
				int w = 0;
				for (int i = 0; i < cur.length(); i++) {
					w <<= 5;
					w += (cur.charAt(i) - 'a') + 1;
				}
				c = Math.min(c, w);
				W.add(w);
			}
			boolean notFound = false;
			int n = W.size();
			int next_c = c;
			while(true){
				notFound = false;
				c = next_c;
				next_c = 0;
				for (int i = 0; i < W.size(); i++) {
					for (int j = 0; j < W.size(); j++) {
						if(i != j){
							if((c/W.get(i))%n == (c/W.get(j))%n){
								notFound = true;
								next_c = Math.max(next_c, Math.min(((c/W.get(i)) +1 ) *W.get(i) ,((c/W.get(j)) +1 ) *W.get(j)));
							}
						}
					}
				}
				if(!notFound)
					break;
			}
			System.out.println(input);
			System.out.println(c + "\n");
//			if(!br.ready() && input.length() == 0)
//				break;
//			System.out.println(W.toString());
		}
		
	}

}
