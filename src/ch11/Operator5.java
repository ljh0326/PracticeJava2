package ch11;

import java.util.*;

public class Operator5 {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList(200000);
		LinkedList l1 = new LinkedList();
		
		System.out.println("���������� �߰��ϱ�");
		System.out.println("ArrayList :" +add1(a1));
		System.out.println("LinkedList :" +add1(l1));
		System.out.println();
		System.out.println("�߰����� �߰��ϱ�");
		System.out.println("ArrayList :" +add2(a1));
		System.out.println("LinkedList :" +add2(l1));
		System.out.println();
		System.out.println("�߰����� �����ϱ�");
		System.out.println("ArrayList :" + remove2(a1));
		System.out.println("LinkedList :" + remove2(l1));
		System.out.println();
		System.out.println("���������� �����ϱ�");
		System.out.println("ArrayList :" + remove1(a1));
		System.out.println("LinkedList :" + remove1(l1));
	}
	
	public static long add1(List list) {
		long start = System.currentTimeMillis();
		for(int i = 0; i < 1000000; i++)
			list.add(i + "");
		long end = System.currentTimeMillis();
		return end = start;
	}
	
	public static long add2(List list) {
		long start = System.currentTimeMillis();
		for(int i = 0; i < 10000; i++) list.add(500, "X");
		long end = System.currentTimeMillis();
		return end - start;
	}
	
	public static long remove1(List list) {
		long start = System.currentTimeMillis();
		for(int i = list.size()-1; i >= 0; i--)
			list.remove(i);
		long end = System.currentTimeMillis();
		return end - start;
	}
	
	public static long remove2(List list) {
		long start = System.currentTimeMillis();
		for(int i = 0; i < 10000; i++) list.remove(i);
		long end = System.currentTimeMillis();
		return end - start;
	}
}
