package ch3;

public class Exercise7 {
	public static void main(String[] args) {
		int fahrenheit = 100;
		float celcius = (float) 5 / 9 * (fahrenheit - 32);

		celcius *= 1000;
		if ((celcius) % 10 > 5)
			celcius += 10;
		celcius *= 0.1;
		
		
		System.out.println("Fahrenheit: " + fahrenheit);
		System.out.println("Celcius" + (int)celcius * 0.01f);
	}
}