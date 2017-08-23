package Point;

public class PointTest2 {

	public static void main(String[] args) {
		Point p = new Point(3,5);
		Point p1 = new Point(10,5);
		Point p2 = new Point(10,10);
		Point p3 = new Point(10,10);
		Point3D p4 = new Point3D(3,5,2);
		
		
		System.out.println(p.toString());
		System.out.println(p1.toString());
		System.out.println(p.getDistance(p2));
		System.out.println(p.getDistance(p, p1));
		System.out.println(p.equals(p2));
		System.out.println(p2.equals(p3));
		
		
		System.out.println(p4.toString());
	}

}
