import java.util.*;
import java.io.*;

public class TheDecoder_458 {

	public static void main(String[] args) throws Exception {

		DataInputStream in = new DataInputStream(System.in);
		DataOutputStream out = new DataOutputStream(System.out);
		String line = in.readLine();
		while(!line.isEmpty()){
			for (int i = 0; i < line.length(); i++) {
				out.writeBytes( ((char)(line.charAt(i) - 7)) + "" );
			}
			out.writeBytes("\n");
			out.flush();
			line = in.readLine();
			if(line == null)
				line = "";
		}
		
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		while (br.ready()) {
//			String input = br.readLine();
////			if(input.isEmpty()){
////				System.out.println();
////				break;
////			}
//			for (int i = 0; i < input.length(); i++) {
//				if (input.charAt(i) != '\n' && input.charAt(i) != '\r')
//					System.out.print((char) (input.charAt(i) - 7));
//				else
//					System.out.print((char) (input.charAt(i)));
//			}
//			 System.out.println();
//		}
//		System.out.println();

	}

}
