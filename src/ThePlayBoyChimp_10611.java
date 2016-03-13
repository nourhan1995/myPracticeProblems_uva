import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class ThePlayBoyChimp_10611 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = new Integer(br.readLine());
		ArrayList<Integer> heights = new ArrayList<>();
		StringTokenizer s1 = new StringTokenizer(br.readLine());
		int i = 0;
		while(s1.hasMoreTokens()) {
//			System.out.println("i= " + i);
			int cur = new Integer(s1.nextToken());
			if(i == 0){
				heights.add(cur);
				i++;
			}else
				if(i-1 >= 0 && heights.get(i-1) != cur){
					heights.add(cur);
					i++;
				}

		}
		int Q = new Integer(br.readLine());
		StringTokenizer s = new StringTokenizer(br.readLine());
		while(Q-- > 0){
			int h = new Integer(s.nextToken());
			int start = 0;
			int end = heights.size()-1;
			int mid = start + (end - start)/2;
			boolean found = false;
			while(start <= end){
				if(heights.get(mid) == h){
					found = true;
					break;
				}else{
					if(heights.get(mid) < h)
						start = mid + 1;
					else{
						if(heights.get(mid) > h)
							end = mid - 1;
					}
				}
				mid = start + (end - start)/2;
			}
			StringBuilder res = new StringBuilder();
			if(found){
				if(mid - 1 >= 0)
					res.append(heights.get(mid - 1) + " ");
				else
					res.append("X " );
				if(mid + 1 < heights.size())
					res.append(heights.get(mid+1));
				else
					res.append("X");
			}else{
				if(start > end){
					if(end >= 0)
						res.append(heights.get(end) +" ");
					else
						res.append("X ");
					if(start < heights.size())
						res.append(heights.get(start));
					else
						res.append("X");
				}
			}
			System.out.println(res);
		}

	}

}
