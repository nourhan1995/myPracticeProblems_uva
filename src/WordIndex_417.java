import java.util.*;
import java.io.*;

public class WordIndex_417 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		TreeMap<String, Integer> tree = new TreeMap<>();
		int id = 1;
		for (char i = 'a'; i <= 'z'; i++) {
			tree.put(""+i+"", id++);
		}
		for (char i = 'a'; i <= 'z'; i++) {
			for (char j = (char) (i+1); j <= 'z'; j++) {
				tree.put(""+i+j+"", id++);				
			}
		}
		for (char i = 'a'; i <= 'z'; i++) {
			for (char j = (char) (i+1); j <= 'z'; j++) {
				for (char j2 = (char) (j+1); j2 <= 'z'; j2++) {
					tree.put(""+i+j+j2+"", id++);					
				}				
			}
		}
		for (char i = 'a'; i <= 'z'; i++) {
			for (char j = (char) (i+1); j <= 'z'; j++) {
				for (char j2 = (char) (j+1); j2 <= 'z'; j2++) {
					for (char k = (char) (j2+1); k <= 'z'; k++) {
						tree.put(""+i+j+j2+k+"", id++);	
					}				
				}				
			}
		}
		for (char i = 'a'; i <= 'z'; i++) {
			for (char j = (char) (i+1); j <= 'z'; j++) {
				for (char j2 = (char) (j+1); j2 <= 'z'; j2++) {
					for (char k = (char) (j2+1); k <= 'z'; k++) {
						for (char k2 = (char) (k+1); k2 <= 'z'; k2++) {
							tree.put(""+i+j+j2+k+k2+"", id++);	
//							System.out.println(i+""+j+j2+k+k2+"");
						}	
					}				
				}				
			}
		}
//		System.out.println(tree.containsKey("vwxyz"));
//		System.out.println(tree.toString());
		while(br.ready()){
			String cur = br.readLine();
			if(tree.containsKey(cur))
				System.out.println(tree.get(cur));
			else
				System.out.println("0");
		}
		
	}

}
