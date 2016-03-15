import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Network_315 {
	
	static int n, dfs_root, root_children, dfs_number_counter;
	static boolean [][] map;
	static int [] dfs_low, dfs_num, dfs_parent;
	static boolean [] articulation_vertex;	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			n = new Integer(br.readLine());
			if(n == 0)
				break;
			map = new boolean[n][n];
			dfs_low = new int [n];
			dfs_num = new int[n];
			dfs_parent = new int [n];
			dfs_number_counter = 0;
			Arrays.fill(dfs_num, -1);
			Arrays.fill(dfs_low, 0);
			Arrays.fill(dfs_parent, 0);
			Arrays.fill(articulation_vertex, false);
			int i = 0;
			while(true){
				String line = br.readLine();
				if(line.equals("0"))
						break;
				StringTokenizer s = new StringTokenizer(line);
				while(s.hasMoreTokens()){
					int cur = (new Integer(s.nextToken())) - 1;
					map[i][cur] = true;
					map[cur][i] = true;
				}
				i++;
			}
			for (int j = 0; j < n; j++) {
				if(dfs_num [j] == -1){
					dfs_root = j;
					root_children = 0;
					articulationPointAndBridge(j);
					articulation_vertex[dfs_root] = (root_children > 1); 
				}
			}
			int count = 0;
			for (int j = 0; j < articulation_vertex.length; j++) {
				if(articulation_vertex[j])
					count++;
			}
			System.out.println(count);
		}
		
	}
	
	public static void articulationPointAndBridge(int u){
		
//		dfs_low[u] = 
		
	}

}
