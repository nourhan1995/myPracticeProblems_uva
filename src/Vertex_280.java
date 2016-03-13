import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Vertex_280 {

	static boolean [] visited;
	static boolean [][] map;

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter p = new PrintWriter(new OutputStreamWriter(System.out));
		String input = "";
		while(true){
			int n = new Integer(br.readLine());
			if(n == 0)
				break;
			visited = new boolean[n];
			map = new boolean [n][n];
			String line = "";
			while(!(line = br.readLine()).equals("0")){
				StringTokenizer s = new StringTokenizer(line);
				int start = new Integer(s.nextToken()) - 1;
				while(s.hasMoreTokens()){
					int cur = new Integer(s.nextToken()) - 1;
					if(cur != -1){
						map[start][cur] = true;
					}else
						break;
				}
			}
			StringTokenizer s = new StringTokenizer(br.readLine());
			int m = new Integer(s.nextToken());
			for (int i = 0; i < m; i++) {
				Arrays.fill(visited, false);
				dfs(new Integer(s.nextToken()) - 1);
				int c = 0;
				ArrayList<Integer> unVisited = new ArrayList<>();
				for (int j = 0; j < visited.length; j++) {
					if(!visited[j]){
						c++;
						unVisited.add(j+1);
					}
				}
				StringBuilder res = new StringBuilder();
//				System.out.println(unVisited.size());
				res.append(c);
				if(unVisited.size() != 0 )
					res.append(" ");
				for (int j = 0; j < unVisited.size(); j++) {
//					res.append("hi");
					res.append(unVisited.get(j));
//					p.print(unVisited.get(j));
					if(j != unVisited.size()-1)
						res.append(" ");
//					else
//						p.print(" ");
				}
				p.printf(res+"\n");

			}
		}
		p.flush();
		p.close();

	}

	public static void dfs(int src){
		for (int i = 0; i < map[src].length; i++) {
			if(map[src][i] && !visited[i]){
				visited[i] = true;
				dfs(i);
			}
		}
	}

}
