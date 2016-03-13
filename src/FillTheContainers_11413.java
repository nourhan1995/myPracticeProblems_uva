import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class FillTheContainers_11413 {

	static int [] capacity;
	static int n, m;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(br.ready()){
			StringTokenizer s1 = new StringTokenizer(br.readLine());
			n = new Integer(s1.nextToken());
			m = new Integer(s1.nextToken());
			//			System.out.println(n +" " + m);
			capacity = new int [n];
			int value = 0;
			Arrays.fill(capacity, 0);
			StringTokenizer s = new StringTokenizer(br.readLine());
			int sum = 0;
			for (int i = 0; i < capacity.length; i++) {
				capacity[i] = new Integer(s.nextToken());
				sum += capacity[i];
			}
			int lo = 0;
			int hi = n*sum;
			while(lo <= hi){
				int mid = lo +(hi - lo)/2;
				if(check(mid)){
					value = mid;
					hi = mid - 1;
				}else
					lo = mid + 1;
			}
			System.out.println(value);
			//			if(m > n){
			//				int i = 0;
			//				int max = 0;
			//				while(s.hasMoreTokens()){
			//					capacity[i++] = new Integer(s.nextToken());
			//					if(i > 0 && capacity[i-1] > max)
			//						max = capacity[i-1];
			//				}
			//				System.out.println(max);
			//			}else{
			//				for (int i = 0; i < capacity.length; i++) {
			//					capacity[i] = new Integer(s.nextToken());
			//					if(i > 0)
			//						capacity[i] += capacity[i-1];
			//				}
			//				System.out.println(Arrays.toString(capacity));
			//				int lo = 0;
			//				int hi = capacity.length - 1;
			//				while(lo <= hi){
			//					int mid = lo + (hi - lo)/2;
			//					//					System.out.println(capacity[mid]);
			//					if(checkMin(mid)){
			//						value = capacity[mid];
			//						lo = mid + 1;
			//					}else
			//						hi = mid - 1;
			//				}
			//				System.out.println(value);
			//			}
		}
	}

	public static boolean check(int c){
		int i = 0;
		int [] container  = new int[m];
		int j = 0;
		for (j = 0; j < capacity.length && i < container.length; j++) {
			if(container[i]+capacity[j] <= c)
				container[i] += capacity[j];
			else{
				i++;
				j--;
				if(i == container.length){
					break;
				}
			}
		}
		if(j < capacity.length && i == container.length)
			return false;
		else
			return true;
		//		int [] a = new int [m];
		//		int j = 0;
		//		for (int i = c; i < capacity.length; i++) {

		//			if(j < a.length){
		//				a[j] = capacity[i];
		//				if(i > c)
		//					a[j] -= capacity[i-1];
		//				j++;
		//			}else
		//				break;
		//		}
		//		System.out.println(Arrays.toString(a));
		//		for (int i = 0; i < a.length; i++) {
		//			if(a[i] == 0)
		//				return false;
		//		}
//		return true;
	}


}
