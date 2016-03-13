import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GraphConnectivity_459 {
	
	static boolean [][] map;
	static boolean [] visited;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = new Integer(br.readLine());
		br.readLine();
		while(t > 0){
			char c = br.readLine().charAt(0);
			int n = c - 'A' + 1;
//			System.out.println("n " + n);
			map = new boolean[n][n];
			visited = new boolean[n];
			String line = "";
			while(/*!(line = br.readLine()).equals(" ")*/br.ready()){
				line = br.readLine();
				if(line.isEmpty())
				break;
				// System.out.println("line " + line);
				int u = line.charAt(0) - 'A';
				int v = line.charAt(1) - 'A';
				 //System.out.println("u "+ u + " v " + v);
				map[u][v] = true;
				map[v][u] = true;
			}
			int con = 0;
			// System.out.println(con);
			for (int i = 0; i < visited.length; i++) {
				if(!visited[i]){
					dfs(i);
					con++;
				}
			}
			System.out.println(con/*+"\n"*/);
			t--;
			if(t != 0)
				System.out.println();
			
		}
		
	}
	
	public static void dfs(int s){
		visited[s] = true;
		for (int i = 0; i < map[s].length; i++) {
			if(map[s][i] && !visited[i])
				dfs(i);
		}
	}

}
