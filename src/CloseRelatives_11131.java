import java.io.*;
import java.util.*;

public class CloseRelatives_11131 {

	// static PriorityQueue<Integer> pq;
	static Stack<Integer> s;
	static ArrayList<Integer>[] map;

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> input = new ArrayList<>();
		while (true) {
			input.add(br.readLine());
			if (!br.ready())
				break;
		}
		map = new ArrayList[5000];
		for (int i = 0; i < map.length; i++) {
			map[i] = new ArrayList<>();
		}
		Hashtable<String, Integer> nameMappings = new Hashtable<>();
		int k = 0;
		for (int i = 0; i < input.size(); i++) {
			String[] splitted = input.get(i).split(",");
			for (int j = 0; j < splitted.length; j++) {
				if (!nameMappings.containsKey(splitted[j])) {
					nameMappings.put(splitted[j], k++);
				}
				if (j != 0) {
					map[nameMappings.get(splitted[0])].add(nameMappings.get(splitted[j]));
				}
			}
		}
		String[] mappings = new String[k];
		Enumeration<String> keys = nameMappings.keys();
		while (keys.hasMoreElements()) {
			String cur = keys.nextElement();
			mappings[nameMappings.get(cur)] = cur;
		}
//		System.out.println(k);
//		System.out.println(nameMappings.toString());
		s = new Stack<>();
		if (map[0].size() > 1) {
			System.out.println("2\n");
			s.push(0);
			dfsPost(0, 0);
			while (!s.isEmpty()) {
				System.out.println(mappings[s.pop()]);
			}
			System.out.println();
			s.push(0);
			dfsPre(0, 0);
			while (!s.isEmpty()) {
				System.out.println(mappings[s.pop()]);
			}
		}else{
			System.out.println("1\n");
			s.push(0);
			dfsPost(0, 0);
			while (!s.isEmpty()) {
				System.out.println(mappings[s.pop()]);
			}
		}

	}

	public static void dfsPre(int src, int p) {
		// s.push(src);
		for (int i = 0; i < map[src].size(); i++) {
			if (map[src].get(i) != p) {
				s.push(map[src].get(i));
				dfsPre(map[src].get(i), src);
			}
		}
	}

	public static void dfsPost(int src, int p) {
		// s.push(src);
		for (int i = map[src].size() - 1; i >= 0; i--) {
			if (map[src].get(i) != p) {
				s.push(map[src].get(i));
				dfsPost(map[src].get(i), src);
			}
		}
	}

}
