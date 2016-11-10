import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class WordTransformation_429 {

	static class Node implements Comparable<Node> {
		int n, w;

		public Node(int n, int w) {
			this.n = n;
			this.w = w;
		}

		@Override
		public int compareTo(Node o) {
			// TODO Auto-generated method stub
			if (w != o.w)
				return w - o.w;
			return n - o.n;
		}
	}

	static Hashtable<String, Integer> map;
	static boolean[] edges[];
	static int[] visited;
	static int src, end;
	static BufferedReader br;

	public static void main(String[] args) throws NumberFormatException, IOException {

		br = new BufferedReader(new InputStreamReader(System.in));
		int t = new Integer(br.readLine());
//		StringTokenizer s = new StringTokenizer(br.readLine());
		while (t-- > 0) {
			readCase();
			fillGrid();
			readPairs();
			if(t != 0)
				System.out.println();
//			if(!br.ready())
//				break;
		}

	}
	
	public static void readCase() throws IOException{
		map = new Hashtable<>();
		StringTokenizer s = new StringTokenizer(br.readLine());
		while(!s.hasMoreTokens())
			s = new StringTokenizer(br.readLine());
		String cur = s.nextToken();
		int i = 0;
		while(!cur.equals("*")){
			map.put(cur, i);
			i++;
			cur = br.readLine();
		}
	}
	
	public static void fillGrid(){
		edges = new boolean[map.size()][map.size()];
		Enumeration<String> keys = map.keys();
		while (keys.hasMoreElements()) {
			Enumeration<String> other = map.keys();
			String now = keys.nextElement();
			int u = map.get(now);
			while (other.hasMoreElements()) {
				String tmp = other.nextElement();
				if (!tmp.equals(now) && differ(now, tmp) == 1) {
					int v = map.get(tmp);
					edges[u][v] = true;
					edges[v][u] = true;
				}
			}
		}
	}
	
	public static void readPairs() throws IOException{
		String line;
		while(br.ready() && !(line = br.readLine()).equals("")){
			StringTokenizer s = new StringTokenizer(line);
			visited = new int[map.size()];
			String start = s.nextToken();
			String last = s.nextToken();
			src = map.get(start);
			end = map.get(last);
			bfs(src);
			System.out.println(start + " " + last + " " + visited[end]);
//			line = br.readLine();
//			s = new StringTokenizer(line);
//			if(!br.ready())
//				break;
		}
	}

	public static void bfs(int src) {
		PriorityQueue<Node> q = new PriorityQueue<>();
		q.add(new Node(src, 0));
		while (!q.isEmpty()) {
			Node cur = q.poll();
			visited[cur.n] = cur.w;
			if (cur.n == end)
				break;
			for (int i = 0; i < edges[cur.n].length; i++) {
				if (edges[cur.n][i] && visited[i] == 0)
					q.add(new Node(i, cur.w + 1));
			}
		}
	}

	public static int differ(String s1, String s2) {
		int c = 0;
		int size = Math.min(s1.length(), s2.length());
		for (int i = 0; i < size; i++) {
			if (s1.charAt(i) != s2.charAt(i))
				c++;
		}
		return c + Math.abs(s1.length() - s2.length());
	}

}
