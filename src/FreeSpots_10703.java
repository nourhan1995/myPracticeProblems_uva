import java.io.*;
import java.util.*;

public class FreeSpots_10703 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean map[][] = new boolean[500][500];
		while (true) {
			StringTokenizer l = new StringTokenizer(br.readLine());
			int W = new Integer(l.nextToken());
			int H = new Integer(l.nextToken());
			int N = new Integer(l.nextToken());
			if (W == 0 && H == 0 && N == 0)
				break;
			else {
				// boolean map[][] = new boolean[H][W];
				for (int i = 0; i < map.length; i++) {
					Arrays.fill(map[i], false);
				}
				for (int i = 0; i < N; i++) {
					StringTokenizer s = new StringTokenizer(br.readLine());
					int x1 = (new Integer(s.nextToken())) - 1;
					int y1 = (new Integer(s.nextToken())) - 1;
					int x2 = (new Integer(s.nextToken())) - 1;
					int y2 = (new Integer(s.nextToken())) - 1;
					int j = 0;
					int j2 = 0;
					if (x1 < x2) {
						for (j = x1; j <= x2; j++) {
							if (y1 < y2) {
								for (j2 = y1; j2 <= y2; j2++) {
									map[j2][j] = true;
								}
							} else {
								for (j2 = y2; j2 <= y1; j2++) {
									map[j2][j] = true;
								}
							}
						}
					} else {
						for (j = x2; j <= x1; j++) {
							if (y1 < y2) {
								for (j2 = y1; j2 <= y2; j2++) {
									map[j2][j] = true;
								}
							} else {
								for (j2 = y2; j2 <= y1; j2++) {
									map[j2][j] = true;
								}
							}
						}
					}
				}
				br.readLine();
				int count = 0;
				for (int j = 0; j < H; j++) {
					for (int j2 = 0; j2 < W; j2++) {
						if (!map[j][j2])
							count++;
					}
				}
				if (count == 0)
					System.out.println("There is no empty spots.");
				else {
					if (count == 1)
						System.out.println("There is one empty spot.");
					else
						System.out.println("There are " + count + " empty spots.");
				}
			}
		}

	}

}
