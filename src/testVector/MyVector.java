package testVector;

public class MyVector {
	Object[] objArr;
	private int size;

	MyVector() {
		this(16);
	}

	MyVector(int capacity) {
		objArr = new Object[capacity];
	}

	//�ݺ��������� �޼ҵ� �θ��� ���� �� ������
	public void add(Object obj) {
		if (size == objArr.length) {
			Object[] tmp = new Object[objArr.length * 2];
			System.arraycopy(objArr, 0, tmp, 0, objArr.length);
			objArr = tmp;
		}
		objArr[size++] = obj;
	}
	

	public int size() {
		return size;
	}

	public int capacity() {
		return objArr.length;
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	@Override
	public String toString() {
		String str = "";
		for (int i = 0; i < size; i++) {
			str += objArr[i].toString() + " ";
		}
		return str;
	}

	public Object get(int index) {
		// 1. ��ȿ���˻�
		if (index < 0 || index > size) {
			System.out.println("���ڰ��� �߸��ƽ��ϴ�.");
			return null;
		}
		// 2. ���� ������ ������ �� ��ȯ
		if (objArr[index] == null)
			return null;
		else {
			return objArr[index];
		}
	}


	public int indexOf(Object obj) {
		// 1. ��� �迭�� ���Ƽ� ������ �ִٸ� �ε�����ȯ ������ ����
		for (int i = 0; i < size; i++) {
			if (objArr[i].equals(obj))
				return i;
		}
		// 2. ���� ������ ����
		return -1;
	}

	public boolean remove(Object obj) {
		int i; 
		
		// 1. obj���� ���� ���̸� false
		if (indexOf(obj) == -1)
			return false;
		
		// 2. ���ϴ� ��ü�� �ε��� ���� ��� ����
		i = indexOf(obj);
		objArr[indexOf(obj)] = null;
		
		// 3. ����� ����
		for (; i < size; i++) {
			objArr[i] = objArr[i + 1];
		}
		
		// 4. ������ ���� �� true��ȯ
		size--;
		return true;
	}

}
