package ch7;

import java.util.*;

public class Exercise22 {

	
	public static void main(String[] args) {
		
	}
}

class Circle extends Shape{
	double r = 0;
	
	@Override
	double calcArea() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

class Rectangle extends Shape{
	double width = 0;
	double height = 0;
	@Override
	double calcArea() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}

abstract class Shape{
	Point p;
	
	Shape(){
		this(new Point(0,0));
	}
	
	Shape(Point p){
		this.p = p;
	}
	
	abstract double calcArea();
	
	Point getPosition() {
		return p;
	}
	
	void setPosition(Point p) {
		this.p = p;
	}
}

class Point{
	int x;
	int y;
	
	Point(){
		this(0, 0);
	}
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "[" + x + ", " + y + "]";
	}
}

//24¹ø c d b 
