package ch9;

public class Operator9 {

	// �������� ��������
	public static void main(String[] args) {
			
	}

}

class Circle implements Cloneable {
	Point p;
	double r;

	Circle(Point p, double r) {
		this.p = p;
		this.r = r;
	}

	public Circle shallowCopy() {// ���� ����
		Object obj = null;

		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
		}

		return (Circle) obj;
	}

	public Circle deepCopy() {
		Object obj = null;

		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {

		}
		Circle c = (Circle) obj;
		c.p = new Point(this.p.x, this.p.y);

		return c;
	}
	//tostirng �������̵��� �����ۼ�
}

class Point {
	int x, y;

	Point() {
		this(1, 1);
	}

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "(" + x + ", " + y + ")";
	}
}

