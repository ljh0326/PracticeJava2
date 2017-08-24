package ch11;

import java.util.*;

public class Operator12 {

	public static void main(String[] args) {
		Queue pq = new PriorityQueue();
		pq.offer('b'); //¿ÀÅä ¹Ú½Ì
		pq.offer('f');
		pq.offer('c');
		pq.offer('d');
		pq.offer('e');
		
		System.out.println(pq);
		Object obj = null;
		
		while((obj = pq.poll()) != null)
			System.out.println(obj);
		
		
	}
}
