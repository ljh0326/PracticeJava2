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

	//반복문에서는 메소드 부르면 성능 팍 떨어짐
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
		// 1. 유효성검사
		if (index < 0 || index > size) {
			System.out.println("인자값이 잘못됐습니다.");
			return null;
		}
		// 2. 값이 없으면 있으면 값 반환
		if (objArr[index] == null)
			return null;
		else {
			return objArr[index];
		}
	}


	public int indexOf(Object obj) {
		// 1. 모든 배열을 돌아서 같은게 있다면 인덱스반환 없으면 에러
		for (int i = 0; i < size; i++) {
			if (objArr[i].equals(obj))
				return i;
		}
		// 2. 값이 없으면 에러
		return -1;
	}

	public boolean remove(Object obj) {
		int i; 
		
		// 1. obj값이 없는 값이면 false
		if (indexOf(obj) == -1)
			return false;
		
		// 2. 원하는 객체의 인덱스 값을 얻고 삭제
		i = indexOf(obj);
		objArr[indexOf(obj)] = null;
		
		// 3. 빈공간 삭제
		for (; i < size; i++) {
			objArr[i] = objArr[i + 1];
		}
		
		// 4. 사이즈 감소 후 true반환
		size--;
		return true;
	}

}
