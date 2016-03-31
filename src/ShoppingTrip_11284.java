import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class ShoppingTrip_11284 {
	
	static class Node implements Comparable<Node>{
		
		int n, w;
		public Node(int n,int w){
			this.n = n;
			this.w = w;
		}
		@Override
		public int compareTo(Node o) {
			// TODO Auto-generated method stub
			return this.w - o.w;
		}
		
	}
	
	static int N, M, DVDs;
	static int []dist;
	static ArrayList<Node> [] map;
	static boolean visited [];
	static int [] shop, price;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = new Integer(br.readLine());
		while(t-- > 0){
			br.readLine();
			String line = br.readLine();
			StringTokenizer s = new StringTokenizer(line);
			System.out.println(line);
			N = new Integer(s.nextToken());
			M = new Integer(s.nextToken());
			map = new ArrayList[N+1];
			for (int i = 0; i < map.length; i++) {
				map[i] = new ArrayList<>();
			}
			dist = new int[N+1];
//			for (int i = 0; i < dist.length; i++) {
				Arrays.fill(dist, -1);
//			}
			for (int i = 0; i < M; i++) {
				StringTokenizer s1 = new StringTokenizer(br.readLine());
				int u = new Integer(s1.nextToken());
				int v = new Integer(s1.nextToken());
				int cost = (int) (100 * (new Double(s1.nextToken())));
				map[u].add(new Node(v, cost));
				map[v].add(new Node(u, cost));
			}
			DVDs = new Integer(br.readLine());
			shop = new int[DVDs];
			price = new int[DVDs];
			for (int i = 0; i < DVDs; i++) {
				StringTokenizer s2 = new StringTokenizer(br.readLine());
				shop[i] = new Integer(s2.nextToken());
				price[i] =(int) (100 * (new Double(s2.nextToken())));
			}
			
		}
		
	}
	
	public static void dijkstra(int s){
		PriorityQueue<Node> q = new PriorityQueue<>();
		q.add(new Node(s, 0));
		while(!q.isEmpty()){
			Node cur = q.poll();
			
		}
	}

}
