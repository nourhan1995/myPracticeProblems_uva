import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class ANodeTooFar_336 {

	static class Node {
		int node, ttl;

		public Node(int node, int ttl) {
			this.node = node;
			this.ttl = ttl;
		}
	}

	static boolean[] map[], visited;
	static Hashtable<String, Integer> mappings;
	static int n, src, c;
	static LinkedList<Node> q;

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int k = 1;
		while (true) {
			StringTokenizer s = new StringTokenizer(br.readLine());
			while (!s.hasMoreTokens())
				s = new StringTokenizer(br.readLine());
			n = new Integer(s.nextToken());
			if (n == 0)
				break;
			int i = 0;
			map = new boolean[31][31];
			mappings = new Hashtable<>();
			while (n-- > 0) {
				while (!s.hasMoreTokens())
					s = new StringTokenizer(br.readLine());
				String u = s.nextToken();
				String v = s.nextToken();
				if (!mappings.containsKey(u)) {
					mappings.put(u, i);
					i++;
				}
				if (!mappings.containsKey(v)) {
					mappings.put(v, i);
					i++;
				}
				map[mappings.get(u)][mappings.get(v)] = true;
				map[mappings.get(v)][mappings.get(u)] = true;
			}
			s = new StringTokenizer(br.readLine());
			while(!s.hasMoreTokens())
				s = new StringTokenizer(br.readLine());
			int node = new Integer(s.nextToken());
			int ttl = new Integer(s.nextToken());
			
			while(true){
				
				if(node == 0 && ttl == 0)
					break;
				visited = new boolean[mappings.size()];
				c = 0;
				if (mappings.containsKey("" + node)) {
					src = mappings.get("" + node);
					bfs(ttl);
				}
				for (int j = 0; j < visited.length; j++) {
					if (!visited[j])
						c++;
				}
				System.out.println("Case " + k + ": " + c + " nodes not reachable from node " + node + " with TTL = " + ttl + ".");
				k++;
				while(!s.hasMoreTokens())
					s = new StringTokenizer(br.readLine());
				node = new Integer(s.nextToken());
				ttl = new Integer(s.nextToken());
			}

		}

	}

	public static void bfs(int ttl) {
		q = new LinkedList<>();
		q.add(new Node(src, ttl));
		while (!q.isEmpty()) {
			Node cur = q.poll();
			visited[cur.node] = true;
			if (cur.ttl != 0) {
				for (int i = 0; i < map[cur.node].length; i++) {
					if (map[cur.node][i] && !visited[i])
						q.add(new Node(i, cur.ttl - 1));
				}
			}
		}
	}

}
