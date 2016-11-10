import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Intersection_191 {

	static class Point {
		double x, y;

		public Point(double x, double y) {
			this.x = x;
			this.y = y;
		}
	}

	static class Line {

		static final double INF = 1e9, EPS = 1e-9;
		double a, b, c;

		public Line(Point p, Point q) {
			if (Math.abs(p.x - q.x) < EPS) {
				a = 1;
				b = 0;
				c = -p.x;
			} else {
				a = (p.y - q.y) / (q.x - p.x);
				b = 1.0;
				c = -(a * p.x + p.y);
			}
		}

		public Line(Point p, double m) {
			a = -m;
			b = 1;
			c = -(a * p.x + p.y);
		}

		public boolean parallel(Line l) {
			return Math.abs(a - l.a) < EPS && Math.abs(b - l.b) < EPS;
		}

		public boolean same(Line l) {
			return parallel(l) && Math.abs(c - l.c) < EPS;
		}

		public Point intersect(Line l) {
			if (parallel(l))
				return null;
			double x = (b * l.c - c * l.b) / (a * l.b - b * l.a);
			double y;
			if (Math.abs(b) < EPS)
				y = -l.a * x - l.c;
			else
				y = -a * x - c;
			return new Point(x, y);
		}

		public Point closestPoint(Point p) {
			if (Math.abs(b) < EPS)
				return new Point(-c, p.y);
			if (Math.abs(a) < EPS)
				return new Point(p.x, -c);
			return intersect(new Line(p, 1 / a));
		}

	}

	static int x_start;
	static int y_start;
	static int x_end;
	static int y_end;
	static int x_left;
	static int y_top;
	static int x_right;
	static int y_bottom;

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = new Integer(br.readLine());
		while (t-- > 0) {
			StringTokenizer s = new StringTokenizer(br.readLine());
			x_start = new Integer(s.nextToken());
			y_start = new Integer(s.nextToken());
			x_end = new Integer(s.nextToken());
			y_end = new Integer(s.nextToken());
			x_left = new Integer(s.nextToken());
			y_top = new Integer(s.nextToken());
			x_right = new Integer(s.nextToken());
			y_bottom = new Integer(s.nextToken());
			
			if(x_left > x_right){
				int tmp = x_left;
				x_left = x_right;
				x_right = tmp;
			}
			
			if(y_bottom > y_top){
				int tmp = y_top;
				y_top = y_bottom;
				y_bottom = tmp;
			}

			if ((x_start >= x_left && x_start <= x_right && y_start >= y_bottom && y_start <= y_top)
					|| (x_end >= x_left && x_end <= x_right && y_end >= y_bottom && y_end <= y_top)) {
				System.out.println("T");
//				 System.out.println("first check");
			} else {

				if (x_start != x_end || y_start != y_end) {

					Line l1 = new Line(new Point(x_left, y_top), new Point(x_right, y_top));
					Line l2 = new Line(new Point(x_left, y_bottom), new Point(x_right, y_bottom));
					Line l3 = new Line(new Point(x_left, y_bottom), new Point(x_left, y_top));
					Line l4 = new Line(new Point(x_right, y_bottom), new Point(x_right, y_top));
					Line l = new Line(new Point(x_start, y_start), new Point(x_end, y_end));

					// System.out.println("l.a: " + l.a + ", l.b: " + l.b + ",
					// l.c:
					// " + l.c);

					Point p1 = l.intersect(l1);
					Point p2 = l.intersect(l2);
					Point p3 = l.intersect(l3);
					Point p4 = l.intersect(l4);
					
//					if (p1 != null)
//						System.out.println("p1: " + p1.x + " " + p1.y);
//					else
//						System.out.println("null");
//					if (p2 != null)
//						System.out.println("p2: " + p2.x + " " + p2.y);
//					else
//						System.out.println("null");
//					if (p3 != null)
//						System.out.println("p3: " + p3.x + " " + p3.y);
//					else
//						System.out.println("null");
//					if (p4 != null)
//						System.out.println("p4: " + p4.x + " " + p4.y);
//					else
//						System.out.println("null");

					if ((inside(p1) && checkPoint(p1)) || (inside(p2) && checkPoint(p2)) || (inside(p3) && checkPoint(p3)) || (inside(p4) && checkPoint(p4))){
						System.out.println("T");
//						System.out.println("second check");
					}else
						System.out.println("F");
				}else
					System.out.println("F");
			}
//			if(!br.ready())
//				break;
		}

	}

	public static boolean inside(Point p) {
		if (p == null)
			return false;
		if (p.x >= x_left && p.x <= x_right && p.y >= y_bottom && p.y <= y_top)
			return true;
		return false;
	}
	
	public static double calculate_dis(Point p, Point a) {
		return Math.sqrt((p.x - a.x) * (p.x - a.x) + (p.y - a.y) * (p.y - a.y));
	}
	
	public static boolean checkPoint(Point p1){
		if(calculate_dis(p1, new Point(x_start, y_start)) + calculate_dis(p1, new Point(x_end, y_end)) == calculate_dis(new Point(x_start, y_start), new Point(x_end, y_end)))
			return true;
		return false;
	}

}
