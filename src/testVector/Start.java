package testVector;

public class Start {

	public static void main(String[] args) {
		MyVector mv = new MyVector();
		mv.add("������");
		mv.add("�强��");
		mv.add("������");
		mv.add("������");
		mv.add("������");
		mv.add("������");
		mv.add("������");
		mv.add("������");
		mv.add("������");
		mv.add("������");
		mv.add("������");
		mv.add("������");
		mv.add("������");
		mv.add("������");
		mv.add("������");
		mv.add("������");
		mv.add("������");
		mv.add("������");
		mv.add("������");
		mv.add("������");
		mv.add("������");
		mv.add("������");
		mv.add("������");
		
		System.out.println(mv.capacity());
		System.out.println(mv.size());
		System.out.println(mv.isEmpty());
		
		System.out.println(mv.get(mv.indexOf("������")));
		System.out.println(mv.indexOf("������"));
		System.out.println(mv.get(1));
		System.out.println(mv.toString());
		
		mv.remove("������");
		System.out.println(mv.remove("������"));
		System.out.println(mv.size());
		System.out.println(mv.get(mv.indexOf("������")));
		System.out.println(mv.toString());
		System.out.println(mv.indexOf("������"));
	}

}
