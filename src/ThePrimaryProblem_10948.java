import java.io.*;
import java.util.*;

// to be continued
public class ThePrimaryProblem_10948 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int [] primes = new int [1000001];
		boolean [] isNotPrime = new boolean[1000001];
		for (int i = 1; i < primes.length; i++) {
			primes[i] = i;
		}
		for (int i = 2; i <= 1000; i++) {
			for (int j = i+1; j < isNotPrime.length; j++) {
				if(isNotPrime[j])
					continue;
				else{
					if(j % i == 0)
						isNotPrime[j] = true;
				}
			}
		}
		System.out.println(Arrays.toString(primes));
		System.out.println(Arrays.toString(isNotPrime));
//		while(true){
//			int n = new Integer(br.readLine());
//			if(n == 0)
//				break;
//		}
		
	}

}
