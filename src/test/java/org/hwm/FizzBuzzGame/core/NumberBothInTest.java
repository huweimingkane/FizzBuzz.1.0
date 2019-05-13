package org.hwm.FizzBuzzGame.core;

import static org.junit.Assert.*;

import org.hwm.FizzBuzzGame.service.Service;
import org.junit.Test;

public class NumberBothInTest {

	@Test
	public void testIsBothIn() {
		boolean res=Service.bothIn.isBothIn(35,Service.OFF_NUMBER_THREE,Service.OFF_NUMBER_FIVE);
		assertEquals(true, res);
	}

}
