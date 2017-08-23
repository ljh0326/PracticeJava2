package Point;

class Point {
	protected int x;
	protected int y;

	Point(int x, int y) {
		setX(x);
		setY(y);
	}

	Point() {
		this(1, 1);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[" + x + "," + y + "]";
	}

	// 오버라이드는 선언부가 같고 내용만 달라야해 주의!
	@Override
	public boolean equals(Object o) {
		// 객체에는 있는데 리모콘이 달라서 못쓰는 기능이라 리모콘을 바꿔줘야해

		// o가 어떤 객체인지 물어보는거야
		if (!(o instanceof Point))
			return false;

		Point p = (Point) o;
		// 객체가 null 이면 instanceof 값 false나옴
		// if(p == null)
		// return false;

		// if(this.x == p.x && this.y == p.y)
		// return true;
		// else
		// return false;

		return this.x == p.x && this.y == p.y; // 값 자체가 true false값을 반환함
	}

	double getDistance(Point p1) {
		return Math.sqrt((Math.pow((double) p1.x - this.x, 2) + Math.pow((double) p1.y - this.y, 2)));
	}

	double getDistance(Point p1, Point p2) {
		return Math.sqrt((Math.pow((double) p1.x - p2.x, 2) + Math.pow((double) p1.y - p2.y, 2)));
	}

	public int compareTo(Object o) {

		Point p = null;

		if (o instanceof Point)
			p = (Point) o;

		return Math.abs(((Point) o).x + ((Point) o).y - (this.x + this.y));

	}
}

class Point3D extends Point {

	private int z;

	Point3D(int x, int y, int z) {
		super(x, y);
		setZ(z);
	}

	Point3D() {
		this(1, 1, 1);
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + z + "]";
	}


}
