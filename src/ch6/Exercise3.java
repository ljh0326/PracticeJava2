package ch6;

public class Exercise3 {

	public static void main(String[] args) {
		Student s = new Student();
		s.name = "È«±æµ¿";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("ÀÌ¸§:" + s.name);
		System.out.println("ÃÑÁ¡:" + s.getTotal());
		System.out.println("Æò±Õ:" + s.getAverage());
		System.out.println(s.info());
	}

}

class Student{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	Student(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	Student(){
		this(" ", 1, 1, 1, 1, 1);
	}
	int getTotal() {
		return kor + eng + math;
	}
	
	float getAverage() {
		return Math.round((float)getTotal()/3*10)/10f;
	}
	
	String info() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math +
				"," + getTotal() + "," + getAverage();
	}
}