import java.util.*;
import java.io.*;

public class ICanGuessTheDataStructure_11995 {
	
	static class MyInteger implements Comparable<MyInteger>{
		
		int num;
		public MyInteger(int num){
			this.num = num;
		}
		@Override
		public int compareTo(MyInteger o) {
			// TODO Auto-generated method stub
			return -1*(this.num - o.num);
		}
		
	}
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		while(/*br.ready()*/ (line = br.readLine()).length() != 0){
			int n = new Integer(/*br.readLine()*/line);
			Stack<Integer> s = new Stack<>();
			Queue<Integer> q = new LinkedList<>();
			PriorityQueue<MyInteger> pq = new PriorityQueue<>();
			int [] check = new int [3];
			int count = 0;
			for (int i = 0; i < n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int query = new Integer(st.nextToken());
				int cur = new Integer(st.nextToken());
				if(query == 1){
					s.push(cur);
					q.add(cur);
					pq.add(new MyInteger(cur));
				}else{
					count++;
					if(!s.isEmpty() && s.peek() == cur){
						s.pop();
						check[0]++;
					}
					if(!q.isEmpty() && q.peek() == cur){
						q.poll();
						check[1]++;
					}
					if(!pq.isEmpty() && pq.peek().num == cur){
						pq.remove();
						check[2]++;
					}
				}
			}
			int index = -1;
			int num = 0;
			for (int i = 0; i < check.length; i++) {
				if(check[i] == count){
					num++;
					if(num == 1)
						index = i;
				}
			}
			if(num == 0)
				System.out.println("impossible");
			else{
				if(num == 1){
					switch(index){
					case 0: System.out.println("stack");break;
					case 1: System.out.println("queue");break;
					case 2: System.out.println("priority queue");break;
					}
				}else
					System.out.println("not sure");
			}
			if(!br.ready())
				break;
		}
		
	}

}
