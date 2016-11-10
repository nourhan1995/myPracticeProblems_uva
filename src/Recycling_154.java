import java.io.*;
import java.util.*;

public class Recycling_154 {
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String input = br.readLine();
			if(input.charAt(0) == '#' ){
				break;
			}
			ArrayList<Hashtable<Character, Character>> map = new ArrayList<>();
			while(input.charAt(0) != 'e'){
				Hashtable<Character, Character> cur = new Hashtable<>();
				StringTokenizer s = new StringTokenizer(input, ",");
				while(s.hasMoreTokens()){
					String tmp = s.nextToken();
					cur.put(tmp.charAt(0), tmp.charAt(2));
				}
				map.add(cur);
				input = br.readLine();
			}
			int min = (int) 1e9;
			int [] misMatches = new int [map.size()];
			for (int i = 0; i < map.size(); i++) {
				int misses = 0;
				for (int j = 0; j < map.size(); j++) {
					if(j != i){
						Enumeration<Character> keys = map.get(i).keys();
						while(keys.hasMoreElements()){
							char cur = keys.nextElement();
							if(map.get(i).get(cur) != map.get(j).get(cur))
								misses++;
						}
					}
				}
				misMatches[i] = misses;
				min = Math.min(min, misses);
			}
			int index = 0;
//			System.out.println(Arrays.toString(misMatches));
			for (int i = 0; i < misMatches.length; i++) {
				if(misMatches[i] == min){
					index = i+1;
					break;
				}
			}
			System.out.println(index);
		}
		
	}

}
