import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

//wrong answer verdict
public class CD_624 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			StringTokenizer s = new StringTokenizer(br.readLine());
			int N = new Integer(s.nextToken());
			int m = new Integer(s.nextToken());
			int [] cds = new int [m];
			for (int i = 0; i < cds.length; i++) {
				cds[i] = new Integer(s.nextToken());
			}
			int max = 0;
			ArrayList<Integer> res = new ArrayList<>();
			for (int i = 0; i < cds.length; i++) {
				int sum = 0;
				ArrayList<Integer> tmp = new ArrayList<>();
				if(cds[i] <= N){
					sum = cds[i];
					tmp.add(cds[i]);
				}
				for (int j = 0; j < cds.length; j++) {
					if(i != j){
						if(sum + cds[j] <= N){
							sum += cds[j];
							tmp.add(cds[j]);
						}
					}
				}
				if(sum > max){
					max = sum;
					res = tmp;
				}
			}
			for (int i = 0; i < res.size(); i++) {
				System.out.print(res.get(i) + " ");
			}
			System.out.println("sum:" + max);
//			if(!br.ready())
//				break;
		}
		
	}

}
