import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ReverseAndAdd_10018 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = new Integer(br.readLine());
		while(n > 0){
			String input = br.readLine();
			long sum = 0;
			long first = new Long(input);
			long second = new Long(reverse(input));
			int c = 0;
			do{
				sum = first + second;
				first = sum;
				second = new Long(reverse(""+sum));
				c++;
			}while(!checkPalindrome(sum+""));
			System.out.println(c +" " + sum);
			n--;
		}

	}

	public static String reverse(String s ){
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev += s.charAt(i);
		}
		return rev;
	}

	public static boolean checkPalindrome(String s){
		int j = s.length() - 1;
		for (int i = 0; i <= j; i++) {
			if(s.charAt(i) != s.charAt(j)){
				return false;
			}
			j--;
		}
		return true;
	}

}
