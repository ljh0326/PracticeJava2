package ch3;

public class Exercise1 {
	public static void main(String[] args) {
		int numOfApples = 123;
		int sizeOfBucket = 10;
		int numOfBucket = 0; 
		
		if(numOfApples%sizeOfBucket == 0)
			numOfBucket = numOfApples/sizeOfBucket;
		else
			numOfBucket = numOfApples/sizeOfBucket + 1;
		
		System.out.println("필요한 바구니의 수 : "+numOfBucket);
	}
}
