import java.io.*;
import java.util.*;

public class BrokenKeyboard_11988 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			boolean home = false;
			LinkedList<String> l = new LinkedList<>();
			char [] c = br.readLine().toCharArray();
			StringBuilder cur = new StringBuilder();
			for (int i = 0; i < c.length; i++) {
				if(c[i] == '['){
					if(home)
						l.addFirst(cur.toString());
					else
						l.addLast(cur.toString());
					cur = new StringBuilder();
					home = true;
				}else{
					if(c[i] == ']'){
						if(home)
							l.addFirst(cur.toString());
						else
							l.addLast(cur.toString());
						home = false;
						cur = new StringBuilder();
					}else{
						cur.append(c[i]);
					}
				}
			}
			if(home)
				l.addFirst(cur.toString());
			else
				l.addLast(cur.toString());
			StringBuilder res = new StringBuilder();
			while(!l.isEmpty())
				res.append(l.poll());
			System.out.println(res.toString());
			if(!br.ready())
				break;
		}
//		while (true) {
//			String line = br.readLine();
//			boolean home = false;
//			// Stack<Character> s = new Stack<>();
//			StringBuilder res = new StringBuilder();
//			LinkedList<StringBuilder> l = new LinkedList<>();
//			for (int i = 0; i < line.length(); i++) {
//				if (line.charAt(i) == '[') {
//					if (home) {
//						l.addFirst(res);
////						res = new StringBuilder();
//					} else {
//						// if(res.length() != 0){
//						l.addLast(res);
//						// }
//					}
//					res = new StringBuilder();
//					home = true;
//				} else {
//					if (line.charAt(i) == ']') {
//						if (home) {
//							l.addFirst(res);
////							res = new StringBuilder();
//						} else {
//							l.addLast(res);
////							res = new StringBuilder();
//						}
//						res = new StringBuilder();
//						home = false;
//					} else {
//						res.append(line.charAt(i));
//					}
//				}
//			}
//
//			if (home) {
//				if (res.length() != 0)
//					l.addFirst(res);
//			} else {
//				if (res.length() != 0)
//					l.addLast(res);
//			}
//			// System.out.println(l.toString());
//			while (!l.isEmpty()) {
//				System.out.print(l.removeFirst().toString());
//			}
//			System.out.println();
//			if (!br.ready())
//				break;
//		}

	}

}
