package org.hwm.FizzBuzzGame.core;

import static org.junit.Assert.*;

import org.hwm.FizzBuzzGame.service.Service;
import org.junit.Test;

public class NumberIsInTest {

	@Test
	public void testIsHasSelf() {
		boolean res=Service.HAS_SELF.isHasSelf(39,Service.OFF_NUMBER_THREE);
		assertEquals(true, res);
	}

}
