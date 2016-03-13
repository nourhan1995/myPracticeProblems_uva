import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

// to be continued
public class MontescoVsCapuleto_10505 {
	
	static boolean [][] map;
	static int [] colour;
	static boolean isBipartite;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = new Integer(br.readLine());
		while(t-- > 0){
			br.readLine();
			int n = new Integer(br.readLine());
			map = new boolean[n][n];
			colour = new int [n];
			Arrays.fill(colour, -1);
			for (int i = 0; i < n; i++) {
				StringTokenizer s = new StringTokenizer(br.readLine());
				int c = new Integer(s.nextToken());
				for (int j = 0; j < c; j++) {
					map[i][(new Integer(s.nextToken())) - 1] = true;				
				}
			}
			
		}
		
	}
	
	public static void bipartite(int s){
		LinkedList<Integer> q = new LinkedList<>();
		colour[s] = 0;
		isBipartite = true;
		while(!q.isEmpty() && isBipartite){
			int u = q.poll();
			for (int i = 0; i < map[u].length; i++) {
				if(map[u][i]){
					if(colour[i] == -1){
						colour[i] = 1 - colour[u];
						q.push(i);
					}else{
						if(colour[i] == colour[u]){
							isBipartite = false;
							break;
						}
					}
				}
				
			}
		}
	}

}
