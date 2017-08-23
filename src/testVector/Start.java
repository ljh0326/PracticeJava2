package testVector;

public class Start {

	public static void main(String[] args) {
		MyVector mv = new MyVector();
		mv.add("¿Ã¡§»∆");
		mv.add("¿Âº∫ºˆ");
		mv.add("¿Ã¡§»∆");
		mv.add("¿Ã¡§»∆");
		mv.add("¿Ã¡§»∆");
		mv.add("¿Ã¡§»∆");
		mv.add("¿Ã¡§»∆");
		mv.add("¿Ã¡§»∆");
		mv.add("¿Ã¡§»∆");
		mv.add("¿Ã¡§»∆");
		mv.add("¿Ã¡§»∆");
		mv.add("¿Ã¡§»∆");
		mv.add("¿Ã¡§»∆");
		mv.add("¿Ã¡§»∆");
		mv.add("¿Ã¡§»∆");
		mv.add("¿Ã¡§»∆");
		mv.add("¿Ã¡§»∆");
		mv.add("¿Ã¡§»∆");
		mv.add("¿Ã¡§»∆");
		mv.add("¿Ã¡§»∆");
		mv.add("¿Ã¡§»∆");
		mv.add("¿Ã¡§»∆");
		mv.add("¿Ã¡§»∆");
		
		System.out.println(mv.capacity());
		System.out.println(mv.size());
		System.out.println(mv.isEmpty());
		
		System.out.println(mv.get(mv.indexOf("¿Ã¡§»∆")));
		System.out.println(mv.indexOf("¿Ã¡§»∆"));
		System.out.println(mv.get(1));
		System.out.println(mv.toString());
		
		mv.remove("¿Ã¡§»∆");
		System.out.println(mv.remove("¿Ã¡§»∆"));
		System.out.println(mv.size());
		System.out.println(mv.get(mv.indexOf("¿Ã¡§»∆")));
		System.out.println(mv.toString());
		System.out.println(mv.indexOf("¿Ã¡§»∆"));
	}

}
