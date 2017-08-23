package ch11;

import java.util.*;

public class Operator27 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		
		String from = "b";
		String to = "d";
		
		set.add("abc"); set.add("alien"); set.add("bat");
		set.add("car"); set.add("Car"); set.add("disc");
		set.add("dance"); set.add("dzzzz"); set.add("dZZZZ");
		set.add("elephant"); set.add("elevator"); set.add("fan");
		set.add("flower");
		
		System.out.println(set);
		System.out.println(from + " " +to);
		System.out.println(set.subSet(from, to));
		System.out.println(set.subSet(from,  to + "zzz"));
	}
}
