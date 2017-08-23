package ch11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Operator18 {

	public static void main(String[] args) {
		String[] strArr = { "cat", "Dog", "lion", "tiger" };

		Arrays.sort(strArr);
		System.out.println(Arrays.toString(strArr));

		Arrays.sort(strArr, new Descending());
		System.out.println(Arrays.toString(strArr));

		Arrays.sort(strArr, new stringLeng());
		System.out.println(Arrays.toString(strArr));
	}
}

class Descending implements Comparator {
	public int compare(Object o1, Object o2) {
		if (o1 instanceof Comparable && o2 instanceof Comparable) {
			String c1 = (String) o1;
			String c2 = (String) o2;
			return c1.compareTo(c2) * -1;
		}
		return -1;
	}
}

class stringLeng implements Comparator {
	int num1;
	int num2;

	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof String && o2 instanceof String)
		{
			num1 = ((String)o1).length();
			num2 =((String)o2).length();
		}
			
		return num1-num2;
	}
}