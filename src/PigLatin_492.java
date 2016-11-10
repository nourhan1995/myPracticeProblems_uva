import java.util.*;
import java.io.*;

// presentation error
public class PigLatin_492 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String s = br.readLine();
			if (s.equals(""))
				break;
			String word = "";
			for (int i = 0; i < s.length(); i++) {
				if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'))
					word += s.charAt(i);
				else {
					if (!word.equals("")) {
						if (word.charAt(0) != 'a' && word.charAt(0) != 'e' && word.charAt(0) != 'i'
								&& word.charAt(0) != 'o' && word.charAt(0) != 'u' && word.charAt(0) != 'A'
								&& word.charAt(0) != 'E' && word.charAt(0) != 'I' && word.charAt(0) != 'O'
								&& word.charAt(0) != 'U') {
							word += word.charAt(0);
							word = word.substring(1);
						}
						System.out.print(word + "ay");
						word = "";
					}
					System.out.print(s.charAt(i));
				}
			}
			if (!word.equals("")) {
				if (word.charAt(0) != 'a' && word.charAt(0) != 'e' && word.charAt(0) != 'i' && word.charAt(0) != 'o'
						&& word.charAt(0) != 'u' && word.charAt(0) != 'A' && word.charAt(0) != 'E'
						&& word.charAt(0) != 'I' && word.charAt(0) != 'O' && word.charAt(0) != 'U') {
					word += word.charAt(0);
					word = word.substring(1);
				}
				System.out.print(word + "ay");
				word = "";
			}
			if (br.ready())
				System.out.print("\n");
		}

	}

}
