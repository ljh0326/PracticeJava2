package BaseBallGame;

import static org.junit.Assert.*;

import org.junit.Test;



public class BasBallTest {
	
	@Test()
	public void checktest() {
		BaseBallGame bg = new BaseBallGame();
		
		bg.src = new int[]{3, 5, 7};
		bg.tag = new int[] {5, 7, 3};
		
		
		assertTrue(bg.check(bg.src, bg.tag).equals("�� : 3 ��Ʈ����ũ : 0"));
		assertTrue(bg.check(new int[] {3,5,7}, new int[] {3,5,7}).equals("�� : 0 ��Ʈ����ũ : 3"));
		assertTrue(bg.check(new int[] {3,5,7}, new int[] {3,5,5}).equals("�� : 0 ��Ʈ����ũ : 3"));
	}

}
