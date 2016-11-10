import java.util.*;
import java.io.*;

// presentation error
public class ThrowingCardsAwayI_10935 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			int n = new Integer(br.readLine());
			if(n == 0)
				break;
			Queue<Integer> q = new LinkedList<>();
			for (int i = 1; i <= n; i++) {
				q.add(i);
			}
			ArrayList<Integer> res = new ArrayList<>();
			while(q.size() >= 2){
				res.add(q.poll());
				q.add(q.poll());
			}
			System.out.print("Discarded cards:");
			for (int i = 0; !res.isEmpty() && i < res.size(); i++) {
				System.out.print(" " + res.get(i));
				if(i != res.size() - 1)
					System.out.print(", ");
			}
			System.out.println();
			System.out.println("Remaining card: " + q.poll());
			if(!br.ready())
				break;
		}
		
	}

}
