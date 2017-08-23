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

	// �������̵�� ����ΰ� ���� ���븸 �޶���� ����!
	@Override
	public boolean equals(Object o) {
		// ��ü���� �ִµ� �������� �޶� ������ ����̶� �������� �ٲ������

		// o�� � ��ü���� ����°ž�
		if (!(o instanceof Point))
			return false;

		Point p = (Point) o;
		// ��ü�� null �̸� instanceof �� false����
		// if(p == null)
		// return false;

		// if(this.x == p.x && this.y == p.y)
		// return true;
		// else
		// return false;

		return this.x == p.x && this.y == p.y; // �� ��ü�� true false���� ��ȯ��
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
