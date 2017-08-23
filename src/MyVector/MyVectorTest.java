package MyVector;

class MyVector{
	Object[] objArr = new Object[0];
	int size = 0;
	
	MyVector (int capacity){
		objArr = new Object[capacity];
	}
	
	MyVector() {
		this(16);
	}
	
	boolean add(Object obj) {
		//1. ������ ������ �ִ��� Ȯ��
		//2.1 ������ ������ ������, �����ϰ� true��ȯ
		//2.2 ������ ������ ������ ���ο� �迭�� ����]
		//2.2.1 ���� 2���� ũ�� �迭����
		//2.2.2 ���� ������ ����
		//2.2.3 objArr�� ���ο� �迭�� ����Ű���� ����
		//3. size�� ���� 1 ����
		
		if(objArr.length==size) {
			Object[] tmp = new Object[objArr.length*2];
			System.arraycopy(objArr, 0, tmp, 0, objArr.length);
			objArr = tmp;
		}
		
		objArr[size++] = obj;
		
		return true;
	}
	
	public String toString() {
		String tmp = ""; 
		
		for(int i = 0; i<size; i++) {
			tmp += objArr[i] + ",";
		}
		
		return tmp + "]";
	}
	
	//������ ��ü�� ��ü�迭���� ����
	Object remove(Object obj) {
		Object oldObj;
		
		//1.objArr���� obj�� ã�´�
		int idx = indexOf(obj);
		
		//2.1 ��ã����null��ȯ
		if(indexOf(obj) == -1)
			return null;
		//2.2 ã����, oldObj�� ����
		oldObj = objArr[idx];
		
		//2.2.1 arraycopy�� ������ ���Ե� ����
		//2.2.2 ������ ��ü�� null���� 
		
		if(idx!=size-1)
			System.arraycopy(objArr, idx+1, objArr, idx, size-1-idx);
		//3�������� ���� 1����
		objArr[size--] = null;
		
		return oldObj;
	}
	
	Object get(int index) {
		if(index < 0 || index >= objArr.length)
			throw new IllegalArgumentException("��ȿ���� ���� index");
		
		return objArr[index];
	}
	
	int indexOf(Object obj) {
		for (int i = 0; i <size; i++) {
			if(objArr[i].equals(obj))
				return i;
		}
		
		return -1;
	}
	
	int size() {return size; }
	int capacity() {return objArr.length; }
}

public class MyVectorTest {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyVector v = new MyVector();
		v.add("abc");
		v.add("abc");
		v.add("abc");
		System.out.println(v.toString());
	}

}
