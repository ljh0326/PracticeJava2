package ch8;

public class Exception17 {

	public static void main(String[] args) {
		
		try {
			startInstall();
			deleteTempFiles();
		} catch (Exception e) {
			e.printStackTrace();
			deleteTempFiles();
		}
		
	}
	
	static void startInstall() {
		
	}
	
	static void deleteTempFiles() {
		
	}
}
