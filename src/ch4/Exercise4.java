package ch4;

public class Exercise4 {

	public static void main(String[] args) {
		int i = 1, sum = 0, tmp;

		while (true) {
			if (sum >= 100)
				break;

			tmp = i % 2 == 0 ? -i : i;
			sum += tmp;
			i++;
		}

		System.out.println(i);
	}
}
