package ch9;

public class Operator9 {

	// 깊은복사 얕은복사
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

	public Circle shallowCopy() {// 얕은 복사
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
	//tostirng 오버라이딩과 메인작성
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

