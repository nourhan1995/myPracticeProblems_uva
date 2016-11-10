import java.util.*;
import java.io.*;

public class AddAll_10954 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			int N = new Integer(br.readLine());
			if(N == 0)
				break;
			StringTokenizer s = new StringTokenizer(br.readLine());
			PriorityQueue<Integer> pq = new PriorityQueue<>();
			while(s.hasMoreTokens())
				pq.add(new Integer(s.nextToken()));
			int cost = 0;
			while(!pq.isEmpty() && pq.size() != 1){
				int tmp = pq.remove() + pq.remove();
				cost += tmp;
				pq.add(tmp);
			}
			System.out.println(cost);
		}
		
	}

}
