import java.io.BufferedReader;
import java.io.*;

// time limit exceeded 
// optimization needed
public class QuirksomeSquares_256 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (br.ready()) {
			int n = new Integer(br.readLine());
			if (n == 2) {
				System.out.println("00\n01\n81");
			} else {
				if (n == 4) {
					System.out.println("0000\n0001\n2025\n3025\n9801");
				} else {
					if (n == 6) {
						System.out.println("000000\n000001\n088209\n494209\n998001");
					} else {
						System.out.println("00000000\n00000001\n04941729\n07441984\n24502500\n25502500\n52881984\n60481729\n99980001");
					}
				}
			}
		}

	}

}
