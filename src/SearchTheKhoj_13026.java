import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SearchTheKhoj_13026 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = new Integer(br.readLine());
		int c = 1;
		while(T-- > 0){
			int N = new Integer(br.readLine());
			String [] a = new String[N];
			for (int i = 0; i < a.length; i++) {
				a[i] = br.readLine();
			}
			ArrayList<String> res = new ArrayList<>();
			String num = br.readLine();
			for (int i = 0; i < a.length; i++) {
				int diff = 0;
				for (int j = 0; j < a[i].length(); j++) {
					if(a[i].charAt(j) != num.charAt(j)){
						diff++;
						if(diff > 1)
							break;
					}
				}
				if(diff <= 1)
					res.add(a[i]);
			}
			System.out.println("Case " + c + ":");
			for (int i = 0; i < res.size(); i++) {
				System.out.println(res.get(i));
			}
			c++;
		}
		
	}

}
