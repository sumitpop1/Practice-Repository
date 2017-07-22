package test.rahul;

import static org.junit.Assert.*;

import org.junit.Test;

public class AdditionTest {

	@Test
	public void test() {
		Addition add = new Addition(3, 5);
		add.additionWOThird();
		assertEquals(5, add.getA());
		assertEquals(3, add.getB());
	}

}
