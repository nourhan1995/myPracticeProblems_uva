import java.io.*;
import java.util.*;

// to be answered
public class FrequentValues_11235 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String line = br.readLine();
			if (line.equals("0"))
				break;
			StringTokenizer s1 = new StringTokenizer(line);
			int N = new Integer(s1.nextToken());
			int q = new Integer(s1.nextToken());
			int n = 1;
			while (n < N)
				n <<= 1;
			int[] array = new int[n + 1];
			StringTokenizer s = new StringTokenizer(br.readLine());
			int pre = new Integer(s.nextToken());
			int occ = 1;
			int j = 1;
			for (int i = 2; i <= N; i++) {
				int cur = new Integer(s.nextToken());
				if(cur == pre)
					occ++;
				else{
					pre = cur;
					while(j < i){
						array[j] = occ;
						j++;
					}
					occ = 1;
				}
			}
			while(j <= N){
				array[j] = occ;
				j++;
			}
//			System.out.println(Arrays.toString(array));
			SegmentTree sTree = new SegmentTree(n, array);
			for (int i = 0; i < q; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
//				System.out.println(sTree.query(new Integer(st.nextToken()), new Integer(st.nextToken())).freq);
			}
		}

	}

	static class Node {
		int max, freq;

		Node(int max, int freq) {
			this.max = max;
			this.freq = freq;
		}
	}

	static class SegmentTree {

		int N, array[];
		int sTree[];
		
		SegmentTree(int N, int [] array){
			this.N = N;
			this.array = array;
			sTree = new int [N << 1];
			build(1, 1, N);
		}

		void build(int node, int b, int e) {
			if(b == e){
				sTree[node] = array[b];
				return;
			}
			int mid = (b+e) >> 1;
			build(node << 1, b, mid);
			build((node << 1) + 1, mid + 1, e);
		}

//		Node query(int l, int r) {
//			return query(1, 1, N, l, r);
//		}
//
//		Node query(int node, int b, int e, int l, int r) {
//		}

	}

}
