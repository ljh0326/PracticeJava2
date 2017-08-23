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
		//1. 저장할 공간이 있는지 확인
		//2.1 저장할 공간이 있으면, 저장하고 true반환
		//2.2 저장할 공간이 없으면 새로운 배열을 생성]
		//2.2.1 기존 2배의 크기 배열생성
		//2.2.2 기존 내용을 복사
		//2.2.3 objArr이 새로운 배열을 가리키도록 변경
		//3. size의 값을 1 증가
		
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
	
	//지정된 객체를 객체배열에서 삭제
	Object remove(Object obj) {
		Object oldObj;
		
		//1.objArr에서 obj를 찾는다
		int idx = indexOf(obj);
		
		//2.1 못찾으면null반환
		if(indexOf(obj) == -1)
			return null;
		//2.2 찾으면, oldObj에 저장
		oldObj = objArr[idx];
		
		//2.2.1 arraycopy로 이후의 개게들 복사
		//2.2.2 마지막 객체에 null저장 
		
		if(idx!=size-1)
			System.arraycopy(objArr, idx+1, objArr, idx, size-1-idx);
		//3사이즈의 값을 1감소
		objArr[size--] = null;
		
		return oldObj;
	}
	
	Object get(int index) {
		if(index < 0 || index >= objArr.length)
			throw new IllegalArgumentException("유효하지 않은 index");
		
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
