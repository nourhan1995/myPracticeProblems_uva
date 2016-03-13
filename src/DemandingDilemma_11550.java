import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class DemandingDilemma_11550 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = new Integer(br.readLine());
		while(t > 0){
			StringTokenizer s1 = new StringTokenizer(br.readLine());
			int n = new Integer(s1.nextToken());
			int m = new Integer(s1.nextToken());
//			int [] edges = new int[m];
			ArrayList<Integer> connections [] = new ArrayList[m];
			boolean [][] map = new boolean[n][n];
			for (int i = 0; i < connections.length; i++) {
				connections[i] = new ArrayList<>();
			}
			boolean flag = true;
			for (int i = 0; i < n; i++) {
				StringTokenizer s = new StringTokenizer(br.readLine());
				for (int j = 0; j < connections.length; j++) {
					int cur = new Integer(s.nextToken());
					if(cur == 1)
						connections[j].add(i);
				}

			}
			for (int i = 0; i < connections.length; i++) {
				if(connections[i].size() == 2){
					int u = connections[i].get(0);
					int v = connections[i].get(1);
					if(!map[u][v] && !map[v][u]){
						map[u][v] = true;
						map[v][u] = true;
					}else{
						flag = false;
						break;
					}
				}else{
					flag = false;
					break;
				}
			}
			if(flag)
				// we need to apply another check to make sure that there isn't any multiple edges connecting the same nodes
				System.out.println("Yes");
			else
				System.out.println("No");
			t--;
		}

	}

}
