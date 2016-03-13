import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Battleships_11953 {
	
	static char [][] map;
	static boolean [][] visited;
	static int [] dx = {1,0};
	static int [] dy = {0,1};
	static int n;
	static boolean alive;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = new Integer(br.readLine());
		int c = 1;
		while(t-- > 0){
			int count = 0;
			n = new Integer(br.readLine());
			map = new char[n][n];
			visited = new boolean[n][n];
			for (int i = 0; i < map.length; i++) {
				String line = br.readLine();
				for (int j = 0; j < map[i].length; j++) {
					map[i][j] = line.charAt(j);
				}
			}
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map[i].length; j++) {
					alive = false;
					if((map[i][j] == '@' || map[i][j] == 'x') && !visited[i][j]){
						if(map[i][j] == 'x')
							alive = true;
						dfs(i,j);
						if(alive)
							count++;
					}else
						visited[i][j] = true;
				}
			}
			System.out.println("Case " + c +": " + count);
			c++;			
		}
		
	}
	
	public static void dfs(int i, int j){
		visited[i][j] = true;
		if(map[i][j] == 'x' && !alive)
			alive = true;
		for (int j2 = 0; j2 < dx.length; j2++) {
			int nexti = dx[j2]+i;
			int nextj = dy[j2]+j;
			if(nexti < n && nextj < n && !visited[nexti][nextj] && (map[nexti][nextj] == 'x' || map[nexti][nextj] == '@')){
				dfs(nexti, nextj);
			}
		}
	}

}
