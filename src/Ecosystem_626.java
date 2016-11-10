import java.io.*;
import java.util.*;

public class Ecosystem_626 {
	
	static boolean [][] map;
	static boolean [] visited;
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			int n = new Integer(br.readLine());
			map = new boolean[n][n];
			for (int i = 0; i < map.length; i++) {
				StringTokenizer s = new StringTokenizer(br.readLine());
				for (int j = 0; j < map[i].length; j++) {
					if(s.nextToken().equals("1"))
						map[i][j] = true;
				}
			}
//			visited = new boolean[n];
//			for (int i = 0; i < n; i++) {
//				if(!visited[i])
//					dfs(i);
//			}
			int count = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					for (int k = 0; k < n; k++) {
						if((j>i && k > j) || (i > j && j > k)){
							if(map[i][j] && map[j][k] && map[k][i]){
								count++;
								System.out.println((i+1) + " " + (j+1) + " " + (k+1));
							}
						}
					}
				}
			}
			System.out.println("total:" + count + "\n");
			if(!br.ready())
				break;
		}
		
	}
	
//	public static void dfs(int src){
//		visited[src] = true;
//		for (int i = 0; i < map[src].length; i++) {
//			if(!visited[i])
//				dfs(i);
//		}
//	}

}
