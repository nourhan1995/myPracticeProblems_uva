import java.util.*;
import java.io.*;

public class SecretResearch_621 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = new Integer(br.readLine());
		while(t-- > 0){
			String s = br.readLine();
			if(s.equals("1") || s.equals("4") || s.equals("78")){
				System.out.println("+");
			}else{
				if(s.charAt(s.length()-1 ) == '5' && s.charAt(s.length()-2) == '3')
					System.out.println("-");
				else{
					if(s.charAt(0) == '9' && s.charAt(s.length()-1) == '4')
						System.out.println("*");
					else
						if(s.charAt(0) == '1' && s.charAt(1) == '9' && s.charAt(2) == '0')
							System.out.println("?");
				}
			}
		}
		
	}

}
