package ch6;

public class Exercise6 {
	//두점 (x,y)와 (x1,y1)간의 거리를 구한다.

	public static void main(String[] args) {
		MyPoint p = new MyPoint(1,1);
		System.out.println(p.getDistance(2, 2));
		
	}

}

class MyPoint {
	int x;
	int y;
	
	MyPoint(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	MyPoint(){
		this(1,1);
	}
	
	double getDistance(int x, int y) {
		return Math.sqrt((Math.pow((double)this.x - x, 2) + Math.pow((double)this.y - y, 2)));
	}
}