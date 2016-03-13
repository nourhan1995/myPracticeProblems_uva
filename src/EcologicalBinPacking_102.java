import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class EcologicalBinPacking_102 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(br.ready()){
			StringTokenizer s = new StringTokenizer(br.readLine());
			int b1 = new Integer(s.nextToken());
			int g1 = new Integer(s.nextToken());
			int c1 = new Integer(s.nextToken());
			int b2 = new Integer(s.nextToken());
			int g2 = new Integer(s.nextToken());
			int c2 = new Integer(s.nextToken());
			int b3 = new Integer(s.nextToken());
			int g3 = new Integer(s.nextToken());
			int c3 = new Integer(s.nextToken());
			int [] arr = {'B', 'C', 'G'};
			char [] tmp = new char[arr.length];
			int min = (int) Math.pow(2, 31);
			int sum = 0;
			do {
				sum = 0;
				for (int i = 0; i < arr.length; i++) {
					if(arr[i] == 'B'){
						if(i+1 == 1){
							sum += b2 + b3;
						}else{
							if(i+1 == 2){
								sum += b1 + b3;
							}else{
								sum += b1 + b2;
							}
						}
					}else{
						if(arr[i] == 'C'){
							if(i+1 == 1){
								sum += c2 + c3;
							}else{
								if(i+1 == 2){
									sum += c1 + c3;
								}else{
									sum += c1 + c2;
								}
							}
						}else{
							if(i+1 == 1){
								sum += g2 + g3;
							}else{
								if(i+1 == 2){
									sum += g1 + g3;
								}else{
									sum += g1 + g2;
								}
							}
						}
					}
				}
				if(sum < min){
					min = sum;
					for (int i = 0; i < tmp.length; i++) {
						tmp[i] = (char) arr[i];
					} 
				}
			} while (nextPerm(arr));
			System.out.println("" + tmp[0] + tmp[1] + tmp[2] + " " + min);
		}

	}

	public static boolean nextPerm(int[] arr){
		int length = arr.length;
		int i = length - 2;
		for (; i >= 0; i--) {
			if (arr[i] < arr[i+1]){
				break;
			}
		}

		if (i == -1)
			return false;

		for (int j = length - 1; j > i; j--) {
			if (arr[j] > arr[i]){
				int tmp = arr[j];
				arr[j] = arr[i];
				arr[i] = tmp;
				break;
			}
		}

		int s = i+1;
		int e = length -1;

		while (s < e){
			int tmp = arr[s];
			arr[s] = arr[e];
			arr[e] = tmp;
			s++;
			e--;
		}

		return true;
	}

}
